package com.czg.service;

import com.czg.mapper.GuestMapper;
import com.czg.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = {"guest"})
// 做公共设置----缓存名称
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestMapper mapper;

    @Override
    public List<Guest> list() {
        return mapper.list();
    }

    /**
     * @Cacheable注解 作用在方法上，触发缓存读取操作
     * cacheNames 缓存的名称，必须指定至少一个
     * key 缓存的key，可以为空，如果指定要按照SpEL表达式编写，如果不指定，则缺省按照方法的所有参数进行组合
     * condition 缓存的条件，可以为空，使用SpEL编写，返回true或者false，只有为true才进行缓存(满足此条件，缓存生效)
     * unless 作用与condition正相反(满足此条件，缓存不生效)
     * @param id
     * @return
     */
    @Cacheable(/*cacheNames = "guest", */key = "#id", condition = "#id>1")
    @Override
    public Guest getGuestById(int id) {
        return mapper.getGuestById(id);
    }

    /**
     * @CachePut注解 作用在方法上，触发缓存更新操作
     * 拿到参数key的两种方式  参数的id or 结果的id
     * @param guest
     * @return
     */
    @CachePut(/*cacheNames = "guest", */key = "#guest.id")
    @Override
    public Guest updateGuest(Guest guest) {
        mapper.UpdateGuest(guest);
        return guest;
    }

    /**
     * @CacheEvict注解 作用在方法上，触发缓存删除操作
     * allEntries 可以删除此cacheNames对应的cache里所有的缓存
     * beforeInvocation 默认为false，若设置为true，则在方法执行前删除缓存
     * @param id
     */
    @CacheEvict(/*cacheNames = "guest", */key = "#id")
    @Override
    public void deleteGuest(Integer id) {
        mapper.deleteGuest(id);
    }

    @CacheEvict(/*cacheNames = "guest", */allEntries = true, beforeInvocation = true)
    @Override
    public void delete() {
        mapper.delete();

        // 程序执行到这会出错，这时候数据库数据删除了，但是缓存没有删除
        // 可以通过beforeInvocation属性将删除缓存操作放到方法执行前执行
        int result = 1 / 0;
    }
}

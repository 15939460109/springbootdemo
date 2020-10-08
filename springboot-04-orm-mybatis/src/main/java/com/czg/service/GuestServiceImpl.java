package com.czg.service;

import com.czg.mapper.GuestMapper;
import com.czg.mapper2.GuestMapper2;
import com.czg.model.Guest;
import com.czg.tk.mapper.TKGuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestMapper2 mapper2;

    @Autowired
    private GuestMapper mapper;
//    @Autowired
//    private GuestDao guestDao;
//    @Autowired
//    private TKGuestMapper guestMapper;

    @Override
    public List<Guest> list() {
        return mapper2.list();
//        return guestDao.list();
//        return guestMapper.selectAll();
    }
}

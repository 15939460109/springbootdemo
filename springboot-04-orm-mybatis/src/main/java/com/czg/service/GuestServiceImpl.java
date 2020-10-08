package com.czg.service;

import com.czg.dao.GuestDao;
import com.czg.mapper.GuestMapper;
import com.czg.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

//    @Autowired
//    private GuestMapper mapper;
    @Autowired
    private GuestDao guestDao;

    @Override
    public List<Guest> list() {
//        return mapper.list();
        return guestDao.list();
    }
}

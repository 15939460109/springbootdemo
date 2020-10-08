package com.czg.service;

import com.czg.model.Guest;
import com.czg.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestRepository repository;

    @Override
    public List<Guest> list() {
        return repository.findAll();
    }
}

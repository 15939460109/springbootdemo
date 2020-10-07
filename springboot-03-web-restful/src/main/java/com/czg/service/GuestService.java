package com.czg.service;

import com.czg.bean.Guest;

import java.util.List;

public interface GuestService {

    /**
     * 获取所有的Guest
     * @return
     */
    List<Guest> list();

    void add(Guest guest);

    void update(Guest guest);

    void delete(String name);
}

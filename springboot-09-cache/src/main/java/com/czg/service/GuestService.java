package com.czg.service;

import com.czg.model.Guest;

import java.util.List;

public interface GuestService {

    List<Guest> list();

    Guest getGuestById(int id);

    /**
     * 使用缓存时，会将方法的返回值放入缓存中
     * 因此返回值应该是Guest，而不是原来的void或int
     * @param guest
     * @return
     */
    Guest updateGuest(Guest guest);

    void deleteGuest(Integer id);

    void delete();
}

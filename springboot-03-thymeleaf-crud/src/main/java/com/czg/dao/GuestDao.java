package com.czg.dao;

import com.czg.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao {

    private static List<Guest> guestList = new ArrayList<Guest>();

    static {
        guestList.add(new Guest("黄晓明", "店长"));
        guestList.add(new Guest("秦海璐", "财务"));
        guestList.add(new Guest("林述巍", "主厨"));
        guestList.add(new Guest("杨紫", "大堂经理"));
        guestList.add(new Guest("王鹤棣", "帮厨"));
    }

    public List<Guest> list() {
        return guestList;
    }

    public void add(Guest guest) {
        guestList.add(guest);
    }

    public void update(Guest newGuest) {
        Guest oldGuest = get(newGuest.getName());
        oldGuest.setRole(newGuest.getRole());
    }

    public Guest get(String name) {
        for (Guest guest:guestList) {
            if (guest.getName().equals(name)) {
                return guest;
            }
        }
        return new Guest();
    }

    public void delete(Guest guest) {
        guestList.remove(get(guest.getName()));
    }
}

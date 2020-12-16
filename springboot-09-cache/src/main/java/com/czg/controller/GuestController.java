package com.czg.controller;

import com.czg.model.Guest;
import com.czg.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping
    public List<Guest> list() {
        return guestService.list();
    }

    @GetMapping("/{id}")
    public Guest guest(@PathVariable(name = "id") int id) {
        return guestService.getGuestById(id);
    }

    @GetMapping("/update")
    public Guest updateGuest(Integer id, String name, String role) {
        Guest guest = new Guest(id, name, role);
        return guestService.updateGuest(guest);
    }

    @GetMapping("/delete/{id}")
    public String deleteGuest(@PathVariable("id") Integer id) {
        guestService.deleteGuest(id);
        return "Success";
    }

    @GetMapping("/delete")
    public String delete() {
        guestService.delete();
        return "Success";
    }

}

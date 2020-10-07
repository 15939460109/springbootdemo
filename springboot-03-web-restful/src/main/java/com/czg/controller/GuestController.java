package com.czg.controller;

import com.czg.bean.Guest;
import com.czg.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping
    public String list(Model model) {
        List<Guest> guestList = guestService.list();
        model.addAttribute("guestList", guestList);
        return "list";
    }

    @GetMapping("/toAdd")
    public String toAdd() {
        return "add";
    }

    @PostMapping("/add")
    public String add(Guest guest) {
        guestService.add(guest);
        return "redirect:/guest";
    }

    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model, @PathVariable("name") String name) {
        model.addAttribute("guest", new Guest(name, ""));
        return "update";
    }

    @PutMapping("/update")
    public String update(Guest guest) {
        guestService.update(guest);
        return "redirect:/guest";
    }

    @DeleteMapping("/delete/{name}")
    public String delete(@PathVariable("name") String name) {
        guestService.delete(name);
        return "redirect:/guest";
    }
}

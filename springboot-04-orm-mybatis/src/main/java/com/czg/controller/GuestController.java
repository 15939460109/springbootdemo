package com.czg.controller;

import com.czg.model.Guest;
import com.czg.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}

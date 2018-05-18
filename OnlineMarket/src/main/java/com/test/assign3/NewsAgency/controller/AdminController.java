package com.test.assign3.NewsAgency.controller;


import com.test.assign3.NewsAgency.services.AdminService;
import com.test.assign3.NewsAgency.services.WriterService;
import javafx.beans.Observable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class AdminController {


    @Autowired
    private WriterService writerService;


    @RequestMapping(value = "/adminPage", method = RequestMethod.POST)
    public String loginPage(Model model, @RequestParam String username, @RequestParam String password) {

        writerService.register(username, password);


        return "redirect:/read";
    }

}

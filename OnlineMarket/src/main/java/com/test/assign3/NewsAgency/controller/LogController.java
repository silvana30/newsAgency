package com.test.assign3.NewsAgency.controller;


import com.test.assign3.NewsAgency.model.Admin;
import com.test.assign3.NewsAgency.model.Writer;
import com.test.assign3.NewsAgency.services.AdminService;
import com.test.assign3.NewsAgency.services.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.NoSuchElementException;

@Controller
public class LogController {
    @Autowired
    private WriterService writerService;
    @Autowired
    private AdminService adminService;

    /*@Autowired
    public LogController(WriterService writerService, AdminService adminService) {
        this.writerService = writerService;
        this.adminService = adminService;
    }*/

    @RequestMapping(value = "/loginPage", method = RequestMethod.POST)
    public String loginPage(Model model, @RequestParam String username, @RequestParam String password) {
        String returnedView = "";


        Admin user = adminService.login(username, password);

        if (user == null) {
            //returnedView = "redirect:/home/"+username;
            Writer writer = writerService.login(username, password);
            if (writerService.login(username, password) != null) {
                //returnedView = "redirect:/home/"+username;
                //returnedView = "writerPage";
                returnedView="addArticle";
                model.addAttribute("msg", "OK");}



        }
        else {
            returnedView = "adminPage";
            model.addAttribute("msg", "OK");
            //returnedView = "read";
        }


        return returnedView;
    }
}

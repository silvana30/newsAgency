package com.test.assign3.NewsAgency.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.assign3.NewsAgency.model.Admin;
import com.test.assign3.NewsAgency.model.Writer;
import com.test.assign3.NewsAgency.services.AdminService;
import com.test.assign3.NewsAgency.services.WriterService;
import javafx.beans.Observable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Observer;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private WriterService writerService;
    /*@RequestMapping(value = "/loginPage", method = RequestMethod.POST)
    public String hello(@RequestParam String username, @RequestParam String password, Model model){
        model.addAttribute("myUser",username);
        return "demo";
    }*/

    @RequestMapping(value = "/adminPage", method = RequestMethod.POST)
    public String loginPage(Model model, @RequestParam String username, @RequestParam String password) {

        writerService.register(username, password);
       /* ObjectMapper obj=new ObjectMapper();
        try {
            obj.writeValueAsString(writerService.register(username, password));
            model.addAttribute("json", obj.writeValueAsString(writerService.register(username, password)));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }*/


        return "redirect:/read";
    }



    /*@PostMapping("/adminPage")
    public String register(@ModelAttribute("writer") Writer writer, HttpServletRequest request) {

            request.setAttribute("writer", writer);



        if (writer != null) {
            writerService.save(writer);
        }
        return "redirect:/read";
    }*/
}

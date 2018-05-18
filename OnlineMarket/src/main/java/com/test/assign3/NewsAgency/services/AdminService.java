package com.test.assign3.NewsAgency.services;


import com.test.assign3.NewsAgency.model.Admin;
import com.test.assign3.NewsAgency.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Observable;

@Service
public class AdminService extends Observable {
    @Autowired
    private AdminRepository adminRepository;

    public Admin login(String username, String password) {
        this.notifyObservers("logged");
        return adminRepository.findByUsernameAndPassword(username, password);


    }

}

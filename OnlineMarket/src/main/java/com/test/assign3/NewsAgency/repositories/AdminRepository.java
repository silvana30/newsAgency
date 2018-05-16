package com.test.assign3.NewsAgency.repositories;


import com.test.assign3.NewsAgency.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {

    Admin findByUsernameAndPassword(String username,String password);
}

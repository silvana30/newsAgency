package com.test.assign3.NewsAgency.repositories;


import com.test.assign3.NewsAgency.model.Writer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WriterRepository extends JpaRepository<Writer,Integer> {

    Writer findByUsernameAndPassword(String username,String password);


}

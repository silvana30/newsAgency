package com.test.assign3.NewsAgency;

import com.test.assign3.NewsAgency.model.Admin;
import com.test.assign3.NewsAgency.model.Writer;
import com.test.assign3.NewsAgency.repositories.AdminRepository;
import com.test.assign3.NewsAgency.repositories.WriterRepository;
import com.test.assign3.NewsAgency.services.WriterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewsAgencyApplication {


	public static void main(String[] args) {


		SpringApplication.run(NewsAgencyApplication.class, args);


	}
}

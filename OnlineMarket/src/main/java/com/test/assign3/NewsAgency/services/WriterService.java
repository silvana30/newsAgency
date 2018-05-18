package com.test.assign3.NewsAgency.services;

import com.test.assign3.NewsAgency.model.Writer;
import com.test.assign3.NewsAgency.repositories.WriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Observable;

@Service
public class WriterService extends Observable {

    @Autowired
    private WriterRepository writerRepository;

    public Writer login(String username, String password) {
        setChanged();
        notifyObservers("logged");
        return writerRepository.findByUsernameAndPassword(username, password);

    }

    public Writer register(String username, String password) {
        Writer writer = new Writer(username, password);
        writerRepository.save(writer);
        return writer;
    }

    public void save(Writer writer) {
        writerRepository.save(writer);
        notifyObservers();
    }
}

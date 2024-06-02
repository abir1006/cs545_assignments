package miu.example.Lab4.services;

import miu.example.Lab4.entities.Logger;
import miu.example.Lab4.repositories.LoggerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LoggerServiceImpl implements LoggerService {

    @Autowired
    LoggerRepo loggerRepo;

    @Override
    public void save(Logger log) {
        loggerRepo.save(log);
    }
}

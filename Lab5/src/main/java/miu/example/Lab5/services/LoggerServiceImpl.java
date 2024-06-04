package miu.example.Lab5.services;

import miu.example.Lab5.entities.Logger;
import miu.example.Lab5.repositories.LoggerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoggerServiceImpl implements LoggerService {

    @Autowired
    LoggerRepo loggerRepo;

    @Override
    public void save(Logger log) {
        loggerRepo.save(log);
    }
}

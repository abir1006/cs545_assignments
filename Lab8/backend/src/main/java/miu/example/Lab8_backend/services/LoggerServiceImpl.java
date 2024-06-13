package miu.example.Lab8_backend.services;

import miu.example.Lab8_backend.entities.Logger;
import miu.example.Lab8_backend.repositories.LoggerRepo;
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

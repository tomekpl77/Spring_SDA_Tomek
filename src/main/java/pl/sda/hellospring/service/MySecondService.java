package pl.sda.hellospring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.hellospring.repository.MyFirstRepository;

@Service
@Slf4j
public class MySecondService {

    private  MyFirstRepository myFirstRepository;

    public MySecondService() {
        log.info("MyFirstRepository()");
    }

    @Autowired
    public MySecondService(MyFirstRepository myFirstRepository) {
        log.info("MyFirstRepository with arguments");
        this.myFirstRepository = myFirstRepository;
    }
}

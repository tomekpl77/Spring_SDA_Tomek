package pl.sda.hellospring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.hellospring.repository.MyFirstRepository;

@Service
@Slf4j
public class DoNotDoIt {

//    @Autowired - don't use it here!!!
    private MyFirstRepository myFirstRepository;

    @Autowired
    public void setMyFirstRepository(MyFirstRepository myFirstRepository) {
        this.myFirstRepository = myFirstRepository;
    }

    public MyFirstRepository getMyFirstRepository() {
        return myFirstRepository;
    }
}

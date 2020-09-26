package pl.sda.hellospring.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import pl.sda.hellospring.service.MyFirstService;

@Slf4j
@Repository
public class MyFirstRepository {

    public MyFirstRepository() {
        log.info("MyFirstRepository");
    }
}

package pl.sda.hellospring.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyFirstBean {

    public MyFirstBean() {
        log.info("MyFirstBean");
    }
}

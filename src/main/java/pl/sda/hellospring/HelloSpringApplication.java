package pl.sda.hellospring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.sda.hellospring.bean.AnotherBean;
import pl.sda.hellospring.bean.MaybeComponent;
import pl.sda.hellospring.bean.MaybeComponent2;

@SpringBootApplication(scanBasePackages = "pl.sda")
@Slf4j
public class HelloSpringApplication {
    @Bean
    AnotherBean anotherBean() {
        log.info("inside anotherBean()");
        return new AnotherBean();
    }

    @Bean
    MaybeComponent maybeComponent() {
        log.info("maybeComponent()");
        return new MaybeComponent(anotherBean());
    }

    @Bean
    MaybeComponent2 maybeComponent2() {
        log.info("maybeComponent2()");
        return new MaybeComponent2(anotherBean());
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringApplication.class, args);
    }

}

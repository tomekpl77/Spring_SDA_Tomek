package pl.sda.hellospring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import pl.sda.hellospring.service.DoNotDoIt;

@SpringBootTest
class HelloSpringApplicationTests {

    @Autowired
    DoNotDoIt doNotDoIt;

    @Test
    void contextLoads() {
    }

    @Test
    public void validateComponentInjection() {
        Assert.notNull(doNotDoIt.getMyFirstRepository(), "Shouldn't be null!!!");
    }

}

package pl.sda.hellospring.bean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MaybeComponent {

    private AnotherBean anotherBean;

    public MaybeComponent(AnotherBean anotherBean) {
        log.info("MaybeComponent()");
        this.anotherBean = anotherBean;
    }
}

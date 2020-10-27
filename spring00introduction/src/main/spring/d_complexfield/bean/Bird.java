package spring.d_complexfield.bean;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Bird {
    @Resource(name = "master") //等同于@Autowired+@Qualifier
    private Person person;
}

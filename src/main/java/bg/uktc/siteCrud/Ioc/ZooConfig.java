package bg.uktc.siteCrud.Ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZooConfig {
    @Bean("cat")
    public Animal cat() {
        return new Cat();
    }

    @Bean("normalDog")
    public Animal dog() {
        return new Dog();
    }

    @Bean("mySuperDog")
    public Animal superDog() {
        //todo: add super powers
        return new Dog(true);
    }
}

package app.config;

import app.model.Cat;
import app.model.Dog;
import app.model.Timer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean(name = "cat")
    @Scope(value = "prototype")
    public Cat getHelloWorld() {
        return new Cat();
    }

    //    @Primary
    @Bean(name = "dog")
    @Scope(value = "prototype")
    public Dog getNewDog() {
        return new Dog();
    }

    @Bean(name = "timer")
    @Scope(value = "prototype")
    public Timer getTimer() {
        return new Timer();
    }
}

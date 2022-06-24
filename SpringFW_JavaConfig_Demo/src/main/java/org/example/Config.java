package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean (initMethod = "init",destroyMethod = "destroy")
    public Student getStudent() {
        return new Student();
    }

    @Bean (initMethod = "init",destroyMethod = "destroy")
    public Phone getPhone() {
        return new Phone();
    }

    @Bean (initMethod = "init",destroyMethod = "destroy")
    public Address getAddress() {
        return new Address();
    }
}

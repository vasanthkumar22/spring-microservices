package com.example.customerservice.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.example.customerservice")
public class CustomerConfiguration {

//    @Bean
//    public ProbabilityBasedSampler defaultSampler(){
//        SamplerProperties config = new SamplerProperties();
//        config.setProbability(1);
//        return new ProbabilityBasedSampler( config);
//    }
}

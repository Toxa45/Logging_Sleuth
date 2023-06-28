package ru.test.rabbit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;


@Configuration
public class MessageListener {

    @Autowired
    private RequestProcessor requestProcessor;

    @Bean
    public Consumer<Message> testListener(){
        return requestProcessor::testListener;
    }
}

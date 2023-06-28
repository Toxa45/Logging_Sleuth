package ru.test.rabbit;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Service
@Validated
public class RequestProcessor {

    public void testListener(@Valid Message message) {
        message.setModel(message.getModel()+"!");
    }
}

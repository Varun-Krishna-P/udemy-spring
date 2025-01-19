package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

public class MessageGeneratorImpl implements  MessageGenerator{

    private final Logger log = LoggerFactory.getLogger(MessageGenerator.class);
    @Autowired
    private Game game;
    private int guessCount = 10;

    @PostConstruct
    public void init(){
        log.info("inside init");
    }

    @Override
    public void getMainMessage() {
        log.info("Calling getMainMessage");
    }

    @Override
    public void getResultMessage() {
        log.info("Calling getResultMessage");
    }
}

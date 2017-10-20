package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("FirstList")
    TaskList taskList;

    @Bean
    public Board getBoard() {
        return new Board(taskList);
    }

    @Bean(name = "FirstList")
    @Scope("prototype")
    public TaskList getListOne() {
        return new TaskList(new ArrayList<>());
    }

    @Bean(name = "SecondList")
    @Scope("prototype")
    public TaskList getListTwo() {
        return new TaskList(new ArrayList<>());
    }

    @Bean(name = "ThirdList")
    @Scope("prototype")
    public TaskList getListThree() {
        return new TaskList(new ArrayList<>());
    }
}

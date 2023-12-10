package com.riteship.crs.college.microservice.components;

import com.riteship.crs.college.microservice.entities.CollegeDataBean;
import com.riteship.crs.college.microservice.service.impl.RiteShipCollegeServiceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private RiteShipCollegeServiceBean<CollegeDataBean, Integer> collegeServiceBean;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        /*this.bookService.createBook(new Book("Aldous Huxley", "Brave new world"));
        this.bookService.createBook(new Book("George Orwell", "Animal Farm"));*/

    }
}
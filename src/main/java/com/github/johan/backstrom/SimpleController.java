package com.github.johan.backstrom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
public class SimpleController {

    @Autowired
    MariadbClient mariadbClient;

    @RequestMapping("/person/list")
    public List<Person> listPersons() {
        return mariadbClient.getPeople();
    }

}
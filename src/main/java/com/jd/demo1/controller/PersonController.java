package com.jd.demo1.controller;

import com.jd.demo1.pojo.Person;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person addPerson(@Validated @RequestBody Person person) {
        person.setId(1000L);
        person.setCreateTime(new Date());
        return person;

    }

}

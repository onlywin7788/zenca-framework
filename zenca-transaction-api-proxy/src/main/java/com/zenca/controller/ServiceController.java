package com.zenca.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @RequestMapping(value="/api/v1/service/{id}", method=RequestMethod.GET)
    public String getMethod(@PathVariable String id)
    {
        return id;
    }
}
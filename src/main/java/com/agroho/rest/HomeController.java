package com.agroho.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by USER on 20-Nov-16.
 */
@RestController
public class HomeController {

    @RequestMapping(name = "/")
    public String index(){
        return "Hello Autism Barta";
    }
}

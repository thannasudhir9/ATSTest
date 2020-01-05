package com.java.ATS_Exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Sudhir kumar Thanna on 1/3/20.
 */
@Controller
public class HomeController {

    /**
     * Return the index which calls the html page - index.html in templates Folder
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "index";
    }

    /**
     * Return the login which calls the html page - Login.html in templates Folder
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    /**
     * Return the index which calls the html page - index.html in templates Folder
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}

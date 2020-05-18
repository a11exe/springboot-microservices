/*
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 18.05.2020
 */
package com.alllexe.usersservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private Environment env;

    @GetMapping("/status/check")
    public String status() {
        return "working on port " + env.getProperty("local.server.port");
    }
}
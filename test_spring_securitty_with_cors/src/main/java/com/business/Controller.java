package com.business;

import java.security.Principal;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:8081")
public class Controller {

    @GetMapping("/user")
    public String user(Principal principal) {
        return principal.getName();
    }
}//d3f87cb9-6dad-4546-a833-dda2058e2b52

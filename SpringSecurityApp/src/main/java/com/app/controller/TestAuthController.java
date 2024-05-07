package com.app.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@PreAuthorize("denyAll()")
public class TestAuthController {

    @GetMapping("/get")
    @PreAuthorize("hasAuthority('READ')")
    public String HelloGet(){
        return "Hello World - Get";
    }

    @PostMapping("/login")
    @PreAuthorize("hasAuthority('READ')")
    public String HelloLogin(){
        return "Hello World - login";
    }

    @PostMapping("/post")
    @PreAuthorize("hasAuthority('CREATE') and hasAuthority('READ')")
    public String HelloPost(){
        return "Hello World - Post";
    }


    @PutMapping("/put")
    @PreAuthorize("hasAuthority('UPDATE')")
    public String HelloPut(){
        return "Hello World - Put";
    }


    @DeleteMapping("/delete")
    @PreAuthorize("hasAuthority('DELETE')")
    public String HelloDelete(){
        return "Hello World - Delete";
    }

    @PatchMapping("/patch")
    @PreAuthorize("hasAuthority('REFACTOR')")
    public String HelloPatch(){
        return "Hello World - Patch";
    }
}

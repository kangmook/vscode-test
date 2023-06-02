package com.skmns.infra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    
    @RequestMapping("/api/test")
    public void testApi() throws Exception {
        System.out.println("hello? this is api");
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        String rtnVal = String.format("Hello %s", name); 
        return rtnVal;
    }
}

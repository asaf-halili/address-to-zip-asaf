package com.heed.addresstozip;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class GreeterController {

    @RequestMapping("/greeting")
    public Greeting greeting() {
        return new Greeting("Hello World!");
    }

}


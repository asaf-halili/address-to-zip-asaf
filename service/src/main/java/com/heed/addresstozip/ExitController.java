package com.heed.addresstozip;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ExitController {

    @RequestMapping("/exit")
    public void exit() {
        System.out.println("calling System.exit(1) now");
        System.exit(1);
    }
}

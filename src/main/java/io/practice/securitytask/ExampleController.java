package io.practice.securitytask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/info")
    public String getInfo() {
        return "Hello from info endpoint";
    }

    @GetMapping("/about")
    public String getAbout() {
        return "This is about endpoint with permit all policy";
    }
}

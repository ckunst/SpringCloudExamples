package io.pivotal.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzsController {

    @Value("${cpd.host:defaulthost}")
    String host;

    @RequestMapping("/")
    public String greeter() {
        return host;
    }

}

package se.booking.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class InstanceController {

    @Value("${app.instance-name}")
    private String instanceName;

    @GetMapping("/instance")
    public String getInstance() {
        return "Svarar från: " + instanceName;
    }

}

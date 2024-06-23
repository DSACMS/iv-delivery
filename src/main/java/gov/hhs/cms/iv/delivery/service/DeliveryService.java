package gov.hhs.cms.iv.delivery.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("delivery")
public class DeliveryService {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}

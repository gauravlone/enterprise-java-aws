package com.gauravlone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EnterpriseJavaAwsDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(EnterpriseJavaAwsDemoApplication.class, args);
    }

    @GetMapping("/health")
    public String health() {
        return "{\"status\":\"healthy\",\"service\":\"Enterprise Java AWS Demo\",\"timestamp\":\"%s\"}"
                .formatted(java.time.Instant.now());
    }

    @GetMapping("/")
    public String home() {
        return "Enterprise Java AWS Demo - VPC/EC2/ALB/ASG Ready | /health";
    }
}

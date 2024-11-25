package co.imp.tech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ImpTechApplication {
    public static void main(String[] args) {
        SpringApplication.run(ImpTechApplication.class, args);
        System.out.println("Success Imp Tech!!");
    }
}

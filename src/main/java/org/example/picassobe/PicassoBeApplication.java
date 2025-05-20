package org.example.picassobe;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

@Tag(name = "User API", description = "Trang tong")
public class PicassoBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PicassoBeApplication.class, args);
    }

    @GetMapping("/hello")
    @Operation(summary = "Xin chao The gioi")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "Tu Binh") String name) {
        return String.format("Hello %s!", name);
    }
}

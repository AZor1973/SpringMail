package ru.azor.springmail;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import ru.azor.springmail.services.MailService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class SpringMailApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringMailApplication.class, args);
    }
}

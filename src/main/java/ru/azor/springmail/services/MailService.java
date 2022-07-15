package ru.azor.springmail.services;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
@RequiredArgsConstructor
public class MailService {
    private final JavaMailSender javaMailSender;

    @PostConstruct
    public void sendMail() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("AZorMailSender");
        simpleMailMessage.setTo("azor@mail.ru");
        simpleMailMessage.setSubject("Turning on the laptop");
        simpleMailMessage.setText("Hello, from AZor! Your notebook is started!\n"
                + LocalDateTime.now().format(DateTimeFormatter
                .ofPattern("dd.MM.yyyy HH:mm:ss")));
        javaMailSender.send(simpleMailMessage);
    }
}

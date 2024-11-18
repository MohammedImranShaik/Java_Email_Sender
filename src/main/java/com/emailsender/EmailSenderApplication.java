package com.emailsender;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailSenderApplication {

	@Autowired
	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(EmailSenderApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() {

		emailSenderService.sendEmail("eswarbollapragada@gmail.com",
				"Fuck you Eswar Anna..!", "Anna Denginchukundhama");
	}

}

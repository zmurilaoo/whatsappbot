package com.zmurilao.chatbot.whatsappbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
//Anotação para abstrair configs

@SpringBootApplication//Porta de entrada
@Configuration //Metodos que define bin
@EnableAutoConfiguration // Ativa a autoConfiguração do SprigBoot
@ComponentScan //Scannear o projeto...


public class WhatsappbotApplication {
	// Classe Principal...

	public static void main(String[] args) {
		SpringApplication.run(WhatsappbotApplication.class, args);

		JOptionPane.showMessageDialog(null,"Testando..");



	}


}

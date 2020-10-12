package com.sttiwe.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.sttiwe.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}

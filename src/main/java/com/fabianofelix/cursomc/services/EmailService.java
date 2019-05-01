package com.fabianofelix.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.fabianofelix.cursomc.domian.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}

package com.microservice.notification.serviceImpl;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.microservice.notification.model.EmailDetails;

@Service
public class EmailServiceImpl {

	private static final Logger LOGGER = LogManager.getLogger(EmailServiceImpl.class);

	@Autowired
	private JavaMailSender javaMailSender;

	@Autowired
	private TemplateEngine templateEngine;

	public EmailServiceImpl(JavaMailSender javaMailSender, TemplateEngine templateEngine) {
		this.javaMailSender = javaMailSender;
		this.templateEngine = templateEngine;
	}

	public boolean orderRegistration(EmailDetails requestVo) throws MessagingException {
		LOGGER.info("inside the sendAdminRegistration ", requestVo.getEmail());
		boolean emailSent = false;
		try {
			Context context = new Context();
			context.setVariable("requestVo", requestVo);
			String process = templateEngine.process("email/orderCreation.html", context);
			MimeMessage createMimeMessage = javaMailSender.createMimeMessage();
			MimeMessageHelper messageHelper = new MimeMessageHelper(createMimeMessage);
			messageHelper.setSubject("Order Creation Successfull");
			messageHelper.setText(process, true);
			messageHelper.setTo(requestVo.getEmail());
			javaMailSender.send(createMimeMessage);
			emailSent = true;
			LOGGER.info("Email sent successfully", emailSent);
		} catch (Exception e) {
			LOGGER.error("Failed to send email", "e.getStackTrace()");
			emailSent = false;
		}
		return emailSent;
	}

}

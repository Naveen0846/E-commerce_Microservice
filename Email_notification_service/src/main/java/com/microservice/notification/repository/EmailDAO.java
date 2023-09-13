package com.microservice.notification.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.notification.model.EmailDetails;

public interface EmailDAO extends JpaRepository<EmailDetails, Integer> {

}

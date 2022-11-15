package com.udea.matricula.service;

// Importing required classes
import com.udea.entity.emaildetails;

// Interface
public interface emailsenderService {

    // Method
    // To send a simple email
    String sendSimpleMail(emaildetails details);

    // Method
    // To send an email with attachment
    String sendMailWithAttachment(emaildetails details);
}

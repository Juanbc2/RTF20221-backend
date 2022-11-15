package com.udea.matricula.controller;

// Importing required classes
import com.udea.entity.emaildetails;
import com.udea.matricula.service.emailsenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Annotation
@RestController
// Class
public class emailsenderController {

    @Autowired
    private emailsenderService emailService;

    // Sending a simple Email
    @PostMapping("/sendMail")
    public String sendMail(@RequestBody emaildetails details) {
        String status = emailService.sendSimpleMail(details);
        return status;
    }

    // Sending email with attachment
    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(
            @RequestBody emaildetails details) {
        String status = emailService.sendMailWithAttachment(details);

        return status;
    }
}
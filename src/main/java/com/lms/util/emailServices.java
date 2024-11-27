package com.lms.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class emailServices {
    @Autowired
    public MailSender ms;

    public void sendEmail(
        String to,String sub,String msg
    ){
        SimpleMailMessage mss = new SimpleMailMessage();
        mss.setTo(to);
        mss.setSubject(sub);
        mss.setText(msg);
        ms.send(mss);
    }
}

package org.gh.app.factory;

/**
 * Created by gaohang on 15/10/14.
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is an mailsender");
    }
}

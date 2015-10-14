package org.gh.app.factory;

/**
 * Created by gaohang on 15/10/14.
 */
public class CommonFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        }else if ("sms".equals(type)) {
                return new SmsSender();
            } else {
                System.out.println("请输入正确的格式");
                return null;
            }


        }
    }


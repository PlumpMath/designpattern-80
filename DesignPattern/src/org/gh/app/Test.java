package org.gh.app;

import org.gh.app.factory.CommonFactory;
import org.gh.app.factory.Sender;

/**
 * Created by gaohang on 15/10/14.
 */
public class Test {


    public static void main(String [] args){

        /**
         * 测试普通工厂类
         */

        Sender sender=new CommonFactory().produce("sms");
        sender.Send();

    }
}

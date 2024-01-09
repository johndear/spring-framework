package com.ls.spring.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ls
 * @date 2023/11/27 23:31
 */
public class Test02 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application02.xml");
        ITransactionService02 transactionService02 = (ITransactionService02) applicationContext.getBean("proxyService");
        transactionService02.save();
    }

}

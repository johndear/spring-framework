package com.ls.spring.test01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application01.xml");
        TransactionService01 transactionService01 = (TransactionService01) applicationContext.getBean("transactionService01");
        transactionService01.save();
    }

}

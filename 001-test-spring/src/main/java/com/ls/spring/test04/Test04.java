package com.ls.spring.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ls
 * @date 2023/11/27 23:31
 */
public class Test04 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application04.xml");
        ITransactionService04 transactionService04 = (ITransactionService04) applicationContext.getBean("transactionService04");
        transactionService04.save();
    }

}

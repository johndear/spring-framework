package com.ls.spring.test03;

import com.ls.spring.test02.ITransactionService02;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ls
 * @date 2023/11/27 23:31
 */
public class Test03 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application03.xml");
        ITransactionService02 transactionService02 = (ITransactionService02) applicationContext.getBean("transactionService02");
        transactionService02.save();
    }

}

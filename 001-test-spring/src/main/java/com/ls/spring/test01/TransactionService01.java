package com.ls.spring.test01;


import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 */
public class TransactionService01 {

    private TransactionTemplate transactionTemplate;

    private UserDao userDao;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        Object result = this.transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                userDao.in("7565", 2);
//                int i = 10/0;
                userDao.out("6566", 2);

                return null;
            }
        });
        System.out.println(result);

        userDao.in("7565", 2);
        userDao.out("6566", 2);
    }


}

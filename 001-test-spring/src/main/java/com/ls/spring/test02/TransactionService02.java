package com.ls.spring.test02;


import com.ls.spring.test01.UserDao;

/**
 * @author ls
 * @date 2023/11/21 13:44
 */
public class TransactionService02 implements ITransactionService02 {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.in("7565", 2);
        int i = 10/0;
        userDao.out("6566", 2);
    }
}

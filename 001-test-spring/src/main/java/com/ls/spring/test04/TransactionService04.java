package com.ls.spring.test04;

import com.ls.spring.test01.UserDao;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ls
 * @date 2023/11/21 13:44
 */
@Transactional
public class TransactionService04 implements ITransactionService04 {

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

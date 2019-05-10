package com.itheima.jdbc;

import java.util.List;

public interface AccountDao {
    int addAcount(Account account);
    int updateAccount(Account account);
    int deleteAccount(int id);
    Account findAccountBy(int id);
    List<Account> findAllAccount();
}

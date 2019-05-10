package com.itheima.jdbc;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class AccountDaoImpl implements AccountDao{

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addAcount(Account account) {
        String sql = "insert into account(username, balance) values (?, ?)";
        Object[] objects = new Object[]{
                account.getUsername(),
                account.getBalance()
        };
        int num = this.jdbcTemplate.update(sql,objects);
        return num;
    }

    @Override
    public int updateAccount(Account account) {
        String sql = "update account set username = ?, balance = ? where id = ?";
        Object[] objects = new Object[]{
                account.getUsername(),
                account.getBalance(),
                account.getId()
        };
        int num = this.jdbcTemplate.update(sql,objects);
        return num;
    }

    @Override
    public int deleteAccount(int id) {
        String sql = "delete from account where id = ?";
        int num = this.jdbcTemplate.update(sql,id);
        return num;
    }

    @Override
    public Account findAccountBy(int id) {
        String sql = "select * from account where id = ?";
        RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
        return this.jdbcTemplate.queryForObject(sql,rowMapper,id);
    }

    @Override
    public List<Account> findAllAccount() {
        String sql = "select * from account";
        RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
        return this.jdbcTemplate.query(sql,rowMapper);
    }
}

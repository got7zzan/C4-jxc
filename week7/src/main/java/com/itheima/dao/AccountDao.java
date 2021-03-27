package com.itheima.dao;
/*
持久层接口
 */

import com.itheima.domain.Account;
import com.itheima.domain.QueryVo;

import java.util.List;

public interface AccountDao {

    //1.查询所有操作
    List<Account> findAll();

    //3.插入用户
    void insertAccount(Account account);

    //5.更新用户
    void updateAccount(Account account);

    //2.通过id删除用户
    void deleteAccount(String id);

    //4.根据id查询信息
    Account findById(String id);

    //根据名称模糊查询用户信息
    List<Account> findByName(String name);

    //根据QueryVo的条件查询用户
    List<Account> findAccountByVo(QueryVo vo);

}

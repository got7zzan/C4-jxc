package com.itheima.sevice;

import com.itheima.mapper.AccountMapper;
import com.itheima.domain.Account;

import com.sun.org.apache.bcel.internal.generic.RET;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountMapper accountMapper;
    //1.查找
    public List<Account> findAll() {
        List<Account> all = accountMapper.findAll();
        return all;
    }

    //2.删除
    public void deleteAccount(String id){
        accountMapper.deleteAccount(id);
    }

    //3.插入
    public void insertAccount(Account account){
        accountMapper.insertAccount(account);
    }

    //4.通过id查找对象
    public Account findById(String id){
        return accountMapper.findById(id);
    }

    //5.更新Account
    public void updateAccount(Account account){
        accountMapper.updateAccount(account);
    }


    //6.转账
    /**
     *
     * @param remitterId 转出者的id
     * @param remitteeId 转入者的id
     * @param money 转账金额
     */
    @Transactional //开启事务
    public void transfer(String remitterId,String remitteeId,int money){
        //调用dao层的更新方法实现转账操作
        accountMapper.transfer(remitterId,-money); //转出者的金钱减少
        accountMapper.transfer(remitteeId,money); //转入者的金钱增多
    }

}

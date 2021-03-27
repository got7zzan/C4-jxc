package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.domain.QueryVo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class AccountDaoImpl implements AccountDao {

    private SqlSessionFactory factory;
    Account account=new Account();

    public AccountDaoImpl(SqlSessionFactory factory)
    {
        this.factory=factory;
    }

    @Override
    public List<Account> findAll() {
        //1.根据factory获取SqlSession对象
        SqlSession session=factory.openSession();
        //2.调用SelSession中的方法，实现查询列表
        List<Account> accounts=session.selectList("com.itheima.dao.AccountDao.findAll");
        //3.释放资源
        session.close();
        return accounts;
    }

    @Override
    public void insertAccount(Account account) {
        SqlSession session=factory.openSession();
        session.insert("com.itheima.dao.AccountDao.insertAccount",account);
        session.commit();
        session.close();
    }

    @Override
    public void updateAccount(Account account) {
        SqlSession session=factory.openSession();
        session.insert("com.itheima.dao.AccountDao.updateAccount",account);
        session.commit();
        session.close();

    }

    @Override
    public void deleteAccount(String id) {
        SqlSession session=factory.openSession();
        session.insert("com.itheima.dao.AccountDao.deleteAccount");
        session.commit();
        session.close();
    }

    @Override
    public Account findById(String id) {
        //1.根据factory获取SqlSession对象
        SqlSession session=factory.openSession();
        //2.调用SelSession中的方法，实现查询列表
        Account account1=session.selectOne("com.itheima.dao.AccountDao.findById",account);
        //3.释放资源
        session.close();
        return account1;
    }

    @Override
    public List<Account> findByName(String name) {
        return null;
    }

    @Override
    public List<Account> findAccountByVo(QueryVo vo) {
        return null;
    }
}

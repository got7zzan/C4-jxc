package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.dao.AccountDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MybatiesTest {
    private InputStream in;
    private SqlSession sqlSession;
    private AccountDao accountDao;

    @Before//用于在测试方法执行之前执行

    public void init() throws Exception{
        //1.读取配置文件，生成字节输入流
        in= Resources.getResourceAsStream("com/itheima/dao/SqlMapConfig.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象
        sqlSession = factory.openSession(true);
        //4.获取dao的代理对象
        accountDao = sqlSession.getMapper(AccountDao.class);

        //3.使用工厂对象，创建dao对象
        //accountDao=new AccountDaoImpl(factory);
    }
    @After//用于在测试方法执行之后执行
    public void destroy() throws Exception
    {
        //6.释放资源
        sqlSession.close();
        in.close();
    }
    //保存
    @Test
    public void testAccount(){
        Account account = new Account();
        account.setId("1");
        account.setName("jack");
        account.setMoney(1000);
        account.setCreatetime(new Date());
        account.setUpdatetime(new Date());
        
        //5.执行保存方法
        accountDao.insertAccount(account);
        //提交事务
        sqlSession.commit();

        account.setId("2");
        account.setName("Tom");
        account.setMoney(500);
        account.setCreatetime(new Date());
        account.setUpdatetime(new Date());

        //5.执行保存方法
        accountDao.insertAccount(account);
        //提交事务
        sqlSession.commit();

        account.setId("3");
        account.setName("micky");
        account.setMoney(800);
        account.setCreatetime(new Date());
        account.setUpdatetime(new Date());

        //5.执行保存方法
        accountDao.insertAccount(account);
        //提交事务
        sqlSession.commit();
    }
    //查询
    @Test
    public void testFindAll(){
        List<Account> accounts = accountDao.findAll();
        for (Account i : accounts) {
            System.out.println(i);
        }
    }

    //更新用户
    @Test
    public void testUpdate()
    {

        Account account=new Account();
        account.setId("1");
        account.setName("jump");
        account.setMoney(800);
        account.setCreatetime(new Date(2021-03-10));
        account.setUpdatetime(new Date(2021-03-21));
        accountDao.updateAccount(account);
        //提交事务
        sqlSession.commit();
    }

    //删除用户
    @Test
    public void testDelete()
    {
        accountDao.deleteAccount("1");
        //提交事务
        sqlSession.commit();
    }

    //根据id查询
    @Test
    public void testFindOne()
    {
        Account account1 = accountDao.findById("2");
        System.out.println(account1);
    }



}

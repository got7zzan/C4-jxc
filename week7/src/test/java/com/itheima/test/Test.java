package com.itheima.test;

import com.itheima.dao.AccountDao;
import com.itheima.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;

import java.io.InputStream;

public class Test {
    private InputStream in;
    private SqlSession sqlSession;
    private AccountDao accountDao;

    @Before//用于在测试方法执行之前执行

    public void init() throws Exception{
        //1.读取配置文件，生成字节输入流
        in= Resources.getResourceAsStream("SqlSerConfig.xml");
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

    //转账
    @org.junit.Test
    public void testMoney()
    {
        AccountService.
    }
}

package com.itheima.mapper;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AccountMapper {
    //1.查询所有
    List<Account> findAll();

    //2.通过id删除用户
    void deleteAccount(String id);

    //3.插入用户
    void insertAccount(Account account);

    //4.根据id查询信息
    Account findById(String id);

    //5.更新用户
    void updateAccount(Account account);

    //6.更新账户金额:@Param注解用于指定参数，在sql语句中就可以通过#{}来获取参数值
    void transfer(@Param("id") String id,@Param("money") int money);
}

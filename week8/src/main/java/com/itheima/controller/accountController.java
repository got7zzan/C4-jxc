package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.sevice.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Generated;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class accountController {

    @Autowired
    private AccountService accountService;

    //查询所有
    @RequestMapping("/account/all")
    @ResponseBody
    private List<Account> findAll(){
        return accountService.findAll();
    }

    //删除
    @RequestMapping("/account/delete")
    @ResponseBody
    private String deleteAccount(){
        accountService.deleteAccount("1");
        return "delete success";
    }

    //插入
    @RequestMapping("/account/insert")
    @ResponseBody
    private String insertAccount() {
        Account account = new Account();
        account.setId("4");
        account.setName("donghea");
        account.setMoney(1000);
        account.setCreatetime(new Date());
        account.setUpdatetime(new Date());
        /*SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2021-03-31");*/

        accountService.insertAccount(account);
        return "insert success";
    }

    //修改account对象
    @RequestMapping("/account/update")
    @ResponseBody
    public String updateAccount() {
        Account account = new Account();
        //模拟更新：将id=4的账户的余额修改为2000
        account.setId("4");
        account.setName("donghea");
        account.setMoney(2000);
        account.setUpdatetime(new Date());
        accountService.updateAccount(account);
        return "update success";
    }


    //根据id查询
    @RequestMapping("/account/find")
    @ResponseBody
    private Account findById(){
        return accountService.findById("4");
    }


    //转账
    @RequestMapping("/account/transfer")
    @ResponseBody
    //这种需要前端传参才行
//    public String transfer(@RequestParam("remitterId") String remitterId,
//                           @RequestParam("remitteeId") String remitteeId,
//                           @RequestParam("money") int money)
    public String transfer() {
        //调用service层的方法进行转账
        //accountService.transfer(remitterId,remitteeId,money);
        accountService.transfer("2","3",100);
        return "update success";
    }

}

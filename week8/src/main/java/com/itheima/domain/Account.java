package com.itheima.domain;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable {
    private String id;
    private String name;
    private int money;
    private Date createtime;
    private Date updatetime;

    public String getId() {
        return id;
    }

    public Date getCreatetime() {
        return createtime;
    }


    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                '}';
    }
}

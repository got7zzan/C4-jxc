-- 用 Alter Table 语句更新表 ChooseBb，添加一个属性名 Bb4，类型 Varchar,长度 20,完整性约束设为非空值，缺省值设为字符“系统测试值”
ALTER TABLE choosebb CHARACTER SET utf8;
ALTER TABLE choosebb ADD (Bb4 VARCHAR(20) DEFAULT "系统测试值" NOT NULL);
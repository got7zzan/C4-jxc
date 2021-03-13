-- 30.用 SELECT 语句的连接查询，查询学生的学号、姓名、选修的课程名及成绩。

SELECT
    t1.`SNO`,-- 学号
    t1.`Name`,-- 姓名
    t2.`CouresName`,-- 选修的课程名
    t3.`Score`-- 成绩
FROM
    student t1,
    Course t2,
    Choose t3

WHERE
        t1.`SNO`=t3.`SNO` AND t2.`CourseID`=t3.`CouresID`;
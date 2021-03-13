-- 32.用 SELECT 语句的嵌套查询，查询选修 C1 课程的成绩低于“张三”的学生的学号和成绩。

SELECT
    SNO,-- 学号
    Score-- 成绩
FROM
    Choose
WHERE
        CouresID='C1'
  AND
        Score<(SELECT
                   Score
               FROM
                   Choose,
                   student
               WHERE
                       student.`SNO`=Choose.`SNO`
                 AND
                       Choose.`CouresID`='C1'
                 AND
                       student.`Name`='张三');
-- 用 SELECT 的存在量词 EXISTS，查询与“张三”在同一个学院学习的学生信息

SELECT
    *
FROM
    student
WHERE
        College=(SELECT College FROM student WHERE NAME='张三')
AND
    EXISTS (SELECT * FROM student WHERE NAME='张三');
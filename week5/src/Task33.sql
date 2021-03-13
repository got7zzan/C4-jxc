-- 33.用 SELECT 语句的组合查询(UNION)，查询选修了 C1 课程或者选修了 C3课程的学生学号。

SELECT
    SNO
FROM
    Choose
WHERE
        CouresID='C1'
UNION
SELECT
    SNO
FROM
    Choose
WHERE
        CouresID='C2';
-- 34.用 SELECT 语句的组合查询(UNION)与 DISTINCT 短语，查询选修了 C1 课程或者选修了 C3 课程的学生学号，并取消重复的数据

SELECT
    DISTINCT SNO
FROM
    Choose
WHERE
        CouresID='C1'
UNION
SELECT
    DISTINCT SNO
FROM
    Choose
WHERE
        CouresID='C1';34.
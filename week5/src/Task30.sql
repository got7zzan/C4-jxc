-- 30.用 SELECT 语句的连接查询，查询学生的学号、姓名、选修的课程名及成绩。


SELECT Student.SNO,NAME,CouresName,Score
FROM Student,Course,Choose
WHERE Student.SNO=Choose.SNO AND Course.CourseID=Choose.CouresID;
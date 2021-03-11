/*
 29.用 SELECT 语句对空值(NULL)的判断条件，查询 Course 表中先修课称编
号为空值的课程编号和课程名称。
 */
SELECT CourseID,CouresName FROM Course WHERE CourseBeforeID IS NULL;
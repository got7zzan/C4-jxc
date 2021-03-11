/*
 用 UPDATE 语句将 test 表中居住在南福苑所有学生的年龄减少 1 岁。
 */
UPDATE test SET Age=Age-1 WHERE Address LIKE "南福苑%";
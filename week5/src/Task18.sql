/*
 用 DELETE 语句将 test 表中成绩小于 550 并且居住在重邮宿舍的学生数据删除掉。
 */
DELETE FROM test WHERE Score<500 AND Address LIKE "重邮宿舍%";
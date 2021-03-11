/*
 28.分别用 SELECT 语句的 max()、min()、sum()、avg()四个聚集函数，计算
Choose 表中 C1 课程的最高分、最低分、总分、平均分。
 */
SELECT MAX(Score) FROM Choose GROUP BY CouresID HAVING CouresID='C1';
SELECT MIN(Score) FROM Choose GROUP BY CouresID HAVING CouresID='C1';
SELECT SUM(Score) FROM Choose GROUP BY CouresID HAVING CouresID='C1';
SELECT AVG(Score) FROM Choose GROUP BY CouresID HAVING CouresID='C1';
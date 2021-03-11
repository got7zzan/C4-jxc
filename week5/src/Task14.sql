/*
 用 INSERT INTO ... SELECT ... FROM 语句，将 test_temp 表中的数据，插入到 test 表中。
 */

INSERT INTO test SELECT NAME,Age,Score,Address FROM test_temp;
/*
 用 Create Index 语句对表 ChooseBb 的 Bb2 属性建立一个升序索引，索引名 Index_bb2。
 用 Create Index 语句对表 ChooseBb 的 Bb4 属性建立一个降序索引，索引名 Index_bb4。
 */
CREATE INDEX Index_bb2 ON choosebb(Bb2 ASC);
CREATE INDEX Index_bb4 ON choosebb(Bb4 DESC);
-- 코드를 입력하세요
SELECT FACTORY_ID, FACTORY_NAME, 	ADDRESS
  FROM food_factory
 WHERE address LIKE '강원%'
 ORDER
    BY FACTORY_ID ASC;
-- 코드를 입력하세요
SELECT FLAVOR
  FROM FIRST_HALF
 WHERE TOTAL_ORDER IS NOT NULL
 ORDER
    BY TOTAL_ORDER DESC, SHIPMENT_ID;
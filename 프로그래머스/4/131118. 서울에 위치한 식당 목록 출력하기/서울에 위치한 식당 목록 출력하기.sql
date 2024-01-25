-- 코드를 입력하세요
SELECT inf.REST_ID, inf.REST_NAME, inf.FOOD_TYPE, inf.FAVORITES, inf.ADDRESS,
        ROUND(AVG(re.review_score),2) AS SCORE
  FROM rest_info AS inf
INNER JOIN rest_review AS re ON inf.rest_id=re.rest_id
 WHERE address LIKE '서울%'
 GROUP BY inf.REST_ID
 ORDER BY SCORE DESC, favorites DESC;
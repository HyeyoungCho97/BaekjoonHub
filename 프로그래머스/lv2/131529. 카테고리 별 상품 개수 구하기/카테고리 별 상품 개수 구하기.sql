-- 코드를 입력하세요
SELECT  SUBSTR(product_code, 1, 2), COUNT(product_id) as products
FROM    product
GROUP BY SUBSTR(product_code, 1, 2)
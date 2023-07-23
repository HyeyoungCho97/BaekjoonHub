-- 코드를 입력하세요
SELECT  ingredient_type, SUM(total_order) as TOTAL_ORDER
FROM    first_half f JOIN icecream_info i
    ON  f.flavor = i.flavor
GROUP BY i.ingredient_type
ORDER BY total_order
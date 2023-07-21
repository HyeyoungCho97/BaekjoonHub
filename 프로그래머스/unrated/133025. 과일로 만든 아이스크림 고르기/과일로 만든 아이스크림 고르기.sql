-- 코드를 입력하세요
SELECT flavor
FROM first_half
WHERE flavor IN (   SELECT flavor
                    FROM icecream_info
                    WHERE ingredient_type LIKE 'fruit%' )
    AND total_order > 3000
ORDER BY total_order DESC;
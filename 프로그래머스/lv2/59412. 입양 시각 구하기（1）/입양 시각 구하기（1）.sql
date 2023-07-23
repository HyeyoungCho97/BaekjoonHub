-- 코드를 입력하세요
SELECT  HOUR(datetime) as HOUR,
        COUNT(animal_id) as COUNT
FROM    animal_outs
WHERE HOUR(datetime)>=9 AND HOUR(datetime)<20
GROUP BY HOUR(datetime)
ORDER BY HOUR

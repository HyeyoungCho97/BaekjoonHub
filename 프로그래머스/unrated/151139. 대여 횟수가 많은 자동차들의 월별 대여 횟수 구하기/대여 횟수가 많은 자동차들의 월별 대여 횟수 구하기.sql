-- 코드를 입력하세요
SELECT  MONTH(start_date), car_id, COUNT(*)
FROM    car_rental_company_rental_history
WHERE   car_id IN   (   SELECT  car_id
                        FROM    car_rental_company_rental_history
                        WHERE   start_date >= '2022-08-01'
                            AND start_date <= '2022-10-31'
                        GROUP BY car_id
                        HAVING  COUNT(car_id)>=5 )
        AND start_date >= '2022-08-01'
        AND start_date <= '2022-10-31'
GROUP BY MONTH(start_date), car_id
HAVING   COUNT(*) > 0
ORDER BY MONTH(start_date), car_id DESC
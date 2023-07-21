-- 코드를 입력하세요
SELECT  history_id, 
        car_id, 
        date_format(start_date, '%Y-%m-%d'),
        date_format(end_date, '%Y-%m-%d'),
    CASE
        WHEN end_date < date_add(start_date, interval 29 day) THEN '단기 대여'
        ELSE '장기 대여'
    END as rent_type
FROM    car_rental_company_rental_history
WHERE   start_date LIKE '2022-09%'
ORDER BY history_id DESC
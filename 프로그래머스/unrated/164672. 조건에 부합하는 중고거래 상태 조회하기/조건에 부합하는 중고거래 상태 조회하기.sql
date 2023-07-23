-- 코드를 입력하세요
SELECT  board_id, writer_id, title, price, 
        CASE WHEN status LIKE 'SALE' THEN '판매중'
             WHEN status LIKE 'RESERVED' THEN '예약중'
             WHEN status LIKE 'DONE' THEN '거래완료'
        END as status
FROM    used_goods_board
WHERE   created_date LIKE '2022-10-05'
ORDER BY board_id DESC
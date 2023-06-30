-- 코드를 입력하세요
SELECT board_id, writer_id, title, price, CASE WHEN status LIKE 'DONE' THEN '거래완료'
                                                WHEN status LIKE 'SALE' THEN '판매중'
                                                ELSE '예약중'
                                            END status
FROM used_goods_board
WHERE TO_CHAR(created_date, 'YYYY-MM-DD') LIKE '2022-10-05'
ORDER BY board_id DESC
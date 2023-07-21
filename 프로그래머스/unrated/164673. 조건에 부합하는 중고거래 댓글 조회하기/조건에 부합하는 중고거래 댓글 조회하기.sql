-- 코드를 입력하세요
SELECT b.title, b.board_id, c.reply_id, c.writer_id, c.contents, date_format(c.created_date, '%Y-%m-%d')
FROM used_goods_board b JOIN used_goods_reply c
    ON b.board_id = c.board_id
WHERE b.created_date LIKE '2022-10%'
ORDER BY c.created_date, b.title 
-- 코드를 입력하세요
SELECT  category, SUM(total_sales)
FROM    book b JOIN (
                        SELECT  book_id, SUM(sales) as total_sales
                        FROM    book_sales
                        WHERE   sales_date LIKE '2022-01%'
                        GROUP BY book_id    ) t
    ON  b.book_id = t.book_id
GROUP BY category
ORDER BY category

# SELECT  book_id, SUM(sales) as total_sales
# FROM    book_sales
# WHERE   sales_date LIKE '2022-01%'
# GROUP BY book_id
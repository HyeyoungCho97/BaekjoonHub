-- 코드를 입력하세요
SELECT      product_code, SUM(offline_sale.sales_amount*product.price) AS sales
FROM        product JOIN offline_sale
    ON      product.product_id= offline_sale.product_id
GROUP BY    product_code
ORDER BY    sales DESC, product_code ASC
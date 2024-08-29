# Write your MySQL query statement below
-- select p.product_name, s.year, s.price from product as p inner join sales as s on s.product_id = p.product_id

select product_name, year,price from Sales s, Product p Where s.product_id=p.product_id
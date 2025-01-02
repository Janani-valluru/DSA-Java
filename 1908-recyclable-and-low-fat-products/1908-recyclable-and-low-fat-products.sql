# Write your MySQL query statement below

select p.product_id
from Products as p
where low_fats ="Y" AND recyclable  ="Y"
order by p.product_id asc
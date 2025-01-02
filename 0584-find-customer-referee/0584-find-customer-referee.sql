# Write your MySQL query statement below

select c.name 
from Customer as c
where referee_id < 2 OR  referee_id IS NULL OR  referee_id > 2

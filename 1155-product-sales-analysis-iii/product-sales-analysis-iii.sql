select s.product_id as product_id,s.year as first_year,s.quantity as quantity, s.price as price
from sales as s
left join (select product_id,min(year) as t
from sales
group by product_id) as r
on s.product_id=r.product_id 
where (s.product_id =r.product_id) and s.year=r.t



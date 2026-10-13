select name from salesPerson where name not in(select r.name from (select s.name, o.com_id
from salesperson as s
left join orders  as o
on s.sales_id =o.sales_id) as r
left join company as c
on (r.com_id = c.com_id)
where c.name = "RED");


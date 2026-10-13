select q1.query_name,(select round(avg(q.rating/q.position),2) as quality 
from 
Queries as q
where  q.query_name=q1.query_name) as quality,round((select count(q.rating) from queries as q where q.rating<3 and q.query_name=q1.query_name)/count(q1.position) * 100,2) as poor_query_percentage
from Queries as q1
group by q1.query_name;
select round((select count(*) from 
activity as a left join 
(select player_id,
min(event_date) as datee
from activity
group by player_id) as r
on a.player_id=r.player_id
where a.player_id=r.player_id and datediff(a.event_date,r.datee)=1)/count(distinct player_id),2) as fraction
from activity 

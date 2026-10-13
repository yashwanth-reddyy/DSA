select distinct f1.user_id, (select count(distinct follower_id) from followers as f where f.user_id = f1.user_id )as followers_count
from followers as f1
order by f1.user_id asc;

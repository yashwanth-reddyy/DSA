select a.machine_id,round(sum(a.timestamp-b.timestamp)/count(*),3) as processing_time from activity as a inner join  (select * from 
activity 
where activity_type="start") as b on (a.machine_id=b.machine_id) and a.activity_type='end'
where a.process_id=b.process_id
group by a.machine_id;
select round((select count(*) from delivery 
where (customer_id,customer_pref_delivery_date) in
(select customer_id,min(order_date) 
from delivery 
group by customer_id))/count(distinct customer_id) * 100,2)as immediate_percentage
from Delivery

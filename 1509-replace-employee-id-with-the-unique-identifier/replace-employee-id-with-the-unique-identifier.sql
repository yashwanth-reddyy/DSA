select em.unique_id, e.name
from employees as e
left join employeeUNI as em
on e.id=em.id;

select e.name as Employee
from employee as e
left join employee as f
on e.managerId=f.id
where e.salary > f.salary;

select r.name as Department,r.name1 as Employee,r.salary as Salary from 
(select e.departmentID,d.name,e.name as name1,e.salary from employee as e  join department as d on e.departmentid=d.id) as r
where (r.departmentID,r.salary) in (select e.departmentid, max(salary)
from employee as e
group by e.departmentid);

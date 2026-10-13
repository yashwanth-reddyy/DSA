select s1.student_id,s1.student_name,ss.subject_name,(select count(*) as attended_exam
from students as  s
left join examinations as e
on s.student_id=e.student_id
where s.student_id=s1.student_id and e.subject_name=ss.subject_name)as attended_exams
from students as s1, subjects as ss
order by s1.student_id asc, ss.subject_name asc;



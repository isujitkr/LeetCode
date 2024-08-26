# Write your MySQL query statement below
-- select e1.unique_id,e2.name from employeeuni as e1 right join employees as e2 on e1.id = e2.id

select name , unique_id from employees left join employeeUni on employees.id=employeeuni.id;
-- Last updated: 8/9/2025, 1:40:42 PM
# Write your MySQL query statement below
SELECT euni.unique_id, e.name
FROM Employees e
LEFT JOIN EmployeeUNI euni ON e.id = euni.id;

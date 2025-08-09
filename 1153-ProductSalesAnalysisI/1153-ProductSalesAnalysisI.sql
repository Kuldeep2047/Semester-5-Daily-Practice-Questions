-- Last updated: 8/9/2025, 1:41:28 PM
# Write your MySQL query statement below
SELECT p.product_name, s.year, s.price
FROM Sales s
JOIN Product p ON s.product_id = p.product_id;

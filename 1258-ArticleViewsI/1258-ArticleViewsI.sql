-- Last updated: 8/9/2025, 1:41:22 PM
# Write your MySQL query statement below
select distinct author_id as id from Views where author_id=viewer_id 
order by id
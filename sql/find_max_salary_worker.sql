SELECT name, MAX(salary) AS SALARY
FROM worker 
GROUP BY name 
HAVING MAX(salary) IN (
     SELECT MAX(salary) 
     FROM worker
     GROUP BY name 
     ORDER BY MAX(salary) DESC
     LIMIT 1
);
SELECT project_id, SUM(salary*DATEDIFF(MONTH, start_date, finish_date)) AS PRICE  
FROM worker
JOIN project_worker ON worker.id = project_worker.worker_id
JOIN project ON project_worker.project_id = project.id
GROUP BY project_id
ORDER BY PRICE DESC;
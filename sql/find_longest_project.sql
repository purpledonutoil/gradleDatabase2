SELECT id, DATEDIFF(MONTH, start_date, finish_date) AS MONTH_COUNT 
FROM project
GROUP BY id
HAVING DATEDIFF(MONTH, start_date, finish_date) IN(
    SELECT DATEDIFF(MONTH, start_date, finish_date)
    FROM project
    GROUP BY id
    ORDER BY DATEDIFF(MONTH, start_date, finish_date) DESC
    LIMIT 1
);
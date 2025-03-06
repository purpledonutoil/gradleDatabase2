SELECT 'YOUNGEST' AS Type, name, birthday
FROM worker
GROUP BY name
HAVING MAX(birthday) IN (
    SELECT birthday
    FROM worker
    GROUP BY name
    ORDER BY MAX(birthday) DESC
    LIMIT 1
)
UNION
SELECT 'ELDEST' AS Type, name, birthday
FROM worker
GROUP BY name
HAVING MAX(birthday) IN(
    SELECT birthday
    FROM worker
    GROUP BY name
    ORDER BY MAX(birthday) 
    LIMIT 1
);
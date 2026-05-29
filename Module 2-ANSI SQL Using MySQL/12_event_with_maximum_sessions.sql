SELECT event_id, COUNT(session_id) AS session_count
FROM Sessions
GROUP BY event_id
HAVING COUNT(session_id) = (
    SELECT MAX(cnt) 
    FROM (SELECT COUNT(session_id) AS cnt FROM Sessions GROUP BY event_id) AS t
);

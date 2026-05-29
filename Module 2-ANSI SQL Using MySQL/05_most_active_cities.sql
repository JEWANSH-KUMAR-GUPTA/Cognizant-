SELECT e.city, COUNT(DISTINCT r.user_id) AS distinct_users
FROM Registrations r
JOIN Events e ON r.event_id = e.event_id
GROUP BY e.city
ORDER BY distinct_users DESC
LIMIT 5;

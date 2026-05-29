SELECT DISTINCT r.event_id, e.title
FROM Registrations r
JOIN Events e ON r.event_id = e.event_id
WHERE r.event_id NOT IN (SELECT DISTINCT event_id FROM Feedback);

SELECT e.event_id, e.title, e.start_date, u.full_name, u.city
FROM Registrations r
JOIN Users u ON r.user_id = u.user_id
JOIN Events e ON r.event_id = e.event_id
WHERE e.status = 'upcoming' AND e.city = u.city
ORDER BY e.start_date ASC;

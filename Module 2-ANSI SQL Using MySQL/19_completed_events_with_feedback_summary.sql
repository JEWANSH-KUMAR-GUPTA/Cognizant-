SELECT e.event_id, e.title, 
       (SELECT COUNT(r.registration_id) FROM Registrations r WHERE r.event_id = e.event_id) AS total_registrations,
       AVG(f.rating) AS avg_feedback_rating
FROM Events e
LEFT JOIN Feedback f ON e.event_id = f.event_id
WHERE e.status = 'completed'
GROUP BY e.event_id, e.title;

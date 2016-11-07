INSERT INTO restaurant (name, telephone, description) VALUES ('Heineken1', '666999661', 'F Heineken Bar in Madrid');
INSERT INTO restaurant (name, telephone, description) VALUES ('Heineken2', '666999662', 'S Heineken Bar in Madrid');
INSERT INTO restaurant (name, telephone, description) VALUES ('Heineken3', '666999663', 'T Heineken Bar in Madrid');

INSERT INTO menu (image, restaurant_id) SELECT X'01FF', id from restaurant where name = 'Heineken1';
INSERT INTO menu (image, restaurant_id) SELECT X'01FF', id from restaurant where name = 'Heineken2';
INSERT INTO menu (image, restaurant_id) SELECT X'01FF', id from restaurant where name = 'Heineken3';


INSERT INTO opening_time (day_week, open, close, restaurant_id) 
	SELECT 1, '09:00:00', '23:00:00', id  from restaurant where name = 'Heineken1';
INSERT INTO opening_time (day_week, open, close, restaurant_id) 
	SELECT 2, '09:00:00', '23:00:00', id  from restaurant where name = 'Heineken1';
INSERT INTO opening_time (day_week, open, close, restaurant_id) 
	SELECT 3, '09:00:00', '23:00:00', id  from restaurant where name = 'Heineken1';
INSERT INTO opening_time (day_week, open, close, restaurant_id) 
	SELECT 4, '09:00:00', '23:00:00', id  from restaurant where name = 'Heineken1';
INSERT INTO opening_time (day_week, open, close, restaurant_id) 
	SELECT 5, '09:00:00', '23:00:00', id  from restaurant where name = 'Heineken1';
INSERT INTO opening_time (day_week, open, close, restaurant_id) 
	SELECT 6, '09:00:00', '23:00:00', id  from restaurant where name = 'Heineken1';
	
	
INSERT INTO message (description, val_from, val_to) VALUES ('This is a generic message 1', '2016-01-01', '2016-01-01')
INSERT INTO message (description, location, val_from, val_to) VALUES ('This is a generic message 2', 'Parking', '2016-01-01', '2016-01-01')

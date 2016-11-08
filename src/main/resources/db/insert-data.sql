INSERT INTO restaurant (id, name, telephone, description) VALUES (0, 'Heineken1', '666999661', 'F Heineken Bar in Madrid');
INSERT INTO restaurant (id, name, telephone, description) VALUES (1, 'Heineken2', '666999662', 'S Heineken Bar in Madrid');
INSERT INTO restaurant (id, name, telephone, description) VALUES (2, 'Heineken3', '666999663', 'T Heineken Bar in Madrid');

INSERT INTO menu (id, name, image) VALUES (0, 'Heineken1 Menu1', X'01FF');
INSERT INTO menu (id, name, image) VALUES (1, 'Heineken1 Menu2', X'01FF');
INSERT INTO menu (id, name, image) VALUES (2, 'Heineken2 Menu1', X'01FF');
INSERT INTO menu (id, name, image) VALUES (3, 'Heineken2 Menu2', X'01FF');

INSERT INTO rel_restaurant_menu (restaurant_id, menu_id) VALUES (0, 0);
INSERT INTO rel_restaurant_menu (restaurant_id, menu_id) VALUES (0, 1);
INSERT INTO rel_restaurant_menu (restaurant_id, menu_id) VALUES (1, 2);
INSERT INTO rel_restaurant_menu (restaurant_id, menu_id) VALUES (1, 3);

INSERT INTO opening_time (day_week, open, close, restaurant_id) SELECT 1, '09:00:00', '23:00:00', id  from restaurant where name = 'Heineken1';
INSERT INTO opening_time (day_week, open, close, restaurant_id) SELECT 2, '09:00:00', '23:00:00', id  from restaurant where name = 'Heineken1';
INSERT INTO opening_time (day_week, open, close, restaurant_id) SELECT 3, '09:00:00', '23:00:00', id  from restaurant where name = 'Heineken1';
INSERT INTO opening_time (day_week, open, close, restaurant_id) SELECT 4, '09:00:00', '23:00:00', id  from restaurant where name = 'Heineken1';
INSERT INTO opening_time (day_week, open, close, restaurant_id) SELECT 5, '09:00:00', '23:00:00', id  from restaurant where name = 'Heineken1';
INSERT INTO opening_time (day_week, open, close, restaurant_id) SELECT 6, '09:00:00', '23:00:00', id  from restaurant where name = 'Heineken1';

INSERT INTO message (description, val_from, val_to) VALUES ('This is a generic message 1', '2016-01-01', '2016-01-01')
INSERT INTO message (description, location, val_from, val_to) VALUES ('This is a generic message 2', 'Parking', '2016-01-01', '2016-01-01')

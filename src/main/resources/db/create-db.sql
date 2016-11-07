CREATE TABLE restaurant (
  id        	INTEGER IDENTITY PRIMARY KEY,
  image			BLOB,
  name 			VARCHAR(30) NOT NULL,
  address 		VARCHAR(255),
  city 			VARCHAR(50),
  postcode 		VARCHAR(50), 
  
  telephone		VARCHAR(13)  NOT NULL,
  description	VARCHAR(200) NOT NULL
);

CREATE TABLE menu (
	id       		INTEGER IDENTITY PRIMARY KEY,
	image			BLOB	NOT NULL,
	restaurant_id 	INTEGER NOT NULL,
	FOREIGN KEY (restaurant_id) REFERENCES restaurant(id)
);

CREATE TABLE opening_time (
	day_week		INTEGER NOT NULL,-- Monday = 1, ...
	open			TIME	NOT NULL,
	close 			TIME 	NOT NULL,
	restaurant_id 	INTEGER NOT NULL,
	PRIMARY KEY (day_week, restaurant_id),
	FOREIGN KEY (restaurant_id) REFERENCES restaurant(id)
);

-- Security & Event messages
CREATE TABLE message (
	id       		INTEGER IDENTITY PRIMARY KEY,
	description		VARCHAR(140) NOT NULL,
	location		VARCHAR(50), -- null for events
	val_from		DATE NOT NULL,
	val_to			DATE NOT NULL
);


CREATE TABLE tourist
(
	idtourist SMALLINT PRIMARY KEY NOT NULL,
    name_tourist VARCHAR(30),
    surname_tourist VARCHAR(30),
    email_tourist VARCHAR(30),
    reserve_idreserve INT,
    reserve_reserve_auto VARCHAR(45),
    reserve_reserve_room VARCHAR(45)
) 
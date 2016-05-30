CREATE TABLE reserve
( 
	idreserve INT PRIMARY KEY NOT NULL,
    reserve_room VARCHAR(45) PRIMARY KEY NOT NULL,
    reserve_auto VARCHAR(45) PRIMARY KEY NOT NULL,
    summary_bill INT,
    auto_idauto SMALLINT NOT NULL,
    auto_price_a_day INT NOT NULL,
    room_idroom INT NOT NULL,
    room_price_a_day VARCHAR(10) NOT NULL
	 
)
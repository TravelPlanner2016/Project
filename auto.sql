CREATE TABLE auto
(
	idauto SMALLINT PRIMARY KEY NOT NULL,
    name_auto VARCHAR(30),
    year_birth DATE,
    quantity_sits SMALLINT,
    type_kpp VARCHAR(30),
    engine_type SMALLINT,
    fuel_burning SMALLINT,
    price_a_day INT PRIMARY KEY NOT NULL
)
    
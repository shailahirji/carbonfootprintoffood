-- take info from google/etc and enter in here to store into our db 
CREATE TABLE users (
    user_id INT AUTO_INCREMENT NOT NULL,
    user_Email VARCHAR(80),-- from outside source 
    user_Password VARCHAR(50),
    PRIMARY KEY (user_id)
);

drop table meals;
CREATE TABLE meals (
    meal_id INT AUTO_INCREMENT NOT NULL,
    user_id int,
    qty int NOT NULL,
    metric VARCHAR(10) NOT NULL,-- g/kg, l/ml, lbs/oz
    meal VARCHAR(225) NOT NULL,
    -- info gets fed through source DB, calculations before assignment 
    energy_used int,
    GHG_emission int,
    Eutrophication int, 
    Acidification_potential int, 
    PRIMARY KEY (meal_id),
	FOREIGN KEY (user_id)
        REFERENCES users (user_id)
    
);

insert into users (user_Email,user_Password)
values('shaila@hotmail.com','1234');


-- need to get userID 
insert into meals (qty,metric,meal)
values(2,'large','eggs');

drop table study_data;
CREATE TABLE study_data (
    id INT AUTO_INCREMENT,
    category varchar(225),
    wild_farmed varchar(225),
    product varchar(225),
    energy_mean decimal (5,3),
    energy_sd decimal(5,3),
    GHG_mean decimal(5,3),
    GHG_sd decimal(5,3),
	acid_mean decimal(5,3),
    acid_sd decimal(5,3),
	eutro_mean decimal(5,3),
    eutro_sd decimal(5,3),
    PRIMARY KEY (id)
);

load data local infile '~/Downloads/h4ts carbon footprint.txt' INTO table study_data;


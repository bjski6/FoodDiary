insert into cuisine (name) value ("Kuchnia Polska");
insert into cuisine (name) value ("Kuchnia Włoska");
insert into cuisine (name) value ("Kuchnia Śródziemnomorska");
insert into cuisine (name) value ("Kuchnia Francuska");
insert into cuisine (name) value ("Kuchnia Grecka");


insert into meal (name, recipe, cuisine_id) values ("Schab pieczony", "Rozgrzać piekarnik do 180st, piec schab z ziemniakami przez 55min", 1);
insert into meal (name, recipe, cuisine_id) values ("Spaghetti bolognese", "Ugotowany makaron dodać do duszonego mięsa mielonego z sosem bolognesee", 2);
insert into meal (name, recipe, cuisine_id) values ("Ratatouille", "Zapiekać w piekarniku rozgrzanym do 220st, posiekaną cukinię, bakłażana, mięso mielone wieprzowe",4);

insert into product (calories, carbohydrates, fat, name, protein, weight, meal_id) values (114,0,6,"Schab wieprzowy",15,270,1);
insert into product (calories, carbohydrates, fat, name, protein, weight, meal_id) values (76,17,0,"Ziemniaki",2,320,1);

insert into product (calories, carbohydrates, fat, name, protein, weight, meal_id) values (341,68,1,"Makaron spaghetti",15,125,2);
insert into product (calories, carbohydrates, fat, name, protein, weight, meal_id) values (147,0,7,"Mięso mielone wołowe",21,285,2);

insert into product (calories, carbohydrates, fat, name, protein, weight, meal_id) values (12,2,0,"Cukinia",1,155,3);
insert into product (calories, carbohydrates, fat, name, protein, weight, meal_id) values (20,4,0,"Bakłażan",1,185,3);
insert into product (calories, carbohydrates, fat, name, protein, weight, meal_id) values (114,22,2,"Sos meksykański salsa",2,165,3);


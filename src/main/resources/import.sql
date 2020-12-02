INSERT INTO person (country, create_at, email,firstname,lastname) VALUES('Argentina', '2020-10-10', 'ggortiz@gmail.com', 'juniors','fernandez');

INSERT INTO provider (address, firstname, lastname) VALUES('Los pinos 365',' lucia', 'Rocio');
INSERT INTO provider (address, firstname, lastname) VALUES('Cornejo 25',' Peralta', 'Ana');


INSERT INTO product (name,price,provider_fk) VALUES('Panasonic',2.5,1);
INSERT INTO product (name,price,provider_fk) VALUES('Energizer',36.2,1);
INSERT INTO product (name,price,provider_fk) VALUES('Everton',5.2,2);
INSERT INTO product (name,price,provider_fk) VALUES('Pilas',52.2,1)
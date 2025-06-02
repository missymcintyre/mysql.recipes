DROP TABLE IF EXISTS ingredient;
DROP TABLE IF EXISTS step;
DROP TABLE IF EXISTS recipe_category;
DROP TABLE IF EXISTS unit;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS recipe;

CREATE TABLE recipe (
	recipe_id INT NOT NULL,	
	recipe_name VARCHAR(128) NOT NULL,
	notes TEXT,
	prep_time TIME,
	cook_time TIME,
	created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE category (
	category_id INT NOT NULL,
	category_name VARCHAR(64) NOT NULL		
);

CREATE TABLE unit (
	unit_id INT NOT NULL,
	unit_name_singular VARCHAR(32) NOT NULL,
	unit_name_plural VARCHAR(36) NOT NULL
);

CREATE TABLE recipe_category (
	recipe_id INT NOT NULL,
	category_id INT NOT NULL
);

CREATE TABLE step (
	step_id INT NOT NULL,
	recipe_id INT NOT NULL,
	step_order INT NOT NULL,
	step_text TEXT NOT NULL
);

CREATE TABLE ingredient (
	ingredient_id INT NOT NULL,
	recipe_id INT NOT NULL,
	unit_id INT NOT NULL,
	ingredient_name VARCHAR(64) NOT NULL,
	instruction VARCHAR(64),
	ingredient_order INT NOT NULL,
	amount DECIMAL(7, 2)
	
);
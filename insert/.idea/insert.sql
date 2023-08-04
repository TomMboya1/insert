CREATE TABLE Ingredient (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    quantity INT,
    unit VARCHAR(50)
);
    INSERT INTO Ingredient (name, quantity, unit, price, gluten_free) VALUES
        ('Eggs', 12, 'pieces', 2.99, true),

        ('Bread', 1, 'loaf', 1.49, false),

        ('Beef Patty', 4, 'pieces', 8.99, true),

        ('Lettuce', 1, 'head', 1.29, true),

        ('Yoghurt', 1, 'container', 3.49, true);

    SELECT name FROM Ingredient;

    SELECT name, price FROM Ingredient;

    SELECT * FROM Ingredient ORDER BY name;

    SELECT * FROM Ingredient ORDER BY gluten_free DESC;
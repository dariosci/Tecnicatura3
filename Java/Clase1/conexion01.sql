-- Comenzamos con CRUD: Create (Insertar), Read (Leer), Update (actualizar), Delete (Eliminar)
-- Listar los estudiantes (read) //podemos reemplazar el * por el nombre de columnas que queramos ver
SELECT * FROM estudiantes2026;
-- Insertar estudiantes (insert)
INSERT INTO estudiantes2026 (nombre, apellido, telefono, email) VALUES ("Juan", "Perez", "2622665447", "juan@mail.com");
-- Actualizar estudiante (update)
UPDATE estudiantes2026 SET nombre="Juan Carlos", apellido="Garcia" WHERE idestudiantes2026=1;
-- Borrar estudiante (DELETE)
DELETE FROM estudiantes2026 WHERE idestudiantes2026=3;
-- Para modificar el idestudiantes2026 y comience en 1
ALTER TABLE estudiantes2026 AUTO_INCREMENT = 1;
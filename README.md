#ForoHub
#Descripción
ForoHub es una API REST que emula el funcionamiento de un foro en el cual los participantes pueden plantear sus preguntas sobre diferentes tópicos. Este proyecto está inspirado en el foro de Alura Latam, donde los estudiantes colaboran y aprenden juntos al resolver sus dudas sobre los cursos y proyectos en los que participan.

El objetivo de este proyecto es replicar el proceso de gestión de tópicos a nivel de back-end, implementando operaciones CRUD (Crear, Leer, Actualizar, Eliminar) utilizando Spring Framework.

#Funcionalidades
Nuestra API permite a los usuarios realizar las siguientes operaciones:

Crear un nuevo tópico
Mostrar todos los tópicos creados
Mostrar un tópico específico
Actualizar un tópico
Eliminar un tópico
#Requisitos del Proyecto
Java 17
Spring Boot
Spring Data JPA
PostgreSQL
Maven

#Instalación y Configuración

Clonar el repositorio
git clone https://github.com/tu-usuario/forohub.git
cd forohub

#Configurar la base de datos

Configura tu archivo application.properties (ubicado en src/main/resources) con las credenciales de tu base de datos PostgreSQL.
spring.datasource.url=jdbc:postgresql://localhost:5432/forohub
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

## Licencia
Este proyecto está licenciado bajo los términos de la licencia MIT. Ver el archivo LICENSE para más detalles.

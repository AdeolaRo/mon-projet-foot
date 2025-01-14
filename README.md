# mon-projet-foot

Clonez le repo puis lancer les services en construisant et démarrant les conteneurs :
docker-compose up --build

Accéder aux services :
Back-end Spring Boot : http://localhost:8080
Front-end Angular : http://localhost:4200

Communication entre le front et le back :

Configurez le front-end Angular pour appeler le back-end via l'URL http://backend:8080 (nom du service dans docker-compose.yml).

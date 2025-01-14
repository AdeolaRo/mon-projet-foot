# Étape 1 : Construire l'application Angular
FROM node:18 AS build

# Définir le répertoire de travail
WORKDIR /app

# Copier les fichiers du projet Angular
COPY package.json package-lock.json ./
RUN npm install

# Copier le reste des fichiers du projet Angular
COPY . .

# Construire le projet pour production
RUN npm run build -- --output-path=dist --configuration=production

# Étape 2 : Utiliser une image NGINX pour servir l'application
FROM nginx:1.25

# Copier les fichiers construits dans le répertoire dist vers le serveur NGINX
COPY --from=build /app/dist /usr/share/nginx/html

# Exposer le port 80
EXPOSE 80

# Commande par défaut pour lancer NGINX
CMD ["nginx", "-g", "daemon off;"]

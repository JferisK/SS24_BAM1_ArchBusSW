# Verwenden des offiziellen Nginx-Images als Basis
FROM nginx:alpine

# Setzen des Arbeitsverzeichnisses
WORKDIR /usr/share/nginx/html
WORKDIR /etc/nginx

# Entfernen der Standard-Nginx-Index-Datei
RUN rm -rf ./*

# Kopieren der HTML-, CSS- und JS-Dateien in das Arbeitsverzeichnis
COPY index.html .
COPY styles.css .
COPY script.js .
COPY ./nginx.conf ./conf.d/default.conf

# Exponieren des Standard-Nginx-Ports
EXPOSE 80
ENTRYPOINT [ "nginx" ]
# Starten von Nginx
CMD ["nginx", "-g", "daemon off;"]

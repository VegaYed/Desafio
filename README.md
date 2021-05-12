# Desafio

## Microservicio Overview


## Descargar imagen y lanzar microservicio

docker pull docker.pkg.github.com/vegayed/desafio/apidesafio:v1.0 

docker run docker.pkg.github.com/vegayed/desafio/apidesafio:v1.0

## ENDPOINTS

### Obtener todas las farmacias de una region, solo se necesita el id de la region.

    GET /region/?id_region={}

### Obtener todas las farmacias de una comuna, se necesitan dos parametros el id de la region y el nombre de la comuna como texto ej: &comuna="ARICA"

    GET farmacias/comuna/?id_region={id}&comuna={comuna}

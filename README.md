# SpringBootActuator


## Executar docker compose para subir o mysql
docker-compose -f docker-compose.yml up


## Caso a porta do mysql estiver sendo usada
sudo kill `sudo lsof -t -i:3306`


## Executar spring-boot run
mvn spring-boot:run


### Postman File
Importar Collection para postman

### Visualização do Postman

![Postman](https://github.com/weder96/SpringBootActuator/blob/main/documentation/postman_search_actuator.png)

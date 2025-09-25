Projeto CRUD Simples

Esse repositório tem um projeto CRUD feito com Java Spring Boot.

A ideia é ser um passo de aprendizado, mostrando como manipular variáveis usando chamadas REST.

O código principal está dentro do controller, de forma didática.
O objetivo é treinar o uso dos diferentes recursos do REST: Path Variables, Query Parameters, Headers e Request Body, além de aprender a filtrar listas usando eles.

Como rodar

Inicie a aplicação com o Maven

A API vai estar disponível em: http://localhost:8080

Banco de Dados

O projeto usa PostgreSQL como banco.
As migrações do banco são feitas com o Flyway.

Passo a passo

Crie um banco no PostgreSQL chamado product.

Abra o projeto no IntelliJ IDEA.

Configure o arquivo application.properties com o IP, porta, usuário, senha e nome do banco.

Faça um clean build (mvn clean install).

Rode a classe principal para iniciar a aplicação.

Observações

Esse projeto é só pra estudo, então a lógica de negócio está bem simplificada e concentrada no controller.

Você pode testar os diferentes endpoints REST, brincar com filtros, ordenação e operações de CRUD.

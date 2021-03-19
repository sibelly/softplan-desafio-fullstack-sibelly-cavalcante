<h1 align="center">
  <img alt="Logo" src="https://www.softplan.com.br/wp-content/themes/softplan-2019/imagens/logo_versao_positiva.svg" width="200px">
</h1>

<h3 align="center">
  Aplicação para teste da Softplan Planejamento e Sistemas Ltda.
</h3>

<p align="center">Gerenciar seus processos e pareceres!</p>

<p align="center">
  <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/sibelly/softplan-desafio-fullstack-sibelly-cavalcante?color=%23FF9000">

  <a href="https://www.linkedin.com/in/sibelly/" target="_blank" rel="noopener noreferrer">
    <img alt="Feito por" src="https://img.shields.io/badge/made%20by-sibelly%20cavalcante-%23FF9000">
  </a>

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/sibelly/softplan-desafio-fullstack-sibelly-cavalcante?color=%23FF9000">

  <a href="https://github.com/sibelly/softplan-desafio-fullstack-sibelly-cavalcante/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/sibelly/softplan-desafio-fullstack-sibelly-cavalcante?color=%23FF9000">
  </a>

  <a href="https://github.com/sibelly/softplan-desafio-fullstack-sibelly-cavalcante/issues">
    <img alt="Repository issues" src="https://img.shields.io/github/issues/sibelly/softplan-desafio-fullstack-sibelly-cavalcante?color=%23FF9000">
  </a>

  <img alt="GitHub" src="https://img.shields.io/github/license/sibelly/softplan-desafio-fullstack-sibelly-cavalcante?color=%23FF9000">
</p>

<p align="center">
  <a href="#%EF%B8%8F-sobre-o-projeto">Sobre o projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-inicializando-o-projeto">Inicializando o projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-licenca">Licença</a>
</p>

<p id="insomniaButton" 
align="center">
  <a href="https://insomnia.rest/run/?label=ApiGerenciarProcessos%20-%20sibelly&uri=https%3A%2F%2Fraw.githubusercontent.com%2Fsibelly%2Fsoftplan-desafio-fullstack-sibelly-cavalcante%2Fmaster%2FInsomnia.json" target="_blank"><img src="https://insomnia.rest/images/run.svg" alt="Executar no Insomnia"></a>
</p>

## 💻 Sobre o projeto

Uma aplicação web responsável por gerenciar processos.

- Visão de administrador

Incluir, excluir, atualizar e visualizar usuários.

- Visão de usuário-triador

Incluir e visualizar processos,
Atribuir um ou mais usuários a realizar um parecer sobre um processo.

- Visão de usuário-finalizador

Visualizar processos pendentes de parecer.
Incluir o parecer sobre o processo.

## 💻 Inicializando o projeto

Importe o `Insomnia.json` no [Insomnia](https://insomnia.rest/download) ou clique no botão [Run in Insomnia](#insomniaButton)

### Requisitos

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Apache Maven](https://maven.apache.org/)
- [Docker](https://www.docker.com/)
- [Yarn](https://classic.yarnpkg.com/) or [npm](https://www.npmjs.com/)
- [React](https://pt-br.reactjs.org/)

> Obs.: Recomendo a utilização de docker para a api

### Executar os projetos
Seguir os passos listados nos repositórios:
- [Backend](https://github.com/sibelly/softplan-desafio-fullstack-sibelly-cavalcante/tree/develop/api-gerenciar-processos)
- [Frontend](https://github.com/sibelly/softplan-desafio-fullstack-sibelly-cavalcante/tree/develop/front-gerenciar-processos)

### Sobre o desafio

Aprendi a utilizar o [Spring Boot](https://spring.io/projects/spring-boot) e entender seu funcionamento na criação da autenticação utilizando [Jwt token](https://jwt.io/) e [Bcrypt](https://www.npmjs.com/package/bcrypt) para segurança das informações. E a diferença entre OncePerRequestFilter e HandlerInterceptor para criação dos middlewares que interceptam as requisições, nesse caso para confirmar a existência de um token.

O login está sendo feito pelo front. Porém em relação às outras tarefas o front não ficou completo.
Já a api está mais completa cumprindo a maioria do requisitos listados.

Foi utilizado o banco em memória [H2](https://www.h2database.com/html/main.html).

### Melhorias no projeto

- Finalizar front para criar usuário e para os outros recursos (processos e pareceres)
- Dockerizar o front.
- Configurar um banco de dados sem ser da memória (MySQL, PostgreSQL).

## 📝 Licença

Esse projeto utiliza a licença MIT License - veja o arquivo [LICENSE](LICENSE) para maiores detalhes.

---

Feito com amor 💜 &nbsp;por Sibelly Cavalcante 👋 &nbsp;[Veja meu linkedin](https://www.linkedin.com/in/sibelly-cavalcante/)
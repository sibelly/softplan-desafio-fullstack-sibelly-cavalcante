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
  <a href="https://insomnia.rest/run/?label=ApiGerenciarProcessos%20-%20sibelly&uri=https%3A%2F%2Fraw.githubusercontent.com%2Fsibelly%2Fsoftplan-desafio-fullstack-sibelly-cavalcante%2Fblob%2Fmaster%2FInsomnia.json" target="_blank"><img src="https://insomnia.rest/images/run.svg" alt="Executar no Insomnia"></a>
</p>

## 💇🏻‍♂️ Sobre o projeto

Uma aplicação web responsável por gerenciar processos.

- Visão de administrador

Incluir, excluir, atualizar e visualizar usuários.

- Visão de usuário-triador

Incluir e visualizar processos,
Atribuir um ou mais usuários a realizar um parecer sobre um processo.

- Visão de usuário-finalizador

Visualizar processos pendentes de parecer.
Incluir o parecer sobre o processo.


## 🚀 Tecnologias

Tecnologias utilizadas

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Docker](https://www.docker.com/)

## 💻 Inicializando o projeto

Importe o `Insomnia.json` on Insomnia App or click on [Run in Insomnia](#insomniaButton) button

### Requisitos

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Apache Maven](https://maven.apache.org/)
- [Docker](https://www.docker.com/)
- [Yarn](https://classic.yarnpkg.com/) or [npm](https://www.npmjs.com/)

> Obs.: Recomendo a utilização de docker

**Clonar o projeto e acessar a pasta**

```bash
$ git clone https://github.com/sibelly/softplan-desafio-fullstack-sibelly-cavalcante.git && cd api-gerenciar-projetos
```

**Siga os passos a seguir**

```bash
# Instala as dependências
$ mvn clean install

# Cria imagem a partir da Dockerfile
$ docker build  -t api-gerenciar-processos . 

# Executa o container a partir da imagem criada no comando anterior
$ docker run --name api-gerenciar-processos -p 8080:8080 api-gerenciar-processos

# Muito bem, o projeto da api foi inicializado!
```
## 📝 Licença

Esse projeto utiliza a licença MIT License - veja o arquivo [LICENSE](LICENSE) para maiores detalhes.

---

Feito com amor 💜 &nbsp;by Sibelly Cavalcante 👋 &nbsp;[Veja meu linkedin](https://www.linkedin.com/in/sibelly-cavalcante/)
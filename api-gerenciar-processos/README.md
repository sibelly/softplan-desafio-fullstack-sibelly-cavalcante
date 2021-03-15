<h1 align="center">
  <img alt="Logo" src="https://www.softplan.com.br/wp-content/themes/softplan-2019/imagens/logo_versao_positiva.svg" width="200px">
</h1>

<h3 align="center">
  Aplicação backend para gerenciar seus processos e pareceres.
</h3>

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
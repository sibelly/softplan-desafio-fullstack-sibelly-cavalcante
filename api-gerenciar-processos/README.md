<h1 align="center">
  <img alt="Logo" src="https://www.softplan.com.br/wp-content/themes/softplan-2019/imagens/logo_versao_positiva.svg" width="200px">
</h1>

<h3 align="center">
  Aplicação backend para gerenciar seus processos e pareceres.
</h3>

<p id="insomniaButton" 
align="center">
  <a href="https://insomnia.rest/run/?label=ApiGerenciarProcessos%20-%20sibelly&uri=https%3A%2F%2Fraw.githubusercontent.com%2Fsibelly%2Fsoftplan-desafio-fullstack-sibelly-cavalcante%2Fmaster%2FInsomnia.json" target="_blank"><img src="https://insomnia.rest/images/run.svg" alt="Executar no Insomnia"></a>
</p>

## 💻 Inicializando o projeto

Importe o `Insomnia.json` no Insomnia App ou clique no botão [Run in Insomnia](#insomniaButton)

### Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Apache Maven](https://maven.apache.org/)
- [Docker](https://www.docker.com/)
- [Spring Security](https://spring.io/projects/spring-security)
- [Jwt](https://jwt.io/)
- [Bcrypt](https://www.npmjs.com/package/bcrypt)
- [H2](https://www.h2database.com/html/main.html)

> Obs.: Recomendo a utilização de docker

**Clonar o projeto e acessar a pasta**

```bash
$ git clone https://github.com/sibelly/softplan-desafio-fullstack-sibelly-cavalcante.git && cd api-gerenciar-projetos
```

**Siga os passos a seguir**

```bash
# Instala as dependências
$ mvn clean install

# Sem a utilização do docker
mvn spring-boot:run

# Utilizando docker
# Cria imagem a partir da Dockerfile
$ docker build  -t api-gerenciar-processos . 

# Executa o container a partir da imagem criada no comando anterior
$ docker run --name api-gerenciar-processos -p 8080:8080 api-gerenciar-processos

# Muito bem, o projeto da api foi inicializado!
```
## 📝 Licença

Esse projeto utiliza a licença MIT License - veja o arquivo [LICENSE](LICENSE) para maiores detalhes.

---

Feito com amor 💜 &nbsp;por Sibelly Cavalcante 👋 &nbsp;[Veja meu linkedin](https://www.linkedin.com/in/sibelly-cavalcante/)
# Projeto de Estudo: API de Autenticação com Java Spring Boot

Este projeto é um estudo prático que visa adaptar e aprofundar minhas habilidades de desenvolvimento de Web APIs, migrando do ecossistema .NET/C# para o ambiente Java com Spring Boot. O foco principal é a construção de um sistema de autenticação robusto e a implementação de uma API RESTful completa, seguindo as melhores práticas de mercado.

## 🎯 Objetivos

*   Desenvolver um sistema de autenticação de usuário utilizando JSON Web Tokens (JWT).
*   Implementar um mecanismo de reautenticação com Refresh Tokens.
*   Estruturar endpoints com diferentes níveis de acesso (públicos e privados).
*   Criar um CRUD básico para testar a interação da API com um banco de dados PostgreSQL.
*   Aplicar middlewares para autenticação e tratamento centralizado de erros.
*   Integrar ferramentas de documentação e observabilidade.

## ✨ Funcionalidades

-   **Sistema de Autenticação:**
    -   Autenticação de usuário com credenciais (login e senha) e retorno de um token JWT.
    -   Sistema de Refresh Token para renovar a sessão do usuário sem a necessidade de novas credenciais.
-   **Endpoints da API:**
    -   **Endpoints Anônimos:** Rotas para autenticação de usuários e para verificação de saúde da aplicação.
    -   **Endpoints Autenticados:** Rotas protegidas que necessitam de um JWT válido (via Cookie ou cabeçalho) para acessar funcionalidades como um CRUD básico.
-   **Middleware:**
    -   **Autenticação:** Um middleware que intercepta requisições para validar o token JWT em rotas protegidas.
    -   **Tratamento de Erros:** Um handler global para capturar e formatar exceções, retornando respostas de erro padronizadas.
-   **Observabilidade:**
    -   **Logging:** Logs estruturados com **Logback** e enviados para o **Grafana Loki** através de um appender customizado.
    -   **Métricas:** Exposição de métricas da aplicação utilizando **Micrometer**.
    -   **Tracing:** Rastreamento distribuído de requisições implementado com **Micrometer Tracing Bridge** e **OpenTelemetry**.

## 🛠️ Tecnologias Utilizadas

-   **Linguagem e Framework:**
    -   Java
    -   Spring Boot
-   **Segurança:**
    -   Spring Security
    -   JSON Web Tokens (JWT)
-   **Banco de Dados:**
    -   PostgreSQL
    -   Spring Data JPA
-   **Documentação da API:**
    -   Swagger (Springdoc OpenAPI)
-   **Observabilidade:**
    -   Logback
    -   Grafana Loki
    -   Micrometer (Metrics & Tracing)
    -   OpenTelemetry

## 🚀 Como Executar (Exemplo)

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/bigparty1/JavaSpringBootAuth.git
    cd JavaSpringBootAuth
    ```

2.  **Configure as variáveis de ambiente:**
    Crie um arquivo `.env` (ou configure no `application.properties`) com as credenciais do banco de dados e as chaves para JWT.

3.  **Execute a aplicação:**
    ```bash
    ./mvnw spring-boot:run
    ```

4.  **Acesse a documentação da API:**
    Após iniciar a aplicação, acesse a interface do Swagger no seu navegador para interagir com a API..

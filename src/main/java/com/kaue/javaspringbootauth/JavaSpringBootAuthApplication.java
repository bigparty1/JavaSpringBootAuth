// Define o pacote principal da aplicação
package com.kaue.javaspringbootauth;

// Importa a classe responsável por inicializar a aplicação Spring Boot
import org.springframework.boot.SpringApplication;
// Importa a anotação que marca a classe principal de uma aplicação Spring Boot
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Indica que esta é a classe principal da aplicação Spring Boot
@SpringBootApplication
public class JavaSpringBootAuthApplication {

    // Função principal que inicia a aplicação
    public static void main(String[] args) {
        // Executa a aplicação Spring Boot usando a classe atual como configuração
        SpringApplication.run(JavaSpringBootAuthApplication.class, args);
    }

}

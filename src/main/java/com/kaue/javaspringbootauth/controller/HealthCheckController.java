// Define o pacote onde está localizado o controller
package com.kaue.javaspringbootauth.controller;

// Importa anotação para documentação Swagger/OpenAPI
import io.swagger.v3.oas.annotations.Operation;
// Importa anotação para mapear requisições GET
import org.springframework.web.bind.annotation.GetMapping;
// Importa anotação para mapear o caminho base do controller
import org.springframework.web.bind.annotation.RequestMapping;
// Importa anotação para definir a classe como um controller REST
import org.springframework.web.bind.annotation.RestController;

// Indica que esta classe é um controller REST, retornando dados diretamente no corpo da resposta
@RestController
// Define o caminho base para todas as rotas deste controller
@RequestMapping("/api/health")
public class HealthCheckController {

    // Mapeia requisições GET para o endpoint /api/health/check
    @GetMapping("/check")
    // Documentação da rota para Swagger/OpenAPI
    @Operation(summary = "Verifica se a API está online", description = "Retorna 'OK' se a aplicação estiver rodando corretamente")
    public String healthCheck() {
        // Retorna a string "OK" indicando que a API está funcionando
        return "OK";
    }
}
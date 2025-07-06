package com.kaue.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthCheckController {

    @GetMapping("/check")
    @Operation(summary = "Verifica se a API está online", description = "Retorna 'OK' se a aplicação estiver rodando corretamente")
    public String healthCheck() {
        return "OK";
    }
}

// Define o pacote onde está localizada a configuração de segurança
package com.kaue.javaspringbootauth.config;

// Importa a anotação para definir beans de configuração
import org.springframework.context.annotation.Bean;
// Importa a anotação para indicar que esta classe é uma configuração Spring
import org.springframework.context.annotation.Configuration;
// Importa classe para configurar regras de segurança HTTP
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// Importa anotação para habilitar a segurança web no projeto
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// Importa classe para customizar configurações HTTP
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
// Importa a interface da cadeia de filtros de segurança
import org.springframework.security.web.SecurityFilterChain;

// Indica que esta classe contém configurações do Spring
@Configuration
// Ativa a configuração de segurança web do Spring Security
@EnableWebSecurity
public class SecurityConfig {

    // Define o bean responsável pela configuração da cadeia de filtros de segurança
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        // Desabilita a proteção CSRF (Cross-Site Request Forgery) para facilitar testes e uso de APIs
        http
                .csrf(AbstractHttpConfigurer::disable)
                // Configura as regras de autorização para as requisições HTTP
                .authorizeHttpRequests(auth -> auth
                        // Libera o acesso sem autenticação para os endpoints abaixo:
                        // - /api/health/check: endpoint de verificação de saúde da aplicação
                        // - /swagger-ui/** e /swagger-ui.html: interface do Swagger para documentação da API
                        // - /v3/api-docs/**: endpoint de documentação OpenAPI
                        .requestMatchers(
                                "/api/health/check",
                                "/swagger-ui/**",
                                "/v3/api-docs/**",
                                "/swagger-ui.html"
                        ).permitAll()
                        // Exige autenticação para qualquer outra requisição
                        .anyRequest().authenticated()
                );
        // Constrói e retorna a cadeia de filtros configurada
        return http.build();
    }
}

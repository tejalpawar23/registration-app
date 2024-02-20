package net.codejava;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.function.Predicate;

@Configuration
public class SwaggerConfig {

   public Docket SwaggerApi() {
       return new Docket(DocumentationType.SWAGGER_2)
               .select()
               .apis((Predicate<RequestHandler>) RequestHandlerSelectors.any())
               .paths((Predicate<String>) PathSelectors.any())
               .build();
   }
}
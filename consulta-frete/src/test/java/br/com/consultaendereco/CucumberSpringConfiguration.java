package br.com.consultaendereco;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = ConsultaEnderecoApplication.class)
@ContextConfiguration
public class CucumberSpringConfiguration {
}


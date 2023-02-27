package br.com.consultafrete;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = ConsultaFreteApplication.class)
@ContextConfiguration
public class CucumberSpringConfiguration {
}


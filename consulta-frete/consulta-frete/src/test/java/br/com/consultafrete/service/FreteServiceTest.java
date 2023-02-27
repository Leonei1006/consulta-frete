package br.com.consultafrete.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FreteServiceTest {


    public class FreteTest {

        private FreteService frete = new FreteService();

        @Test
        @DisplayName("Deve retornar valor do frete para estado de São Paulo")
        public void testCalcularFreteSP() {
            String uf = "SP";
            Double valorEsperado = 7.85;

            Double valorFrete = frete.calcularFrete(uf);

            Assertions.assertEquals(valorEsperado, valorFrete);
        }

        @Test
        @DisplayName("Deve retornar valor do frete para estado da Pernambuco")
        public void testCalcularFreteRJ() {
            String uf = "PB";
            Double valorEsperado = 15.98;

            Double valorFrete = frete.calcularFrete(uf);

            Assertions.assertEquals(valorEsperado, valorFrete);
        }

        @Test
        @DisplayName("Deve retornar null para UF inexistente")
        public void testCalcularFreteUFInvalida() {
            String uf = "XY";

            Double valorFrete = frete.calcularFrete(uf);

            Assertions.assertNull(valorFrete);
        }
    }


}


package br.com.consultaendereco;

import br.com.consultaendereco.service.FreteService;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class CalcularFretePorEstadoSteps {

    private String uf;
    private Double valor;

    @Autowired
    private FreteService freteService;

    @Dado("um estado {String}")
    public void um_estado(String uf) {
        this.uf = uf;
    }

    @Quando("calcular o frete")
    public void calcular_o_frete() {
        this.valor = freteService.calcularFrete(uf);
    }

    @Entao("o valor do frete deve ser {Double}")
    public void o_valor_do_frete_deve_ser(Double valor) {
        Assert.assertEquals(valor, this.valor);
    }

}

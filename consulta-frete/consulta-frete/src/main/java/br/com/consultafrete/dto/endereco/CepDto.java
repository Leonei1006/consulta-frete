package br.com.consultafrete.dto.endereco;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public class CepDto {

    @NotBlank(message = "CEP inválido! ")
    @Length(min = 8, max = 8, message = "O CEP deve ser digitado com 8 caracteres!")
    private String cep;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}

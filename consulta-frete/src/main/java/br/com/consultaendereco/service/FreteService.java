package br.com.consultaendereco.service;

import br.com.consultaendereco.dto.FreteDto;
import br.com.consultaendereco.dto.endereco.EnderecoDto;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FreteService {

    private static final String URL_BASE = "https://viacep.com.br/ws/";

    private final RestTemplate restTemplate = new RestTemplate();


    public EnderecoDto buscarEnderecoPorCep(String cep) {
        ResponseEntity<EnderecoDto> response = restTemplate.exchange(
                URL_BASE + cep + "/json/",
                HttpMethod.GET,
                null,
                EnderecoDto.class);

        if (response.getStatusCode() == HttpStatus.OK) {
            EnderecoDto endereco = response.getBody();
            if (endereco.getCep() != null) {
                return endereco;
            }
        }

        return null;
    }
    public FreteDto getFrete(String cep){
        EnderecoDto enderecoDto = buscarEnderecoPorCep(cep);
        double valorFrete = calcularFrete(enderecoDto.getUf());
        return new FreteDto(enderecoDto, valorFrete);
    }

    public Double calcularFrete(String uf) {
        switch (uf.toUpperCase()) {
            case "SP":
            case "RJ":
            case "MG":
            case "ES":
                return 7.85;
            case "MS":
            case "MT":
            case "GO":
            case "DF":
                return 12.50;
            case "BA":
            case "SE":
            case "AL":
            case "PE":
            case "PB":
            case "RN":
            case "CE":
            case "PI":
            case "MA":
                return 15.98;
            case "RS":
            case "PR":
            case "SC":
                return 17.30;
            case "AC":
            case "AP":
            case "AM":
            case "PA":
            case "RO":
            case "RR":
            case "TO":
                return 20.83;
            default:
                return null;
        }
    }
}

package br.com.consultaendereco.dto;

import br.com.consultaendereco.dto.endereco.EnderecoDto;

public class FreteDto {

    private String cep;
    private String rua;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private double frete;

    public FreteDto(EnderecoDto enderecoDto, double valorFrete) {
        this.cep = enderecoDto.getCep();
        this.rua = enderecoDto.getLogradouro();
        this.complemento = enderecoDto.getComplemento();
        this.bairro = enderecoDto.getBairro();
        this.cidade = enderecoDto.getLocalidade();
        this.estado = enderecoDto.getUf();
        this.frete = valorFrete;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }
}


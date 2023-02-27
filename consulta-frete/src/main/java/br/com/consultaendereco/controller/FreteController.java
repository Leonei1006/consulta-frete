package br.com.consultaendereco.controller;

import br.com.consultaendereco.dto.FreteDto;
import br.com.consultaendereco.dto.endereco.CepDto;
import br.com.consultaendereco.service.FreteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@Tag(name = "Frete", description = "Endpoints para informacoes relacionadas ao frete.")
public class FreteController {

    @Autowired
    private FreteService freteService;

    @Operation(summary = "Consulta o frete com base no CEP informado.", tags = {"Frete" })
    @PostMapping("consulta-endereco")
    public ResponseEntity<FreteDto> consultaEndereco(@RequestBody @Valid CepDto dto) {
        return new ResponseEntity<>(freteService.getFrete(dto.getCep()), HttpStatus.OK);
    }

}


package com.poo.rock.controller;

import com.poo.rock.dto.ClienteDto;
import com.poo.rock.model.ClienteModel;
import com.poo.rock.model.FuncionarioModel;
import com.poo.rock.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/cliente")

public class ClenteController {
    @Autowired
     ClienteRepository clienteRepository;
    @PostMapping
    public ResponseEntity<ClienteModel> CriarCliente(@Valid @RequestBody ClienteDto clienteDto) {
        var clienteModel = new ClienteModel();

        BeanUtils.copyProperties(clienteDto, clienteModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(clienteModel));
    }
    @GetMapping
    public ResponseEntity<List<FuncionarioModel>> ListarCliente() {
        return ResponseEntity.status(
                HttpStatus.OK).body(clienteRepository.findAll());

    }
}

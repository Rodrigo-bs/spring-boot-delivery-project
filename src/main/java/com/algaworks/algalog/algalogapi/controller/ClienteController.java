package com.algaworks.algalog.algalogapi.controller;

import java.util.Arrays;
import java.util.List;

import com.algaworks.algalog.algalogapi.model.Cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    @GetMapping("/clientes")
    public List<Cliente> listar() {
        Cliente cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Pedro");
        cliente1.setTelefone("+556899999999");
        cliente1.setEmail("email@email.com");

        Cliente cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Maria");
        cliente2.setTelefone("+556899999999");
        cliente2.setEmail("email2@email.com");

        return Arrays.asList(cliente1, cliente2);
    }

}

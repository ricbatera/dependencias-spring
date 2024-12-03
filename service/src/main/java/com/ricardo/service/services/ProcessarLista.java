package com.ricardo.service.services;

import com.ricardo.banco_de_dados.model.Carro;
import com.ricardo.banco_de_dados.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProcessarLista {

    @Autowired
    private CarroRepository carroRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void run(){
        System.out.println("****** APLICAÇÃO DE DEMONSTRAÇÃO ****");
        System.out.println("Chamada automática quando o spring é iniciado");

        System.out.println("Listando todos os carros no banco");
        List<Carro> list = carroRepository.findAll();

        list.forEach(System.out::println);
    }
}

package com.ricardo.api.service;

import com.ricardo.api.to.CarroRequest;
import com.ricardo.api.to.CarroResponse;
import com.ricardo.banco_de_dados.model.Carro;
import com.ricardo.banco_de_dados.repository.CarroRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    private ModelMapper mapper = new ModelMapper();

    public CarroResponse newCar(CarroRequest request){
        Carro carro = mapper.map(request, Carro.class);
        Carro response = carroRepository.save(carro);
        return mapper.map(response, CarroResponse.class);
    }

    public List<CarroResponse> allCars(){
        List<Carro> list = carroRepository.findAll();
        return list.stream().map(this::convertCarroInCarroResponse).toList();
    }

    private CarroResponse convertCarroInCarroResponse(Carro carro){
        return mapper.map(carro, CarroResponse.class);
    }
}

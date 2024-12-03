package com.ricardo.api.controller;

import com.ricardo.api.service.CarroService;
import com.ricardo.api.to.CarroRequest;
import com.ricardo.api.to.CarroResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private CarroService carroService;

    @GetMapping("/hello")
    public String getMethodName() {
        return "Api respondendo - endpoint de teste";
    }

    @PostMapping("/new-car")
    public CarroResponse newCar(@RequestBody  CarroRequest request){
        return carroService.newCar(request);
    }

    @GetMapping("all-cars")
    public List<CarroResponse> allCars(){
        return carroService.allCars();
    }

}

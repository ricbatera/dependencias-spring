package com.ricardo.api.to;

import lombok.Data;

@Data
public class CarroResponse {

    private Long id;
    private String marca;
    private String modelo;
    private String ano;
}

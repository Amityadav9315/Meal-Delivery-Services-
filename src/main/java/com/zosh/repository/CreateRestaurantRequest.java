package com.zosh.repository;


import com.sun.jdi.request.StepRequest;
import com.zosh.model.ContactInformation;
import lombok.Data;

import java.util.List;

@Data
public class CreateRestaurantRequest {

    private  Long id;

    private String name;

    private  String description;

    private  String cuisineType;

    private  String address;

    private ContactInformation contactInformation;

    private  String openingHours;

    private List<String>   images;

}

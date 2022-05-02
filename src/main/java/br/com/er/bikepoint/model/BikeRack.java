package br.com.er.bikepoint.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class BikeRack {

    private String id;
    private String name;
    private Integer capacity;
    private List<Photo> photos;
}

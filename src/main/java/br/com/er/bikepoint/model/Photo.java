package br.com.er.bikepoint.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Photo {

    private String id;
    private String name;
    private String ext;
    private Byte[] file;
}

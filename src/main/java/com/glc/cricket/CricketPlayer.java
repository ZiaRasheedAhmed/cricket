package com.glc.cricket;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CricketPlayer {
    private Long id;
    private String name;
    private String country;
    private Long average;

    public CricketPlayer(){

    }
    public CricketPlayer(int i, String name, String country, int j){
        this.id = id;
        this.name = name;
        this.country = country;
        this.average = average;
    }
}

package com.revature.serialize;

import java.io.Serializable;

public class Hat implements Serializable {
    private static final long serialVersionUID = 1L;
    private String type;
    private double cost;

    public Hat (String type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    
}
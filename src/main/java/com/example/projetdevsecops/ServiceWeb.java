package com.example.projetdevsecops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ServiceWeb {

    ArrayList<Moto> motos = new ArrayList<Moto>();

    public ServiceWeb() {
        Moto moto = new Moto("AA11BB", "Yamaha", 2000);
        motos.add(moto);
        moto = new Moto("BB22CC", "Honda", 1000);
        motos.add(moto);
        moto = new Moto("CC33DD", "Kawasaki", 500);
        motos.add(moto);
        moto = new Moto("DD44EE", "Ducati", 300);
        motos.add(moto);
        moto = new Moto("EE55FF", "Test", 200);
        motos.add(moto);
    }

    @GetMapping("/motos/{plateNumber}")
    public Moto disBonjour(@PathVariable("plateNumber") String plaque) {
        int i = 0;
        while (i < motos.size() && !motos.get(i).getPlateNumber().equals(plaque)) {
            i++;
        }
        if (i < motos.size()) {
            return motos.get(i);
        } else {
            return null;
        }
    }
}
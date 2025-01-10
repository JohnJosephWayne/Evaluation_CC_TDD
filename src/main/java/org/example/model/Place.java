package org.example.model;

import java.time.LocalDateTime;

public class Place {
    private int numero;
    private Car parkedCar;
    private LocalDateTime debuthour;

    public Place(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Le numéro de place doit être positif.");
        }
        this.numero = numero;
    }

    public boolean isFree() {
        return parkedCar == null;
    }

    public void parkedPlace(Car car) {
        if (!isFree()) {
            throw new IllegalStateException("La place est déjà occupée.");
        }
        this.parkedCar= car;
    }
    public void unparkedPlace(Car car, Place place) {
        if (isFree()) {
            throw new IllegalStateException("La place est déjà libre.");
        }
        parkedCar = null;
        place.isFree();
    }

        public double paidPlace(double hourPay) {
        if (isFree()) {
            throw new IllegalStateException("La place est déjà libre.");
        }
        LocalDateTime hourEnd = LocalDateTime.now();
        double time = java.time.Duration.between(debuthour, hourEnd).toMinutes() / 60.0;
        parkedCar = null;
        debuthour = null;
        return (time) * hourPay;
    }

    public int getNumero (int numero){
        return numero;
    }
}

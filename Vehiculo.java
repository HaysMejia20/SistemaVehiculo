/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haysm
 */
class Automovil extends Vehiculo {
    private final int capacidadPasajeros;

    public Automovil(String nombre, int capacidadPasajeros) {
        super(nombre);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    @Override
    public void acelerar(int velocidad) {
        System.out.println(getNombre() + " está acelerando a " + velocidad + " km/h.");
    }

    @Override
    public void frenar() {
        System.out.println(getNombre() + " está frenando.");
    }
}

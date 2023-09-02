/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haysm
 */
public class Main {
    public static void main(String[] args) {
        // Crear instancias de diferentes vehículos
        Vehiculo automovil = new Automovil("Automóvil Toyota", 5);
        Vehiculo bicicleta = new Bicicleta("Bicicleta de montaña");

        // Acelerar y frenar los vehículos
        automovil.acelerar(60);
        automovil.frenar();

        bicicleta.acelerar(20);
        bicicleta.frenar();
    }
}


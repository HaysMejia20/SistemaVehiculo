/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haysm
 */
class Bicicleta extends Vehiculo {
    public Bicicleta(String nombre) {
        super(nombre);
    }

    public void Bicicleta(String bicicleta_de_montaña) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void acelerar(int velocidad) {
        System.out.println(getNombre() + " está pedaleando más rápido.");
    }

    
    public void frenar() {
        System.out.println(getNombre() + " está frenando.");
    }
}


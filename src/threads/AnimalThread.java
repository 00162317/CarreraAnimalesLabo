/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import carrera.gui.Gui;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author UCA
 */
public class AnimalThread extends Thread {

    private String nombre;
    private int limite;
    private JLabel animal;
    private int x;
    private int y;
    public AnimalThread() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public AnimalThread(String nombre, int limite, JLabel animal, int x, int y) {
        this.nombre = nombre;
        this.limite = limite;
        this.animal = animal;
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        
        for (int i = x; i <= this.limite; i += 10) {
            System.out.println(this.nombre + "avanza");
            this.animal.setLocation(i, y);
            try {
                if(this.nombre.equals("tortuga")){
                    sleep(200);
                }
                if(this.nombre.equals("dragon")){
                    sleep(50);
                }
                else{
                    sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
        
        
           JOptionPane.showMessageDialog(animal, "El animal "+this.nombre+" llego");
           JOptionPane.showMessageDialog(animal, "El animal "+this.nombre+" llego");
           JOptionPane.showMessageDialog(animal, "El animal "+this.nombre+" llego");
//System.out.println(this.nombre + " ha llegado a la meta");
        
        yield();

    }
    
    
}

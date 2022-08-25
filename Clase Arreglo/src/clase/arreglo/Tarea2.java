/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.arreglo;


import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String numerosDat = JOptionPane.showInputDialog("ELEMENTOS A REGISTRARAR?");
        int numeDatos = Integer.parseInt(numerosDat);
        Arreglo[] arr = new Arreglo[numeDatos];

        for (int i = 0; i < numeDatos; i++) {
            arr[i].setIndice(i);
        }
        String dato = JOptionPane.showInputDialog("Introducir la Información: ");
        for (int i = 0; i < numeDatos; i++) {
            arr[i].setElemento(dato);

            System.out.println("Numero de elementos: " + arr.length);

        }
    }

}

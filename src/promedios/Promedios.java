/*
3. Diseñe un algoritmo que dados el peso y la altura de N personas que pertenecen a un
departamento de la república; obtenga el promedio del peso y de la altura de esta población.
 */
package promedios;

import javax.swing.JOptionPane;

/**
 *
 * @author Antonio Aranda
 */
public class Promedios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //DECLARACION DE VARIABLES
        float peso, altura, contadorPeso =0, contadorAltura=0, promedioP, promedioA;
        String nPer, contP, contA;
        int nPersonas;
        
        nPer = JOptionPane.showInputDialog("Digite el numero de la poblacion: " );
        
        nPersonas = Integer.parseInt(nPer);
        
        for(int i = 1; i<= nPersonas; i++)
        {
            contP = JOptionPane.showInputDialog("Digite el peso en kg de la persona "+ i );
            contadorPeso += Float.parseFloat(contP);
            
            contA = JOptionPane.showInputDialog("Digite la altura en metros de la persona "+ i );
            contadorAltura += Float.parseFloat(contA);
        }
        
        promedioP = contadorPeso / nPersonas;
        promedioA = contadorAltura / nPersonas;
        
        JOptionPane.showMessageDialog(null, "El peso promedio de la poblacion es: "+ promedioP + "kg\nY la altura promedio de la poblacion es: "+ promedioA + " m");
        
        
    }
    
}

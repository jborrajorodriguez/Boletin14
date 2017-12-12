package boletin14;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Garaxe {

    protected int numeroCoches,maximoDeCoches=5;
    protected String matricula;

    /**
     * Constructor por defecto.
     */
    public Garaxe() {
    }

    
    public void entradaGaraxe() {

        if (numeroCoches<maximoDeCoches) {
            
            JOptionPane.showMessageDialog(null,"Plazas Dispoñibles "+(maximoDeCoches-numeroCoches));
            numeroCoches++;
        }
        else {
            JOptionPane.showMessageDialog(null,"COMPLETO");
        }

    }

    public void salidaGaraxe() {
            System.out.println("****FACTURA**** \nMatricula coche: "+matricula+"\nTempo :"+"\nPrecio :"+"\nCartos Recibidos: "+"\nCartos Devoltos:");
        }
    

//    @Override
//    public String toString() {
//        return ("****FACTURA**** \nMatricula coche: "+matricula+"\nTempo :"+"\nPrecio :"+"\nCartos Recibidos: "+"\nCartos Devoltos:");
//    }
}

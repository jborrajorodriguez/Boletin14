package boletin14;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Garaxe {

    int numeroCoches, max=5;
    String matricula;

    /**
     * Constructor por defecto.
     */
    public Garaxe() {
    }

    /**
     * Método setMatricula que sirve para introduicir una matricula.
     *
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula=matricula;
    }

//    public void entradaGaraxe() {
//
//        if (max>0) {
//            JOptionPane.showMessageDialog(null,"Plazas Dispoñibles "+max);
//        }
//        else {
//            JOptionPane.showMessageDialog(null,"COMPLETO");
//        }
//
//    }
    
    

    @Override
    public String toString() {
        return ("****FACTURA**** \nMatricula coche: "+matricula+"\nTempo :"+"\nPrecio :"+"\nCartos Recibidos: "+"\nCartos Devoltos:");
    }
}

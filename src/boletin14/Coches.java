package boletin14;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Coches {

    protected String matricula;
    /**
     * Constructor con parametros.
     *
     * @param matricula
     */
    public Coches(String matricula) {
        this.matricula=matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula=matricula;
    }

    

}

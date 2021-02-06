/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Personas.Empleados;

/**************************************
*          CLASES DE APOYO            *
***************************************/
// import java.text.SimpleDateFormat;
// import java.text.ParseException;
import Personas.Persona;
import PatronVisitor.*;

/**
 * 
 */
public class Empleado extends Persona implements Visitable {
    /********************************************
    *           ATRIBUTOS DE INSTANCIA          *
    *********************************************/

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private String fechaIngreso;
    
    /**
     * 
     */
    private String institucionProcedencia;
    
    /**
     * 
     */
    private int numeroEmpleado;

    /************************************
    *           CONSTRUCTORES           *
    *************************************/

    /**
     * 
     * @param persona
     * @param fechaIngreso
     * @param institucionProcedencia
     * @param numeroEmpleado
     */
    public Empleado(Persona persona, String fechaIngreso, String institucionProcedencia, int numeroEmpleado) {
        super(persona);
        this.fechaIngreso = fechaIngreso;
        this.institucionProcedencia = institucionProcedencia;
        this.numeroEmpleado = numeroEmpleado;
    }

    /******************************************
    *          METODOS DE INSTANCIA           *
    *          (Getters y Setters)            *
    *******************************************/

    /**
     * 
     * @return
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * 
     * @param fechaIngreso
     */
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }    

    /**
     * 
     * @return
     */
    public long getNumeroEmpleado() {
        return numeroEmpleado;
    }

    /**
     * 
     * @param numeroEmpleado
     */
    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    /**
     * 
     */
    public String getInstitucionProcedencia() {
        return institucionProcedencia;
    }

    /**
     * 
     * @param institucionProcedencia
     */
    public void setInstitucionProcedencia(String institucionProcedencia) {
        this.institucionProcedencia = institucionProcedencia;
    }
    
    /**
     * 
     * @param visitor
     */
    @Override
    public void aceptar(Visitor visitor){
		visitor.visit(this);
	}
}

package PatronVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import Personas.Empleados.*;
import Personas.Suscriptores.*;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.PrintWriter;
//import java.io.StringWriter;
import Revistas.*;

/**
 * Visitor especifico, donde la operacion (método) que se sobrecarga (visit) es la escritura en un archivo de el objeto que llama al metodo aceptar con
 * el objeto de esta clase como parametro. La sintaxis es la siguiente:
 * 		
 * 		Editor editor=new Editor([atributos],...);
 *		ArchivoVisitor ArVisitor=new ArchivoVisitor();
		editor.aceptar(ArVisitor); 
 * 
 */

public class ArchivoVisitor implements Visitor{
	
	/**
	 * Escribe un objeto Revisor en el archivo de objetos .ser 
	 * @param revisor Revisor a escribir en el archivo de objetos
	 * @throws IOException
	 */
	public void visit(Revisor revisor){
		ObjectOutputStream file;
		try {
        	    file = new ObjectOutputStream(new FileOutputStream("Revisores.ser"));
        	    file.writeObject(revisor);
        	    file.close();
        	} 
        	catch (IOException e){
        	    System.out.println("Error: " + e.getMessage());
        	}
	}
	
	/**
	 * Escribe un objeto Editor en el archivo de objetos .ser 
	 * @param editor Editor a escribir en el archivo de objetos 
	 * @throws IOException
	 */
	public void visit(Editor editor){
		ObjectOutputStream file;
		try {
          	  file = new ObjectOutputStream(new FileOutputStream("Editores.ser"));
          	  file.writeObject(editor);
          	  file.close();
        	} 
        	catch (IOException e){
        	    System.out.println("Error: " + e.getStackTrace().toString());
        	}
	}
	
	/**
	 * Escribe un objeto Autor en el archivo de objetos .ser 
	 * @param autor Autor a escribir en el archivo de objetos
	 * @throws IOException
	 */
	public void visit(Autor autor){
		ObjectOutputStream file;
		try {
            file = new ObjectOutputStream(new FileOutputStream("Autores.ser"));
            file.writeObject(autor);
            file.close();
        } 
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
	}
	
	/**Escribe un objeto Subscriptor en el archivo de objetos .ser 
	 * @param sub Suscriptor a escribir en el archivo de objetos
	 * @throws IOException
	 */
	public void visit(Suscriptor sub){
		ObjectOutputStream file;
		try {
            file = new ObjectOutputStream(new FileOutputStream("Subscritores.ser"));
            file.writeObject(sub);
            file.close();
        } 
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
	}
	
	/**Escribe un objeto Empleado en el archivo de objetos .ser 
	 * @param empleado Empleado a escribir en el archivo de objetos
	 * @throws IOException
	 */
	public void visit(Empleado empleado){
		ObjectOutputStream file;
		try {
            file = new ObjectOutputStream(new FileOutputStream("Empleados.ser"));
            file.writeObject(empleado);
            file.close();
        } 
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
	}
	
	/**Escribe un objeto Articulo en el archivo de objetos .ser 
	 * @param articulo Articulo a escribir en el archivo de objetos
	 * @throws IOException
	 */
	public void visit(Articulo articulo){
		ObjectOutputStream file;
		try {
            file = new ObjectOutputStream(new FileOutputStream("Articulos.ser"));
            file.writeObject(articulo);
            file.close();
        } 
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
	}
	
	/**Escribe un objeto Categoria en el archivo de objetos .ser 
	 * @param cat Categoria a escribir en el archivo de objetos
	 * @throws IOException
	 */
	public void visit(Categoria cat){
		ObjectOutputStream file;
		try {
            file = new ObjectOutputStream(new FileOutputStream("Categorias.ser"));
            file.writeObject(cat);
            file.close();
        } 
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
	}
	
	/**Escribe un objeto Revista en el archivo de objetos .ser 
	 * @param revista Revista a escribir en el archivo de objetos
	 * @throws IOException
	 */
	public void visit(Revista revista){
		ObjectOutputStream file;
		try {
            file = new ObjectOutputStream(new FileOutputStream("Revista.ser"));
            file.writeObject(revista);
            file.close();
        } 
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
	}
}

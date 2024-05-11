package package01;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.medicoController;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
	
    public static void main( String[] args )
    {
    	
    	
    	daoMysql objetoMysql = new daoMysql();    	
    	ArrayList<String> listado = new ArrayList<String>();    	
    	//listado = objetoMysql.RetornarRegistros();
    			
    	/*
    	for(String cadena : listado){
    		  System.out.println(cadena);
    		  }
    	
    	
        //System.out.println( "Hello World!" );   
    
    */
    	
    	Scanner sc = new Scanner(System.in);
    	
    	
    	System.out.println( "ABM Medicos" );
    	System.out.println( "Opcion 1 - Altas" );
    	System.out.println( "Opcion 2 - Modificacion" );
    	System.out.println( "Opcion 3 - Borrado" );
    	System.out.println( "Opcion 4 - Listar" );    	
    	System.out.println( "Seleccionar Opcion: " );
    	
    	int opcion = sc.nextInt();
    	
    	System.out.println( "El dato ingresado es: " +  opcion);
    	switch(opcion)
    	{
    	case 1:
    		
    		/*
    		System.out.println( "Ingresar Nombre" );
    		
    		String nombre = sc.nextLine();
        	
    		System.out.println( "Ingresar Apellido" );
        	
    		String apellido = sc.nextLine();
        	
    		System.out.println( "Ingresar sexo" );
        	
    		String genero = sc.nextLine();
        	
    		System.out.println( "Ingresar Fecha nac" );
        	
    		String nac = sc.nextLine(); 	
        	*/
        	/*
        	daoMysql claseMysql = new daoMysql();        	
        	claseMysql.AltaMedico(nombre, apellido, genero, nac);       	*/
    		
    		
    		String medico01 = new medicoController().crearMedico(1002, "Gonzalo", "Alderete", "masculino", "01/01/1000");
        	
    		System.out.println( "Resultado de la operacion de carga : " +  medico01);
    		break;
    		
    	case 2:
    		medico usuarioM = new medico(1002, "Pedro", "Perez", "masculino", "01/01/1900");
    		String usuarioModificado = new medicoController().update(usuarioM);
    		
    		System.out.println(usuarioModificado);
    		break;
    		
    		
    		
    	case 3:
    		
    		medico usuario = new medico(1002, "Gonzalo", "Alderete", "masculino", "01/01/1000");
    		String registro = new medicoController().delete(usuario);
    		System.out.println(registro);
    		
    		break;
    		
    		
    		
    	case 4:
    		/*
    		System.out.println( "Ingresar Legajo:" );
    		
    		String leg = sc.nextLine();
    		
    		medico usuario1= new medico(1002, "Gonzalo", "Alderete", "masculino", "01/01/1000");
    		usuario1= new medicoController().ReadOne(leg);
    		System.out.println(usuario1.toString());
    		break;
    		
        	*/
        	
    	}
    		
    	
    	
    	
    	
    	
    }
    	
}

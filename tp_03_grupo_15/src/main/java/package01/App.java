package package01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


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
    	
    	//Agregado para evitar saltar el nombre
    	sc.nextLine();
    	
    	System.out.println( "El dato ingresado es: " +  opcion);
    	switch(opcion)
    	{
    	case 1:
    		/*
    		System.out.println( "Ingresar nombre" );
   		
    		String nombre = sc.nextLine();
       	
    		System.out.println( "Ingresar apellido" );
       	
    		String apellido = sc.nextLine();
       	
    		System.out.println( "Ingresar sexo" );
        	
    		String genero = sc.nextLine();
        	
    		System.out.println( "Ingresar fecha nac" );
        	
    		String nac = sc.nextLine();
    		
    		System.out.println( "Ingresar correo" );
        	
    		String correo = sc.nextLine();
    		
    		System.out.println( "Ingresar dirección");
        	
    		String direccion = sc.nextLine();
    		
    		System.out.println( "Ingresar localidad" );
        	
    		String localidad = sc.nextLine();
    		
    		System.out.println( "Ingresar télefono" );
        	
    		String telefono = sc.nextLine();
        	*/
//        	daoMysql claseMysql = new daoMysql();        	
//        	claseMysql.AltaMedico(nombre, apellido, genero, nac);
    		
    		String medico01 = new medicoController().crearMedico("Gonzalo", "Alderete", "Masculino", "12/02/1996", "gonzalo@prueba.com", "falsa 111", "Pacheco", "11-12229");
    		String medico02 = new medicoController().crearMedico("Gaston", "Argañaz", "Masculino", "01/06/1996", "gaston@prueba.com", "falsa 222", "Pacheco", "11-12229");
    		String medico03 = new medicoController().crearMedico("Leonel", "Herrera", "Masculino", "30/12/2000", "leonel@prueba.com", "falsa 333", "Pacheco", "11-12229");
    		String medico04 = new medicoController().crearMedico("Guido", "Romero", "Masculino", "11/02/2001", "guido@prueba.com", "falsa 444", "Pacheco", "11-12229");
    		String medico05 = new medicoController().crearMedico("Walter", "Pizzo", "Masculino", "29/02/1998", "walter@prueba.com", "falsa 555", "Pacheco", "11-12229");
    		String medico06 = new medicoController().crearMedico("Tamara", "Herrera", "Femenina", "14/05/2000", "tamara@prueba.com", "falsa 666", "Pacheco", "11-12229");
    		String medico07 = new medicoController().crearMedico("Pepito", "Perez", "Masculino", "12/02/1996", "pepito@prueba.com", "falsa 777", "Pacheco", "11-12229");
    		String medico08 = new medicoController().crearMedico("Pepita", "Perez", "Femenina", "04/04/1999", "pepita@prueba.com", "falsa 888", "Pacheco", "11-12229");
    		String medico09 = new medicoController().crearMedico("Juan", "Diaz", "Masculino", "12/02/1996", "juan@prueba.com", "falsa 999", "Pacheco", "11-12229");
    		String medico10 = new medicoController().crearMedico("Laura", "Morales", "Femenino", "02/12/2000", "laura@prueba.com", "falsa 321", "Pacheco", "11-12229");
    		
    		System.out.println( "Resultado de la operacion de carga : " +  medico01);
    		System.out.println( "Resultado de la operacion de carga : " +  medico02);
    		System.out.println( "Resultado de la operacion de carga : " +  medico03);
    		System.out.println( "Resultado de la operacion de carga : " +  medico04);
    		System.out.println( "Resultado de la operacion de carga : " +  medico05);
    		System.out.println( "Resultado de la operacion de carga : " +  medico06);
    		System.out.println( "Resultado de la operacion de carga : " +  medico07);
    		System.out.println( "Resultado de la operacion de carga : " +  medico08);
    		System.out.println( "Resultado de la operacion de carga : " +  medico09);
    		System.out.println( "Resultado de la operacion de carga : " +  medico10);
    		break;
    		
    	case 2:
    		System.out.println( "Ingresar el legajo del médico a modificar" );
       		
    		String legajoModificar = sc.nextLine();
    		
    		System.out.println( "Ingresar nombre" );
       		
    		String nombreModificar = sc.nextLine();
       	
    		System.out.println( "Ingresar apellido" );
       	
    		String apellidoModificar = sc.nextLine();
       	
    		System.out.println( "Ingresar sexo" );
        	
    		String generoModificar = sc.nextLine();
        	
    		System.out.println( "Ingresar fecha nac" );
        	
    		String nacModificar = sc.nextLine();
    		
    		System.out.println( "Ingresar correo" );
        	
    		String correoModificar = sc.nextLine();
    		
    		System.out.println( "Ingresar dirección");
        	
    		String direccionModificar = sc.nextLine();
    		
    		System.out.println( "Ingresar localidad" );
        	
    		String localidadModificar = sc.nextLine();
    		
    		System.out.println( "Ingresar télefono" );
    		
    		String telefonoModificar = sc.nextLine();
    		
    		medico usuarioM = new medico(nombreModificar, apellidoModificar, generoModificar, nacModificar, correoModificar, direccionModificar, localidadModificar, telefonoModificar);
    		usuarioM.setLegajo(Integer.parseInt(legajoModificar));
    		String usuarioModificado = new medicoController().update(usuarioM);
    		
    		System.out.println(usuarioModificado);
    		break;
    		
    		
    		
    	case 3:
    		System.out.println( "Ingresar el legajo del médico a eliminar: " );
       		
    		String legajoEliminar = sc.nextLine();
    		
    		medico med = new medico();
    		med.setLegajo(Integer.parseInt(legajoEliminar));
    		String registro = new medicoController().delete(med);
    		System.out.println(registro);
    		
    		break;
    		
    		
    		
    	case 4:
    		System.out.println( "Listado de médicos: " );

    		List<medico> medicos = new medicoController().ReadAll();
    		for (medico medico : medicos) {
    		    System.out.println(medico);
    		}
        	
    	}
    		
    	
    	
    	
    	
    	
    }
    	
}

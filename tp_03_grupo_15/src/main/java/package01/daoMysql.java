package package01;


	import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
	import java.sql.ResultSet;
	import java.sql.Statement;
import java.util.ArrayList;


public class daoMysql {
	
	
		
		public String sql;
	
		public ArrayList<String> Lista = new ArrayList<String>();

	
	 	public String driver = "com.mysql.cj.jdbc.Driver";

	    // Nombre de la base de datos
	    public String database = "medico";

	    // Host
	    public String hostname = "localhost";

	    // Puerto
	    public String port = "3306";

	    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
	    //public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";

	    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=UTC";
	    
	    
	    // Nombre de usuario
	    public String username = "root";

	    // Clave de usuario
	    public String password = "juan";

	    
	    
	    
	    
	    
	    public Connection conectarMySQL() 
	    {
	        Connection conn = null;

	        try {
	            Class.forName(driver);
	            conn = DriverManager.getConnection(url, username, password);
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }

	        return conn;
	    }
	    
	    
	    
	    public ArrayList<String> RetornarRegistros()
	    {
	    	String query = "select * from prueba";
	    	Connection conex;
	    	conex = this.conectarMySQL();
	    	
	    	try
	    	{
	    		Statement st = conex.createStatement();
	    		ResultSet rs = st.executeQuery(query);
	    		
	    		while(rs.next())
	    		{
	    			//String fila = rs.
	    			Lista.add(rs.getInt("id") + " - " + rs.getString("nombre") + " - " + rs.getString("apellido"));
	    		}
	    			    		
	    		conex.close();
	    	}
	    	catch(SQLException e)
	    	{
	    		
	    	}
	    	
	    	
	    	
	    	return Lista;
	    	
	    	
	    }
	    
	    
	    public void AltaMedico(String nombre, String apellido, String genero, String nac)
	    {
	    	
	    	medico medic01 = new medico();
	    	
	    	medic01.setLegajo(1000);
	    	medic01.setNombre(nombre);
	    	medic01.setApellido(apellido);
	    	medic01.setGenero(genero);
	    	medic01.setNac(nac);
	    	
	    	
	    	this.addMEdico(medic01);
	    }
	    	
	    	
	    	public void addMEdico(medico m01) {
	    		   try {
	    		        
	    			   
	    			   Connection conex;
	    		    	conex = this.conectarMySQL();
	    			   
	    			   
	    		        sql = " insert into medicos (legajo, nombre, apellido, genero, nac)"
	    		        	    + " values (?, ?, ?, ?, ?)";
	    		        
	    		        PreparedStatement preparedStmt = conex.prepareStatement(sql);
	    		        preparedStmt.setInt (1, m01.getLegajo());
	    		        preparedStmt.setString (2, m01.getNombre());
	    		        preparedStmt.setString  (3, m01.getApellido());
	    		        preparedStmt.setString (4, m01.getGenero());
	    		        preparedStmt.setString  (5, m01.getNac());
	    		        
	    		        preparedStmt.execute();
	    		        
	    		        conex.close();
	    		        
	    		        
	    		       
	    		    } catch (Exception e) 
	    		   	{
	    		        System.out.println(e);
	    		    }
	    	
	    	
	    	
	    }
	    
	
	
	
}

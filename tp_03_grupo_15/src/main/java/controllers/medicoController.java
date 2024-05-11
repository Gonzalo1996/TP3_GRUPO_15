package controllers;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import package01.medico;
import java.util.List;



public class medicoController {
	
	public String crearMedico(String nombre, String apellido, String genero, String nac, String correo, String direccion, String localidad, String telefono)
	{
		
		
		SessionFactory sessionFactory01 = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(medico.class).buildSessionFactory();
		
		Session sesion = sessionFactory01.openSession();
		
		try
		{
			
			
			
			medico m01 = new medico(nombre, apellido, genero, nac, correo, direccion, localidad, telefono);
			
			sesion.beginTransaction();
			sesion.save(m01);
			sesion.getTransaction().commit();
			
			sessionFactory01.close();
			
			return "medico creado";
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return "error con la carga del medico";
	}
	
	public String delete(medico usuario) {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(medico.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		session.beginTransaction();
		session.delete(usuario);
		session.getTransaction().commit();
		session.close();
		
		sessionFactory.close();
		
		return "Registro eliminado";
		
	}
	
	public String update(medico id) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(medico.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
        session.update(id);
        session.getTransaction().commit();
        
        
        session.close();
        sessionFactory.close();
        return "Registro actualizado correctamente";
	}
	/*
	public medico ReadOne(int leg) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(medico.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		medico medico= (medico)session.get(medico.class, leg);
		
	    session.close();
	    sessionFactory.close();
	
	}
	
*/
	
	public List<medico> ReadAll() {
	    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(medico.class).buildSessionFactory();
	    Session session = sessionFactory.openSession();

	    session.beginTransaction();
	    List<medico> medicos = session.createQuery("FROM medico").list();
	    session.getTransaction().commit();

	    session.close();
	    sessionFactory.close();

	    return medicos;
	}
	
	
}

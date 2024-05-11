package controllers;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import package01.medico;


public class medicoController {
	
	public String crearMedico(int legajo, String nombre, String apellido, String genero, String nac)
	{
		
		
		SessionFactory sessionFactory01 = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(medico.class).buildSessionFactory();
		
		Session sesion = sessionFactory01.openSession();
		
		try
		{
			
			
			
			medico m01 = new medico(legajo, nombre, apellido, genero, nac);
			
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
	
	
}

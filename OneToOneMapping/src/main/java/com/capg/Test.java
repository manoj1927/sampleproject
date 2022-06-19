package com.capg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.entity.Library;
import com.capg.entity.Student;

public class Test {
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("student-persistence");
	    EntityManager em = emf.createEntityManager();
	    
	    em.getTransaction().begin();
	    Student st1 = new Student();
	    st1.setStid(1);
	    st1.setName("manoj");
	    
	    Student st2 = new Student();
	    st2.setStid(2);
	    st2.setName("dhoni");
	    
	    em.persist(st1);
	    em.persist(st2);
	    
	    Library lib1 = new Library();
	    lib1.setBookid(101);
	    lib1.setBookname("java");
	    lib1.setStd(st1);
	    
	    Library lib2 = new Library();
	    lib2.setBookid(102);
	    lib2.setBookname("Spring");
	    lib2.setStd(st2);
	    
	    em.persist(lib1);
	    em.persist(lib2);
	    
	    
	    em.getTransaction().commit();
	    
	    em.close();
	    emf.close();
	    }

}

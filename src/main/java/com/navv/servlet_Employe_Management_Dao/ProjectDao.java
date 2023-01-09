package com.navv.servlet_Employe_Management_Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.navv.servlet_Employe_Management_Dto.Employe;
import com.navv.servlet_Employe_Management_Dto.Message;
import com.navv.servlet_Employe_Management_Dto.SignupEmploye;

public class ProjectDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("kuldeep");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

//Insert Employe Method 	
	public void insertEmploye(Employe employe) {

		et.begin();
		em.persist(employe);
		et.commit();
		System.out.println("Data Inserted");

	}

//Employe Login Details Saver method
	public void insertSignup(SignupEmploye employe) {
		et.begin();
		em.persist(employe);
		et.commit();
		System.out.println("SignUp ScuucessFully");

	}

//Contact us Message Saver Method
	public void insertMessage(Message message) {
		et.begin();
		em.persist(message);
		et.commit();
		System.out.println("Message Saved ScuucessFully");

	}

//login method validation
	public SignupEmploye findIdAndPassword(String email) {
		SignupEmploye signUp2 = em.find(SignupEmploye.class, email);
		SignupEmploye signUp = em.find(SignupEmploye.class, signUp2.getPassword());

		if (signUp2 != null) {
			return signUp2;
		} else {
			return null;
		}

	}

//Delete Method Employe
	public void deleteEmploye(int id) {
		Employe employe = em.find(Employe.class, id);
		if (employe != null) {
			et.begin();
			em.remove(employe);
			et.commit();
		}
	}

//Find Id from Data Base
	public int findid(int id) {
		Employe employe = em.find(Employe.class, id);
		if (employe == null) {
			return 0;

		} else {
			return employe.getId();
		}

	}

//Display Data	
	public List<Employe> display() {
		return em.createQuery("select e From Employe e", Employe.class).getResultList();
	}

//Update Data
	public void updatedata(int id , Employe employe)
	{
		Employe employe2=em.find(Employe.class, id);
		
		if(employe2!=null) {
			
			et.begin();
			if( employe.getId()!=0&& employe.getName()!=null && employe.getMobile()!=null&& employe.getJob()!=null &&employe.getGender()!=null && employe.getEmail()!=null)
			{
				
				employe2.setName(employe.getName());
				employe2.setEmail(employe.getEmail());
				employe2.setMobile(employe.getMobile());
				
				em.merge(employe2);
			
				
			}
			et.commit();
			
			
		}
		
	}
	public Employe getbyIdEmploye(int id) {
		Employe employe = em.find(Employe.class, id);

		return employe;
	}
	
	public void update( int id,Employe dto) {

		Employe employe = em.find(Employe.class, id);
		et.begin();
		if (employe != null) {

		 if (dto.getName() != null && dto.getMobile() != null && dto.getEmail() != null) {

				employe.setName(dto.getName());
				employe.setEmail(dto.getEmail());
				employe.setMobile(dto.getMobile());

				em.merge(employe);
			}

		}
		et.commit();
	}


}

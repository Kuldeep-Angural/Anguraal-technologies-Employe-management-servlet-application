package com.navv.servlet_Employe_Management_Service;

import java.util.List;

import com.navv.servlet_Employe_Management_Dao.ProjectDao;
import com.navv.servlet_Employe_Management_Dto.Employe;
import com.navv.servlet_Employe_Management_Dto.Message;
import com.navv.servlet_Employe_Management_Dto.SignupEmploye;

public class ProjectService {
	ProjectDao dao = new ProjectDao();

	// Insert Employe Method
	public void insertEmploye(Employe employe) {
		dao.insertEmploye(employe);
	}

	// Employe Login Details Saver method
	public void insertSignup(SignupEmploye employe) {
		dao.insertSignup(employe);
	}

	// Contact us Message Saver Method
	public void insertMessage(Message message) {
		dao.insertMessage(message);

	}

	// login method validation
	public SignupEmploye findIdAndPassword(String email) {
		return dao.findIdAndPassword(email);
	}

	// Delete Method Employe
	public void deleteEmploye(int id) {
		dao.deleteEmploye(id);
	}

	// find id from data base
	public int findid(int id) {
		return dao.findid(id);
	}

	// Display Data
	public List<Employe> display() {
		return dao.display();

	}

	// Update Data
	public void updatedata(int id , Employe employe)
		{
		dao.updatedata(id, employe);
		}
	public Employe getbyIdEmploye(int id) {
		return dao.getbyIdEmploye(id);
	}
	public void update( int id,Employe dto) {
 
		dao.update(id, dto);
	}
}

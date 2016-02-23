package com.dao;

import java.util.ArrayList;

import java.util.Collection;
import java.util.List;

import org.hibernate.Session;

import structure.Personne;

import com.jdbc.HibernateConfig;

public class PersonneDao {
	@SuppressWarnings("unchecked")
	public static Collection<Personne> getListePersonne(String requette) {
		return com.dao.BaseDAO.getInstance().getListObject(requette);
	}

	public static int getPersonneCount() {
		int count = 0;
		List<Personne> list1 = new ArrayList<Personne>();
		String req = "FROM Personne";
		list1 = (List<Personne>) BaseDAO.getInstance().getListObject(req);
		count = list1.size();
		System.out.println("count= " + count);
		return count;
	}

	public void AjouterPersonne(Personne Personne) {
		Session session = null;

		try {
			session = HibernateConfig.getSession();

			session.save(Personne);

			session.beginTransaction().commit();

		} catch (Exception ex) {

			ex.printStackTrace();
		} finally {

			if (session != null) {
				session.close();
			}
		}
	}

	public void deletePersonne(int id_Personne) {
		Session session = null;
		Personne e1 = null;
		try {
			session = HibernateConfig.getSession();

			e1 = (Personne) session.load(Personne.class, id_Personne);
			session.delete(e1);

			session.beginTransaction().commit();

		} catch (Exception ex) {

			ex.printStackTrace();
		} finally {

			if (session != null) {
				session.close();
			}
		}
	}

	public void updatePersonne(int idPersonne, Personne Personne) {
		Session session = null;
		Personne e1 = new Personne();
		try {
			session = HibernateConfig.getSession();

			e1 = (Personne) session.load(Personne.class, idPersonne);
			e1.setIdPersonne(Personne.getIdPersonne());
			e1.setPrenom(Personne.getPrenom());
			e1.setNom(Personne.getNom());
//			e1.setIdEtablissement(1);
			session.update(e1);

			session.beginTransaction().commit();

		} catch (Exception ex) {

			ex.printStackTrace();
		} finally {

			if (session != null) {
				session.close();
			}
		}
	}
}

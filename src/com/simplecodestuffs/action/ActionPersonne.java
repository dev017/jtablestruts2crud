package com.simplecodestuffs.action;

import java.util.ArrayList;

import java.util.Collection;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.dao.BaseDAO;
import com.dao.PersonneDao;
import com.opensymphony.xwork2.ActionSupport;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.action.CollectionAction;

import structure.Personne;

import java.io.IOException;

public class ActionPersonne extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private int id_Personne;
	private String nom, tel, fax, prenom, raison_social;

	private PersonneDao dao = new PersonneDao();

	private List<Personne> records = new ArrayList<Personne>();
	private String result;
	private String message;
	private Personne record = new Personne();

	private int jtStartIndex;
	private int jtPageSize;
	private int totalRecordCount;

	Collection<Personne> PersonneList = new ArrayList<Personne>();

	public String list() {
		try {
			int range = jtStartIndex + jtPageSize;
			String query = "";

			query = "from Personne where id_personne > " + jtStartIndex
					+ " and id_personne <= " + range;
			// setRecords((ArrayList<action>) getDao().getListeAction());
			System.out.println("query=" + query);
			setRecords((ArrayList<Personne>) getDao().getListePersonne(query));
			totalRecordCount = PersonneDao.getPersonneCount();
			setResult("OK");
		} catch (Exception e) {
			setResult("ERROR");
			setMessage(e.getMessage());
			System.err.println(e.getMessage());
		}
		return ActionSupport.SUCCESS;
	}

	public String create() throws IOException {

		record = new Personne();
		record.setIdPersonne(id_Personne);
		record.setNom(nom);
		record.setPrenom(prenom);
		record.setNom(nom);
		try {
			getDao().AjouterPersonne(record);
			setResult("OK");
		} catch (Exception e) {
			setResult("ERROR");
			setMessage(e.getMessage());
			System.err.println(e.getMessage());
		}
		return ActionSupport.SUCCESS;

	}

	public String update() throws IOException {
		try {

			record = new Personne();
			record.setIdPersonne(id_Personne);
			record.setNom(nom);
			record.setPrenom(prenom);
			record.setNom(nom);

			getDao().updatePersonne(id_Personne, record);
			setResult("OK");
		} catch (Exception e) {
			setResult("ERROR");
			setMessage(e.getMessage());
			System.err.println(e.getMessage());
		}
		return ActionSupport.SUCCESS;
	}

	public String delete() throws IOException {
		try {

			getDao().deletePersonne(id_Personne);
			setResult("OK");
		} catch (Exception e) {
			setResult("ERROR");
			setMessage(e.getMessage());
			System.err.println(e.getMessage());
		}
		return ActionSupport.SUCCESS;

	}

	public int getId_Personne() {
		return id_Personne;
	}

	public void setId_Personne(int id_Personne) {
		this.id_Personne = id_Personne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getRaison_social() {
		return raison_social;
	}

	public void setRaison_social(String raison_social) {
		this.raison_social = raison_social;
	}

	public PersonneDao getDao() {
		return dao;
	}

	public void setDao(PersonneDao dao) {
		this.dao = dao;
	}

	public List<Personne> getRecords() {
		return records;
	}

	public void setRecords(List<Personne> records) {
		this.records = records;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Personne getRecord() {
		return record;
	}

	public void setRecord(Personne record) {
		this.record = record;
	}

	public int getJtStartIndex() {
		return jtStartIndex;
	}

	public void setJtStartIndex(int jtStartIndex) {
		this.jtStartIndex = jtStartIndex;
	}

	public int getJtPageSize() {
		return jtPageSize;
	}

	public void setJtPageSize(int jtPageSize) {
		this.jtPageSize = jtPageSize;
	}

	public int getTotalRecordCount() {
		return totalRecordCount;
	}

	public void setTotalRecordCount(int totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ActionPersonne() {
		super();
		// TODO Auto-generated constructor stub
	}

	// list all customers
	public String listPersonne() throws Exception {
		PersonneList = getDao().getListePersonne("from Personne");
		return SUCCESS;

	}

	public Collection<Personne> getPersonneList() {
		return PersonneList;
	}

	public void setPersonneList(Collection<Personne> PersonneList) {
		this.PersonneList = PersonneList;
	}
}

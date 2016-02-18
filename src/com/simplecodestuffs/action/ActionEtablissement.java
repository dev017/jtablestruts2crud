package com.simplecodestuffs.action;
import java.util.ArrayList;


import java.util.Collection;
import java.util.List;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.dao.EtablissementDao;
import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.action.CollectionAction;
import structure.Etablissement;
import java.io.IOException;

public class ActionEtablissement extends ActionSupport {

			private static final long serialVersionUID = 1L;
			private int id_etablissement;
			private String nom,tel,fax,adresse,raison_social;

			private EtablissementDao dao =new EtablissementDao();
			
				private List<Etablissement> records = new ArrayList<Etablissement>();
				private String result;
				private String message;
				private Etablissement record = new Etablissement();
				
				private int jtStartIndex;
				private int jtPageSize; 
				private int totalRecordCount;
				  
				
				
				public String list() {
					try {
						int range = jtStartIndex+jtPageSize;			
						String query="";
						
					query="from Etablissement where id_etablissement > " + jtStartIndex +" and id_etablissement <= "+range;
						//setRecords((ArrayList<action>) getDao().getListeAction());
						System.out.println("query="+query);
						setRecords((ArrayList<Etablissement>) getDao().getListeEtablissement(query));
						totalRecordCount=EtablissementDao.getEtablissementCount();
						setResult("OK");
					} catch (Exception e) {
						setResult("ERROR");
						setMessage(e.getMessage());
						System.err.println(e.getMessage());
					}
					return ActionSupport.SUCCESS;
				}
				
				public String create() throws IOException {

					record = new Etablissement();
					record.setId_etablissement(id_etablissement);
				record.setAdresse(adresse);
				record.setFax(fax);
				record.setNom(nom);
				record.setRaison_social(raison_social);
				record.setTel(tel);
					try {
						getDao().AjouterEtablissement(record);
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

					record = new Etablissement();
					record.setId_etablissement(id_etablissement);
					record.setAdresse(adresse);
					record.setFax(fax);
					record.setNom(nom);
					record.setRaison_social(raison_social);
					record.setTel(tel);
					
					getDao().updateEtablissement(id_etablissement, record);
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
						
						getDao().deleteEtablissement(id_etablissement);			
							setResult("OK");
						} catch (Exception e) {
							setResult("ERROR");
							setMessage(e.getMessage());
							System.err.println(e.getMessage());
						}
						return ActionSupport.SUCCESS;
					
				}

				public int getId_etablissement() {
					return id_etablissement;
				}

				public void setId_etablissement(int id_etablissement) {
					this.id_etablissement = id_etablissement;
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

				public String getAdresse() {
					return adresse;
				}

				public void setAdresse(String adresse) {
					this.adresse = adresse;
				}

				public String getRaison_social() {
					return raison_social;
				}

				public void setRaison_social(String raison_social) {
					this.raison_social = raison_social;
				}

				public EtablissementDao getDao() {
					return dao;
				}

				public void setDao(EtablissementDao dao) {
					this.dao = dao;
				}

				public List<Etablissement> getRecords() {
					return records;
				}

				public void setRecords(List<Etablissement> records) {
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

				public Etablissement getRecord() {
					return record;
				}

				public void setRecord(Etablissement record) {
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

				public ActionEtablissement() {
					super();
					// TODO Auto-generated constructor stub
				}

				
			

}

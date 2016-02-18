package com.dao;
import java.util.ArrayList;

import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import structure.Etablissement;

import com.jdbc.HibernateConfig;
public class EtablissementDao {
							@SuppressWarnings("unchecked")
								public static Collection<Etablissement> getListeEtablissement(String requette) {
								return com.dao.BaseDAO.getInstance().getListObject(requette);
							}
							
					
							public static int getEtablissementCount()
							{
								int count=0;
								List<Etablissement> list1 = new ArrayList<Etablissement>();
								String req="FROM Etablissement";	
								list1=(List<Etablissement>) BaseDAO.getInstance().getListObject(req);
									count=list1.size();
									System.out.println("count= "+count);
								return count;
							}

							public void AjouterEtablissement(Etablissement Etablissement) {
								Session session = null;
								
								System.out.println("sssssss " + Etablissement.getNom());
								 try{
									 session = HibernateConfig.getSession();
									 
									 session.save(Etablissement);
									 
									 session.beginTransaction().commit();
									 
								 }catch(Exception ex){
									
									 ex.printStackTrace();
								 }finally{
									
									 if(session != null){
										 session.close();
									 }
								 }
							}
							
							public void deleteEtablissement(int id_Etablissement){
								Session session = null;
								Etablissement e1 = null;
								 try{
									 session = HibernateConfig.getSession();
									 
									 e1 = (Etablissement) session.load(Etablissement.class, id_Etablissement);
									 session.delete(e1);
									 
									 session.beginTransaction().commit();
									 
								 }catch(Exception ex){
									 
									 ex.printStackTrace();
								 }finally{
									
									 if(session != null){
										session.close();
									 }
								 }
							}
							
							public void updateEtablissement(int idEtablissement,Etablissement Etablissement){
								Session session = null;
								Etablissement e1 = new Etablissement();	
									 try{
										 session = HibernateConfig.getSession();
										 
										e1 =(Etablissement)session.load(Etablissement.class, idEtablissement);
									e1.setId_etablissement(Etablissement.getId_etablissement());
									e1.setAdresse(Etablissement.getAdresse());
									e1.setFax(Etablissement.getFax());
									e1.setNom(Etablissement.getNom());
									e1.setRaison_social(Etablissement.getRaison_social());
									e1.setTel(Etablissement.getTel());
										 session.update(e1);
										 
										 session.beginTransaction().commit();
										 
									 }catch(Exception ex){
										
										 ex.printStackTrace();
									 }finally{
										
										 if(session != null){
											 session.close();
										 }
									 }
								}
}

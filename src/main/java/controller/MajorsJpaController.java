/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.exceptions.NonexistentEntityException;
import controller.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import modelo.Majors;

/**
 *
 * @author Jeikol
 */
public class MajorsJpaController implements Serializable {
    private EntityManagerFactory emf = null;
   
    public static final String[] HEADER_MAJORS = {"codigo", "nombre", "mercado_laboral", "descripcion","perfil_profecional"};

    
    public MajorsJpaController() {
        this.emf = Persistence.createEntityManagerFactory("AppCalendarioPersistence");
    }
    

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Majors majors) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(majors);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findMajors(majors.getCode()) != null) {
                throw new PreexistingEntityException("Majors " + majors + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Majors majors) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            majors = em.merge(majors);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = majors.getCode();
                if (findMajors(id) == null) {
                    throw new NonexistentEntityException("The majors with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Majors majors;
            try {
                majors = em.getReference(Majors.class, id);
                majors.getCode();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The majors with id " + id + " no longer exists.", enfe);
            }
            em.remove(majors);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public String[][] getMatrix(List<Majors> majorsList, String[] header){
        
        String[][] matrixMajors = new String[majorsList.size()][header.length];
        
    for (int i = 0; i < majorsList.size(); i++) {
            Majors major = majorsList.get(i);
            matrixMajors[i][0] = major.getCode();        
            matrixMajors[i][1] = major.getName();        
            matrixMajors[i][4] = major.getMarket();
            matrixMajors[i][2] = major.getDescription(); 
            matrixMajors[i][3] = major.getProfile(); 
        }
    return matrixMajors;
    }
    
    
    public List<Majors> findMajorsEntities() {
        return findMajorsEntities(true, -1, -1);
    }

    public List<Majors> findMajorsEntities(int maxResults, int firstResult) {
        return findMajorsEntities(false, maxResults, firstResult);
    }

    private List<Majors> findMajorsEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Majors.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Majors findMajors(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Majors.class, id);
        } finally {
            em.close();
        }
    }

    public int getMajorsCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Majors> rt = cq.from(Majors.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

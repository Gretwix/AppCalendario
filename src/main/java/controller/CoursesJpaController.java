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
import modelo.Courses;

/**
 *
 * @author Jason
 */
public class CoursesJpaController implements Serializable {
    private EntityManagerFactory emf = null;
   
    public CoursesJpaController() {
       this.emf = Persistence.createEntityManagerFactory("AppCalendarioPersistence");
    }
    
 public static final String[] HEADER_COURSES = {"sigla", "nombre", "cantidad_creditos", "horas_laborales","horas_lectivas","bloque","modalidad","descripcion"};
 
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Courses courses) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(courses);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCourses(courses.getAcronnyms()) != null) {
                throw new PreexistingEntityException("Courses " + courses + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Courses courses) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            courses = em.merge(courses);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = courses.getAcronnyms();
                if (findCourses(id) == null) {
                    throw new NonexistentEntityException("The courses with id " + id + " no longer exists.");
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
            Courses courses;
            try {
                courses = em.getReference(Courses.class, id);
                courses.getAcronnyms();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The courses with id " + id + " no longer exists.", enfe);
            }
            em.remove(courses);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
     public String[][] getMatrix(List<Courses> coursesList, String[] header){
        
          //"sigla", "nombre", "cantidad_creditos", "horas_laborales","horas_lectivas","bloque","modalidad","descripcion"};
         
        String[][] matrixMajors = new String[coursesList.size()][header.length];
        
    for (int i = 0; i < coursesList.size(); i++) {
            Courses courses = coursesList.get(i);
            matrixMajors[i][0] = courses.getAcronnyms();        
            matrixMajors[i][1] = courses.getName();        
            matrixMajors[i][2] = String.valueOf(courses.getCredits());
            matrixMajors[i][3] = String.valueOf(courses.getWork()); 
            matrixMajors[i][4] = String.valueOf(courses.getClas()); 
            matrixMajors[i][5] = courses.getBlock();
            matrixMajors[i][6] = courses.getModality();        
            matrixMajors[i][7] = courses.getDescription();
        }
    return matrixMajors;
    }

    public List<Courses> findCoursesEntities() {
        return findCoursesEntities(true, -1, -1);
    }

    public List<Courses> findCoursesEntities(int maxResults, int firstResult) {
        return findCoursesEntities(false, maxResults, firstResult);
    }

    private List<Courses> findCoursesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Courses.class));
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

    public Courses findCourses(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Courses.class, id);
        } finally {
            em.close();
        }
    }

    public int getCoursesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Courses> rt = cq.from(Courses.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

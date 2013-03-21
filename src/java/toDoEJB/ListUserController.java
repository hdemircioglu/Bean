/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package toDoEJB;


import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author HD
 */
@Stateless
public class ListUserController implements ListUserControllerLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @PersistenceContext(unitName = "ToDoEJBPU")
    private EntityManager em;
    
    @Override
    public void add(ListUser u){
        em.persist(u);
    }
    
    @Override
    public void delete(ListUser u){
        ListUser managedU = em.merge(u);
        em.remove(managedU);
    }

    @Override
    public List<ListUser> list() {
        Query findAll;
        findAll = em.createQuery("SELECT u FROM ListUser as u");
        return findAll.getResultList();
    }
    
    @Override
    public boolean checkName(String username){
        Query findAll;
        findAll = em.createQuery("SELECT u FROM ListUser as u WHERE u.username LIKE '" + username + "'");
        return findAll.getResultList().isEmpty();
    }
    
    
}

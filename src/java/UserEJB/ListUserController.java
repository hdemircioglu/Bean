/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserEJB;


import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author muratmenevse
 */
@Stateless
public class ListUserController implements ListUserControllerLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @PersistenceContext(unitName = "UserEJBPU")
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
    public List<String> usernamesList() {
        Query findAll;
        findAll = em.createQuery("SELECT u.username FROM ListUser as u");
        return findAll.getResultList();
    }
    
    @Override
    public boolean checkName(String username){
        Query findAll;
        findAll = em.createQuery("SELECT u FROM ListUser as u WHERE u.username "
                + "LIKE '" + username + "'");
        return findAll.getResultList().isEmpty();
    }
    
    /**
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public boolean checkLogin(String username, String password){
        Query findAll;
        findAll = em.createQuery("SELECT u FROM ListUser as u WHERE u.username "
                + "LIKE '" + username + "' AND  u.password LIKE '" + password + "'");
        return findAll.getResultList().isEmpty();
    }
    
    
}

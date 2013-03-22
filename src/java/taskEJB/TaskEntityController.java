package taskEJB;

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
public class TaskEntityController implements TaskEntityControllerLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @PersistenceContext(unitName = "TaskEJBPU")
    private EntityManager em;
    

    /**
     *
     * @param t
     */
    @Override
    public void add(TaskEntity t){
        em.persist(t);
    }
    

    /**
     *
     * @param t
     */
    @Override
    public void delete(TaskEntity t){
        TaskEntity managedU = em.merge(t);
        em.remove(managedU);
    }

    /**
     *
     * @return
     */
    @Override
    public List<TaskEntity> list() {
        Query findAll;
        findAll = em.createQuery("SELECT t FROM TaskEntity as t");
        return findAll.getResultList();
    } 
}

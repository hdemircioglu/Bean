/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taskEJB;

/**
 *
 * @author muratmenevse
 */
public interface TaskEntityControllerLocal {

    public void add(taskEJB.TaskEntity t);

    public void delete(taskEJB.TaskEntity t);
    
    public void update(taskEJB.TaskEntity t);

    public java.util.List<taskEJB.TaskEntity> list();

    
    
}

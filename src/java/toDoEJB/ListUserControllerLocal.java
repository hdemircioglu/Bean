/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package toDoEJB;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HD
 */
@Local
public interface ListUserControllerLocal {
    
    public void add(toDoEJB.ListUser u);
    public void delete(toDoEJB.ListUser u);
    public List<toDoEJB.ListUser> list();
    
}

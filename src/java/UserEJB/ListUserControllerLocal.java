/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserEJB;

import java.util.List;
import javax.ejb.Local;


/**
 *
 * @author muratmenevse
 */
@Local
public interface ListUserControllerLocal {
    
    public void add(UserEJB.ListUser u);
    public void delete(UserEJB.ListUser u);
    public List<UserEJB.ListUser> list();
    public boolean checkName(java.lang.String username);
    public boolean checkLogin(java.lang.String username, java.lang.String password);
    public java.util.List<java.lang.String> usernamesList();
}

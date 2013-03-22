/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taskEJB;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author muratmenevse
 */
@Entity
public class TaskEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private int priority;
    private String title;
    private String optionalNotes;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dueDate;
    private boolean completionFlag;
    private String requestingUser;
    private String assignedUser;

    public TaskEntity() {
    }

    public TaskEntity(int priority, String title, String optionalNotes, 
            Date dueDate, boolean completionFlag, String requestingUser,
            String assignedUser) {
        this.priority = priority;
        this.title = title;
        this.optionalNotes = optionalNotes;
        this.dueDate = dueDate;
        this.completionFlag = completionFlag;
        this.requestingUser = requestingUser;
        this.assignedUser = assignedUser;
    }
    
    

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOptionalNotes() {
        return optionalNotes;
    }

    public void setOptionalNotes(String optionalNotes) {
        this.optionalNotes = optionalNotes;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompletionFlag() {
        return completionFlag;
    }

    public void setCompletionFlag(boolean completionFlag) {
        this.completionFlag = completionFlag;
    }

    public String getRequestingUser() {
        return requestingUser;
    }

    public void setRequestingUser(String requestingUser) {
        this.requestingUser = requestingUser;
    }

    public String getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(String assignedUser) {
        this.assignedUser = assignedUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaskEntity)) {
            return false;
        }
        TaskEntity other = (TaskEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "taskEJB.TaskEntity[ id=" + id + " ]";
    }
    
}

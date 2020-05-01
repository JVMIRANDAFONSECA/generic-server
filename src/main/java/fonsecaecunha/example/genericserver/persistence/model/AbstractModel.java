package fonsecaecunha.example.genericserver.persistence.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

/**
 * Abstract class for Models, includes Primary key, version control and timestamps
 */
@Entity
public abstract class AbstractModel {

    /**
     * Primary key with auto-generated values
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * Version control for concurrent modifications
     */
    @Version
    private Integer version;

    /**
     * Auto generated creation time stamp
     */
    @CreationTimestamp
    private Date creationTimeStamp;

    /**
     * Auto generated update time stamp
     */
    @UpdateTimestamp
    private Date updateTimeStamp;

    
    /** 
     * @return Date
     */
    // Getters and Setters

    public Date getUpdateTimeStamp() {
        return this.updateTimeStamp;
    }

    
    /** 
     * @param updateTimeStamp
     */
    public void setUpdateTimeStamp(Date updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
    }

    
    /** 
     * @return Date
     */
    public Date getCreationTimeStamp() {
        return this.creationTimeStamp;
    }

    
    /** 
     * @param creationTimeStamp
     */
    public void setCreationTimeStamp(Date creationTimeStamp) {
        this.creationTimeStamp = creationTimeStamp;
    }

    
    /** 
     * @return Integer
     */
    public Integer getId() {
        return this.id;
    }

    
    /** 
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    /** 
     * @return Integer
     */
    public Integer getVersion() {
        return this.version;
    }

    
    /** 
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}
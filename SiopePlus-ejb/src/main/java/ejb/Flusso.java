/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author GML
 */
@Entity
@Table(name="FLUSSO")
public class Flusso implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String oil;

    public Flusso() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID_FLUSSO")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    @Column(name="OIL")
    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    public Flusso(String oil) {
        this.oil = oil;
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
        if (!(object instanceof Flusso)) {
            return false;
        }
        Flusso other = (Flusso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.Flusso[ id=" + id + " ]";
    }
    
}

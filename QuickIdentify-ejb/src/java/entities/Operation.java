/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AICHA MIMI
 */
@Entity
@Table(name = "operation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Operation.findAll", query = "SELECT o FROM Operation o")
    , @NamedQuery(name = "Operation.findByIdoperation", query = "SELECT o FROM Operation o WHERE o.idoperation = :idoperation")
    , @NamedQuery(name = "Operation.findByLibelle", query = "SELECT o FROM Operation o WHERE o.libelle = :libelle")
    , @NamedQuery(name = "Operation.findByType", query = "SELECT o FROM Operation o WHERE o.type = :type")
    , @NamedQuery(name = "Operation.findByDateconnexion", query = "SELECT o FROM Operation o WHERE o.dateconnexion = :dateconnexion")
    , @NamedQuery(name = "Operation.findByHeureconnexion", query = "SELECT o FROM Operation o WHERE o.heureconnexion = :heureconnexion")
    , @NamedQuery(name = "Operation.findByDatedeconnexion", query = "SELECT o FROM Operation o WHERE o.datedeconnexion = :datedeconnexion")
    , @NamedQuery(name = "Operation.findByHeuredeconnexion", query = "SELECT o FROM Operation o WHERE o.heuredeconnexion = :heuredeconnexion")
    , @NamedQuery(name = "Operation.findByAdresseip", query = "SELECT o FROM Operation o WHERE o.adresseip = :adresseip")})
public class Operation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idoperation")
    private Integer idoperation;
    @Size(max = 254)
    @Column(name = "libelle")
    private String libelle;
    @Size(max = 254)
    @Column(name = "type")
    private String type;
    @Column(name = "dateconnexion")
    @Temporal(TemporalType.DATE)
    private Date dateconnexion;
    @Column(name = "heureconnexion")
    private Integer heureconnexion;
    @Column(name = "datedeconnexion")
    @Temporal(TemporalType.DATE)
    private Date datedeconnexion;
    @Column(name = "heuredeconnexion")
    @Temporal(TemporalType.TIME)
    private Date heuredeconnexion;
    @Size(max = 254)
    @Column(name = "adresseip")
    private String adresseip;
    @JoinColumn(name = "idutilisateur", referencedColumnName = "idutilisateur")
    @ManyToOne(optional = false)
    private Utilisateur idutilisateur;

    public Operation() {
    }

    public Operation(Integer idoperation) {
        this.idoperation = idoperation;
    }

    public Integer getIdoperation() {
        return idoperation;
    }

    public void setIdoperation(Integer idoperation) {
        this.idoperation = idoperation;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateconnexion() {
        return dateconnexion;
    }

    public void setDateconnexion(Date dateconnexion) {
        this.dateconnexion = dateconnexion;
    }

    public Integer getHeureconnexion() {
        return heureconnexion;
    }

    public void setHeureconnexion(Integer heureconnexion) {
        this.heureconnexion = heureconnexion;
    }

    public Date getDatedeconnexion() {
        return datedeconnexion;
    }

    public void setDatedeconnexion(Date datedeconnexion) {
        this.datedeconnexion = datedeconnexion;
    }

    public Date getHeuredeconnexion() {
        return heuredeconnexion;
    }

    public void setHeuredeconnexion(Date heuredeconnexion) {
        this.heuredeconnexion = heuredeconnexion;
    }

    public String getAdresseip() {
        return adresseip;
    }

    public void setAdresseip(String adresseip) {
        this.adresseip = adresseip;
    }

    public Utilisateur getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(Utilisateur idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idoperation != null ? idoperation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Operation)) {
            return false;
        }
        Operation other = (Operation) object;
        if ((this.idoperation == null && other.idoperation != null) || (this.idoperation != null && !this.idoperation.equals(other.idoperation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Operation[ idoperation=" + idoperation + " ]";
    }
    
}

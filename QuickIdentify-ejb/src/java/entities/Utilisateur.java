/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author AICHA MIMI
 */
@Entity
@Table(name = "utilisateur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Utilisateur.findAll", query = "SELECT u FROM Utilisateur u")
    , @NamedQuery(name = "Utilisateur.findByIdutilisateur", query = "SELECT u FROM Utilisateur u WHERE u.idutilisateur = :idutilisateur")
    , @NamedQuery(name = "Utilisateur.findByNom", query = "SELECT u FROM Utilisateur u WHERE u.nom = :nom")
    , @NamedQuery(name = "Utilisateur.findByPrenom", query = "SELECT u FROM Utilisateur u WHERE u.prenom = :prenom")
    , @NamedQuery(name = "Utilisateur.findByDatenais", query = "SELECT u FROM Utilisateur u WHERE u.datenais = :datenais")
    , @NamedQuery(name = "Utilisateur.findByLieunais", query = "SELECT u FROM Utilisateur u WHERE u.lieunais = :lieunais")
    , @NamedQuery(name = "Utilisateur.findBySexe", query = "SELECT u FROM Utilisateur u WHERE u.sexe = :sexe")
    , @NamedQuery(name = "Utilisateur.findByPerPhoto", query = "SELECT u FROM Utilisateur u WHERE u.perPhoto = :perPhoto")
    , @NamedQuery(name = "Utilisateur.findByLogin", query = "SELECT u FROM Utilisateur u WHERE u.login = :login")
    , @NamedQuery(name = "Utilisateur.findByPassword", query = "SELECT u FROM Utilisateur u WHERE u.password = :password")
    , @NamedQuery(name = "Utilisateur.findByDateembauche", query = "SELECT u FROM Utilisateur u WHERE u.dateembauche = :dateembauche")
    , @NamedQuery(name = "Utilisateur.findByPhoto", query = "SELECT u FROM Utilisateur u WHERE u.photo = :photo")
    , @NamedQuery(name = "Utilisateur.findByRole", query = "SELECT u FROM Utilisateur u WHERE u.role = :role")})
public class Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idutilisateur")
    private Integer idutilisateur;
    @Size(max = 254)
    @Column(name = "nom")
    private String nom;
    @Size(max = 254)
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "datenais")
    @Temporal(TemporalType.DATE)
    private Date datenais;
    @Size(max = 254)
    @Column(name = "lieunais")
    private String lieunais;
    @Size(max = 254)
    @Column(name = "sexe")
    private String sexe;
    @Size(max = 254)
    @Column(name = "per_photo")
    private String perPhoto;
    @Size(max = 254)
    @Column(name = "login")
    private String login;
    @Size(max = 254)
    @Column(name = "password")
    private String password;
    @Column(name = "dateembauche")
    @Temporal(TemporalType.DATE)
    private Date dateembauche;
    @Size(max = 254)
    @Column(name = "photo")
    private String photo;
    @Size(max = 254)
    @Column(name = "role")
    private String role;
    @ManyToMany(mappedBy = "utilisateurCollection")
    private Collection<Menu> menuCollection;
    @OneToMany(mappedBy = "idutilisateur")
    private Collection<Dossieridentification> dossieridentificationCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idutilisateur")
    private Collection<Produit> produitCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idutilisateur")
    private Collection<Operation> operationCollection;

    public Utilisateur() {
    }

    public Utilisateur(Integer idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public Integer getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(Integer idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDatenais() {
        return datenais;
    }

    public void setDatenais(Date datenais) {
        this.datenais = datenais;
    }

    public String getLieunais() {
        return lieunais;
    }

    public void setLieunais(String lieunais) {
        this.lieunais = lieunais;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getPerPhoto() {
        return perPhoto;
    }

    public void setPerPhoto(String perPhoto) {
        this.perPhoto = perPhoto;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateembauche() {
        return dateembauche;
    }

    public void setDateembauche(Date dateembauche) {
        this.dateembauche = dateembauche;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @XmlTransient
    public Collection<Menu> getMenuCollection() {
        return menuCollection;
    }

    public void setMenuCollection(Collection<Menu> menuCollection) {
        this.menuCollection = menuCollection;
    }

    @XmlTransient
    public Collection<Dossieridentification> getDossieridentificationCollection() {
        return dossieridentificationCollection;
    }

    public void setDossieridentificationCollection(Collection<Dossieridentification> dossieridentificationCollection) {
        this.dossieridentificationCollection = dossieridentificationCollection;
    }

    @XmlTransient
    public Collection<Produit> getProduitCollection() {
        return produitCollection;
    }

    public void setProduitCollection(Collection<Produit> produitCollection) {
        this.produitCollection = produitCollection;
    }

    @XmlTransient
    public Collection<Operation> getOperationCollection() {
        return operationCollection;
    }

    public void setOperationCollection(Collection<Operation> operationCollection) {
        this.operationCollection = operationCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idutilisateur != null ? idutilisateur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.idutilisateur == null && other.idutilisateur != null) || (this.idutilisateur != null && !this.idutilisateur.equals(other.idutilisateur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Utilisateur[ idutilisateur=" + idutilisateur + " ]";
    }
    
}

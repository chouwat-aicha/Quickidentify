/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contollers;

import entities.Produit;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import sessions.ProduitFacadeLocal;

/**
 *
 * @author AICHA MIMI
 */
public class ProduitContoller {
    @EJB
    private ProduitFacadeLocal produitFacade;
    private List<Produit> listProduit = new ArrayList<>();  
    /**
     * Creates a new instance of ProduitContoller
     */
    public ProduitContoller() {
    }
     @PostConstruct
    public void init(){
       listProduit.clear();
       listProduit.addAll(produitFacade.findAll());
    }

    public ProduitFacadeLocal getProduitFacade() {
        return produitFacade;
    }

    public void setProduitFacade(ProduitFacadeLocal produitFacade) {
        this.produitFacade = produitFacade;
    }

    public List<Produit> getListProduit() {
        return listProduit;
    }

    public void setListProduit(List<Produit> listProduit) {
        this.listProduit = listProduit;
    }
    
    
}

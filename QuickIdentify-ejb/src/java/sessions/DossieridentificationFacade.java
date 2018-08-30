/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Dossieridentification;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author AICHA MIMI
 */
@Stateless
public class DossieridentificationFacade extends AbstractFacade<Dossieridentification> implements DossieridentificationFacadeLocal {

    @PersistenceContext(unitName = "QuickIdentify-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DossieridentificationFacade() {
        super(Dossieridentification.class);
    }
    
}

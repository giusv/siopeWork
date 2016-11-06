/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author GML
 */
@Stateless
public class FlussoFacade extends AbstractFacade<Flusso> implements FlussoFacadeLocal {

    @PersistenceContext(unitName = "general")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FlussoFacade() {
        super(Flusso.class);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.TypeProduit;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author simob
 */
@Stateless
public class TypeProduitFacade extends AbstractFacade<TypeProduit> {

    @PersistenceContext(unitName = "inventoryStockManagment_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TypeProduitFacade() {
        super(TypeProduit.class);
    }
    
}

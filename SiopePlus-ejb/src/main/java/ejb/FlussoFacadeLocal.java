/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author GML
 */
@Local
public interface FlussoFacadeLocal {

    void create(Flusso flusso);

    void edit(Flusso flusso);

    void remove(Flusso flusso);

    Flusso find(Object id);

    List<Flusso> findAll();

    List<Flusso> findRange(int[] range);

    int count();
    
}

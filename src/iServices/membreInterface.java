/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iServices;

import entites.membre;
import java.sql.SQLException;



/**
 *
 * @author houssem
 */
public interface membreInterface {
    
    
   public void ajouterMembre(membre m)throws SQLException ;
   
   
   public void supprimerMembre(int id)throws SQLException ;
   
   
   public void modifierMembre(int id, membre m)throws SQLException ;

    
}

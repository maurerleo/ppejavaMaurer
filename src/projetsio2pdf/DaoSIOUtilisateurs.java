/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsio2pdf;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author c.nadal
 */
public class DaoSIOUtilisateurs{

    public DaoSIOUtilisateurs() {
        
    }
    
    public void imprimerLesUtilisateurs(){
        
        //on récupère une connexion au serveur de BDD
        
        DaoSIO co=DaoSIO.getInstance();
       
        //On exécute la requete
        ResultSet lesResultats=co.requeteSelection("select * from ppe3_utilisateurs");
        
        try {
            while(lesResultats.next()){
                System.out.println(lesResultats.getString("identifiant"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoSIOUtilisateurs.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
    }
    
    
}

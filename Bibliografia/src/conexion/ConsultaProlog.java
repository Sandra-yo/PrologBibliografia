/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import org.jpl7.Query;



/**
 *
 * @author 52477
 */
public class ConsultaProlog {
   
    public static String run(String busqueda){
        try{
           Query q = new Query("consult('src/database/autores.pl')");
            if(q.hasSolution()){
                System.out.println(busqueda);
                //String personaje=JOptionPane.showInputDialog("Personaje:");
             Query q2 = new Query(busqueda);
             String answer="<html>";
                while (q2.hasNext()) {
                    answer+=q2.nextSolution().get("X")+"<br>";
                    
                }
                answer+="</html>";
                return(answer.replace('_', ' '));
            }else{
                System.out.println("Imposible conectar");
                return null;
            }
            
        }catch(HeadlessException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}

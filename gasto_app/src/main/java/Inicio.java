
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *@version 1.0
 * @author sorth_
 */
public class Inicio {
    public static void main(String[] args) throws IOException {
        
        
        int opcion_menu = -1;
        
        String[] botones =  {"1. Ver gatos", "2. Ver favoritos" , "3. Salir"};
        do {
            
            
            
        } while (opcion_menu != 1);
        
        String opcion = (String) JOptionPane.showInputDialog(null, "Gatitos", "Menu principal", JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        
        for (int i = 0; i < botones.length; i++) {
            if (opcion.equals(botones[i])) {
                opcion_menu = i;
            }
        }
        
        switch(opcion_menu){
            case 0:
                GatosService.verGatos();
                break;
                 case 1:
                     Gatos gatos = new Gatos();
                GatosService.verFavoritos(gatos.getApikey());
                break;
            default:
                break;
        }
       
    }
}

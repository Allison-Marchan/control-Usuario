
package grupuser;
import javax.swing.JOptionPane;



public class security {
    frmControl login =new frmControl ();
    String res;
    public void validarUsuario (String usuarios[], String user ,String password,int intentos) {
    boolean encontrado = false;
    
        for  (int i = 0; i < usuarios.length; i++) {
             if((usuarios[i].equalsIgnoreCase(user) && usuarios[i+1].equals(password))){
            res= "Bienvenido " + user;
            encontrado = true;
            JOptionPane.showMessageDialog(null, res, "Inicio de sesion" ,JOptionPane.INFORMATION_MESSAGE);
            intentos=0;
            frmControl.setIntentos(intentos);
            new frmControl().setVisible(true);
                    
            
              break;
              }
        }
if (encontrado==false){
         res = "Clave y/o usuario incorrectos van" + intentos + "Intentos fallidos" ;
         JOptionPane.showMessageDialog(null, res,"Inicio de Sesion",JOptionPane.ERROR_MESSAGE);
}
if (intentos > 2){
    JOptionPane.showMessageDialog(null, "3 intentos fallidos , se bloquea","Inicio de sesion" , JOptionPane.ERROR_MESSAGE);
    System.exit(0);
       }
      }
    }




    
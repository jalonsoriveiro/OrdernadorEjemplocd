package exobxatributos;

/**
 *
 * @author jalonsoriveiro
 */
public class Direccion {
    private String eMail;
    private String telefono;
    
     public Direccion(){
         
   }    
   public Direccion(String eMail,String telf){   
       this.eMail = eMail;
       telefono = telf;   
   } 
   //Metodos de acceso
   public void setEmail(String eMail){           
        this.eMail = eMail; 
    }    
    
   public String getEmail(){   
        return this.eMail;
   }   
   public void setTelefono(String tl){       
        telefono = tl;   
   }
   public String getTelefono(){   
       return telefono;   
   }
   
}

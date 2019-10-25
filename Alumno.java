package exobxatributos;

/**
 *
 * @author jalonsoriveiro
 */
public class Alumno {

    private String nome;
    private int nota;
    private Direccion dire;
    private Direccion dir;
public Alumno(){
    dire = new Direccion();

}    
public Alumno(String nome,int not,String email,String telefono){

    this.nome = nome;
    nota = not;
    dire = new Direccion(email,telefono);
}    
public Alumno(String nome,int not,Direccion dir){

    this.nome = nome;
    nota = not;
    this.dir = dir;
}    
public void setNome(String nome){

  this.nome = nome;

}
public String getNome(){

    return this.nome;
}
public void setNota(int nota){

    this.nota = nota;
}
public int getNota(){

    return nota;
}
public Direccion getDire(){

    return dire;
}
public void setDire(Direccion dire){

   this.dire = dire;
}
public void amosar(){

      
System.out.print("nombre:"+nome+"\n Nota: "+nota+"\n Direccion "+dire.getEmail()+"\n Telefono "+dire.getTelefono());
}
}

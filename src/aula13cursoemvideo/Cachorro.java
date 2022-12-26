/*
 filho da classe mamifero 
*/
package aula13cursoemvideo;

  public class Cachorro extends Mamifero{

      
    // polimorfismo, sobreescrever
    @Override
    void emitirSom() {
        System.out.println("AU au au au ");
    }

    
    
    
    /*
    polimorfismo sobrecarga
    
    assinaturas dos metodos diferentes e
    na mesma classe , é seria sobreCarga

    **/
    
    public void reagir(String frase){
        
        if ( frase == "toma comida" || frase == "Olá"){
            System.out.println("Abanar o rabo e latir");
        } else {
              System.out.println("Rosnarrrr");
            } 
    }//<<< fim metodo
    
    public void reagir(int hora, int min){
        if(hora < 12){
          System.out.println("Abanar o rabo ");
            }else if(hora >= 18){
                System.out.println("Ignorar"); 
        }else {
            System.out.println("Abanar e latir");
           }          
        }
    
    
    public void reagir(boolean dono){
           
        if(dono == true){
            System.out.println("Abanar..");        
        }else{
            System.out.println("rosnar..");
        }
    
    }
    
    public void reagir(int idade, float peso){
        if( idade < 5 ){
            if(peso < 10 ){
                System.out.println("Abanar...");
            }else{
                System.out.println("Latir..");
            }
        }else{
            if(peso < 10){
                System.out.println("Rosnar..");
            }else{
                System.out.println("Ignorar...");  
            }
        } 
        
    }//<< fim metodo 
    
    
    
    
    // metodos especiais 
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
      
      
    
      
    
}

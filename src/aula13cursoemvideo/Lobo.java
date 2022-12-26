/*

 FILHO DA CLASSE MAMIFERO

*/
package aula13cursoemvideo;

 public class Lobo extends Mamifero{

     
     // POLIMORFISMO SOBREESCREVER 
    @Override
    void emitirSom() {
        System.out.println("Auuuuuuuuuuuuu....");
    }

    
    
    
    
    
    
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

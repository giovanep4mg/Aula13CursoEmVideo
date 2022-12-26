/*
 Aula sobre polimorfismo, tipo sobreposiçao
 assinatura == (quantidade e tipos de atributos)
 
ASSINATURA IGUAIS E CLASSE DIFERENTES ,ai será SOBREESCREVER.

se ASSINATURA FOR DIFERENTE  e MESMA CLASSE, ai será SOBREPOSIÇAO.

*/
package aula13cursoemvideo;

public class Aula13CursoEmVideo {

    public static void main(String[] args) {
        // criando objetos para chamar as classes
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro ca = new Cachorro();
    /*    
   //>>>>   metodos com a mesma assinatura ( quantidade e tipos de atributos) <<
        // ai será sobreescrever
        m.emitirSom();
        l.emitirSom();
        ca.emitirSom();
    **/
    
  //>>> metodos com assinaturas diferentes ,mesma classe, é tipo SOBREPOSIÇAO<<
    // reagindo a frase, boa e ruim
    ca.reagir("Olá"); 
    ca.reagir("Vai apanhar");
    
    // reagir a hora
    ca.reagir(12, 00);
    ca.reagir(22, 00);
    
    // reagir ao dono
    ca.reagir(true);
    ca.reagir(false);
    
    // reagir a idade e peso
    ca.reagir(1, 52f);
    ca.reagir(1, 2f);
    
    
    
    }
    
}

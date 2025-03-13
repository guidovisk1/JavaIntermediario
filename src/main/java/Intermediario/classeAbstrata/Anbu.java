package Intermediario.classeAbstrata;

// As classes finals tornam a classe impossível de ser extendida por outra class
// Já a classe abstract torna impossível a criação de um objeto da classe que usa abstract!
// São coisas diferentes


final public class Anbu {

    String nome;
    int idade;

    public void anb(){
        System.out.println("Sou um ambu");
    }

}

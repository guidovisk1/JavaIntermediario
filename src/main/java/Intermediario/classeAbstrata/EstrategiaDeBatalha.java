package Intermediario.classeAbstrata;

public interface EstrategiaDeBatalha {

    // Por padrão, antes deste String, tem um "final" mas não é necessário colocar ele
    // Havendo um final, não é possível mudar o valor ali ou dar um override!
    // Como se fosse uma variável const do Java Script
    final String nome = "Estrategia Nevoa";

     // Preciso instanciar ele obrigatoriamente em todo lugar que eu implementar essa interface
    void estrategiaDeBatalhaNinja();

    void inteligenciaDeCombate();

    void inteligenciaDeCombate(int qi);
}

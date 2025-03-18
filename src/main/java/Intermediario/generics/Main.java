package Intermediario.generics;

public class Main {
    public static void main(String[] args) {
        EquipamentosNinja equipamentosNinja = new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja equipamentosNinja2 = new EquipamentosNinja("Pergaminho");
        EquipamentosNinja equipamentosNinja3 = new EquipamentosNinja("Shuriken");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamento(equipamentosNinja);
        bolsaGenerica.adicionarEquipamento(equipamentosNinja2);
        bolsaGenerica.adicionarEquipamento(equipamentosNinja3);

    }
}

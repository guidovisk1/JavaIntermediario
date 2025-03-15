package Intermediario.lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Array
        // Arrays são estáticos, não alteram de tamanho automaticamente
        // Se precisar adicionar mais memória, é necessário fazer isso manualmente
        // Não altera nem pra cima e nem pra baixo, neste caso ele sempre vai separar o número de valores que eu reservei!
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Saskura";

        for(int i = 0; i < ninjasArray.length; i++)
            System.out.println(ninjasArray[i]);

        //Listas
        // Listas não são estaticas, elas podem aumentar e diminuir
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Kiba");
        ninjasList.add("Orochimaru");
        ninjasList.add("Kisame");
        ninjasList.add("Kakashi");

        System.out.println(ninjasList.size()); // Pegar o tamamho da lista

        System.out.println(ninjasList); // Lista com o Kakashi
        ninjasList.remove("Kakashi");
        System.out.println(ninjasList); // Lista sem o kakashi por conta do método remove

        // Trocar elementos  - Naruto pelo Hashirama
        ninjasList.set(0, "Hashirama");
        System.out.println(ninjasList);

        // Tamanho da lista
        System.out.println(ninjasList.size());

        // Acessando um índice inválido da lista -- Vai dar um erro por isso está comentado
        //System.out.println(ninjasList.get(10));
    }
}

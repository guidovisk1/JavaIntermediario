package Intermediario.lists;

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

    }
}

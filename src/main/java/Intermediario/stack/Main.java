package Intermediario.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Array
        // Estáticos e referencias de memória prévia
        String[] ninjasArray = new String[3];
        ninjasArray[1] = "Naruto Uzumaki";
        // Lists
        // Dinâmicas e tamanho e diminui conforme o necessário - Já possuem muitas coisas implementadas
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naurto Uzumaki");

        // Stack - Piha
        // Last in First out
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Naruto Uzumaki"); // Push vai adicionar elementos em minha Stack
        ninjaStack.push("Sasuke Uchiha"); // Push vai adicionar elementos em minha Stack
        ninjaStack.push("Sakura Haruno");

        System.out.println(ninjaStack);
        System.out.println(ninjaStack.size());
        System.out.println(ninjaStack.peek());

        ninjaStack.pop(); // Remover o último item adicionado em minha pilha, neste caso a Sakura

        System.out.println(ninjaStack);
        System.out.println(ninjaStack.size());
        System.out.println(ninjaStack.peek());



    }
}

package Intermediario.records;

public record NinjaRecord(String nome, String email, int telefone) {
    // Todos os atributos são FINAL por padrao
    // Records não tem SETTERS
    // Tudo é criado por padrão, construtores, getters, toString(), tudo em somente uma linha!
    // Não consigo alterar os objetos criados através dele
    // ELE ABSTRAI O GET, AO INVES DE POR EXEMPLO getNome, seria somente nome()
   // Voce usa records quando vc sabe que uma classe será constante. Igual um ENUM
    // Por exemplo nomeDoFuncionario, ID - Já que esses 2 atributos nunca irão mudar
    // Ao invés de criar uma classe, basta criar um record já que os valores não mudam
    public String emailCaixaAlta(){
        return email.toUpperCase();
    }
}

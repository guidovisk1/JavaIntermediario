package Intermediario.records;

public class Main {
    public static void main(String[] args) {
        Ninja cadastro = new Ninja("Naruto", "naruto@gmail.com", 9999);
        System.out.println(cadastro.getNome()); // Aqui utiliza o get já que é uma classe e não um record


        NinjaRecord cadastro_record = new NinjaRecord("Sasuke", "sasuke@gmail.com", 1111);
        System.out.println(cadastro_record.nome());// Em records não usa a convenção do get,
                                                   // Ele cria somente o nome do atrb
        System.out.println(cadastro_record.emailCaixaAlta());
    }
}

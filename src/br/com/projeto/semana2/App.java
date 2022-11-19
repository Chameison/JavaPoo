package br.com.projeto.semana2;

import br.com.projeto.semana2.classes.Atendimento;
import br.com.projeto.semana2.classes.Cliente;
import br.com.projeto.semana2.classes.Diarista; //aqui a importação

public class App {
    public static void main(String[] args) {
    //Passo #02
        //constructor nada mais é do que um metodo para construir objeto e gerar instancia do objeto
    var diarista = new Diarista("Chameison Lima", "(68) 99950-5446", "MOntanhes, 1517", "1qas2e23e2e2we2e"); //classe diariista esta em outro local, vamos importar
    // joao.nome = "Chameison Araujo";
    // joao.telefone = "(68) 99950-5446";
    // joao.endereco = "Montanhes 1517";
 

    System.out.println("Nome: " + diarista.getNome());
    System.out.println("Telefone: " + diarista.getTelefone());
    System.out.println("Endereço: " + diarista.getEndereco());
    System.out.println("Chave pix: " + diarista.getChavePix());
    System.out.println("Saldo: " + diarista.getSaldo());

    diarista.depositar(100);
    System.out.println("Saldo: " + diarista.getSaldo());
    diarista.sacar(50);
    System.out.println("Saldo: " + diarista.getSaldo());


    diarista.atender("Joaozinho"); //chamada do metodo atender

    var cliente = new Cliente("Leonidas", "(68) 99999999", "TRAVESSA");
    System.out.println("Nome: " + cliente.getNome());
    System.out.println("Telefone: " + cliente.getTelefone());
    System.out.println("Endereço: " + cliente.getEndereco());
    System.out.println("Saldo: " + cliente.getSaldo());
    cliente.depositar(1000);
    System.out.println("Saldo: " + cliente.getSaldo());
    cliente.sacar(400);
    System.out.println("Saldo: " + cliente.getSaldo());

    

        //poderiamos fazer isso aqui. por isso classes abstratas. 
    // var pessoa = new Pessoa(null, null, null); //apos alteramos para abstrato, deu erro nessa linha, pois ela é abstrata e pode ser aplicada somente atraves das subclasses

    // joao.atender("Joaozinho"); //chamada do metodo atender

    var atendimento = new Atendimento(); //depende das regras do negocio
    atendimento.setHoras(10);
    System.out.println(atendimento.getHoras());

    var cliente2 = new Cliente("JOSEZIN", "190", "RUA PAODELO" );
    var diarista2 = new Diarista("Maria da fatime", "188", "PRINCESINHA","123" );
    cliente2.depositar(100);
    cliente2.transferir(diarista2, 70);
    System.out.println(cliente2.getSaldo());
    System.out.println(diarista2.getSaldo());

    diarista2.transferir(cliente2, 20);
    System.out.println(cliente2.getSaldo());
    System.out.println(diarista2.getSaldo());

    System.out.println(cliente);
    System.out.println(diarista); //quando tentamos imprimir uma classe, é chamado um metodo espeical dessa classe, o toString

    var diarista3 = new Diarista("Nome teste", "190","motanhe", "as24e34e");
    var diarista4 = new Diarista("Nome teste", "190","motanhe", "as24e34e");

    
    System.out.println(diarista3.equals(diarista4)); // esse equals é quase como um comparador, por isso imprime falso, ela verifca a posicao de memoria que esse dado estar guardado
    //apos fazermos o hashCode e equals em pessoa e diarista, ele leva em consideração os atributos e nao mais a posição em memoria

    //metodo 1 toString - Representação em string daquele objeto
    //metodo 2 equals - fazer comparaçõs entre diferentes tipos de objetos de uma mesma classe
    //metodo 3 hasCode - gerar codigo unico que representa esse objeto
}   //toda e qual

}
//Ala 04 herença - -usamos quando queremos reaproveitar o codigo em diferentes classes
//nao posso ter mais de uma classe publica
//aula 05 encapsulamento - nada mais é do que uma forma de eu definir o nivel de acesso dos meus atributos, dos metodos para as classes
//temos oo public que da acesso a todos 
//temos o private que apenas dentro da classse temos acesso
//protetced somente as classes ou subclasses terao acesso a esses atributos

//aula 06 classes abstratas.
//aula 07 interfaces - é como se fosse um contrato, nao há implementação, ele define metodos que devem existir, deve ser implementados
// como esses metodos vao funcionar quem define é a classe
//aula 08 polimofirmos -- liskov, polimofismo é uma funcionalidade de OB, estruturas polimorficas
//elas coseguem mudar seu comportamento interno em determinadas circunstancias 
//LSP é parte de um conjunto de 5 praticas de codificacao conhecidas comos solid
//visam codigos de alta qualidade e alinhadas com os principios das linguagens O A O 
 //Metodos especiais
 //metodo 


// Pojo, pplain old java object -- Objeto java antigo +_ ; é ,mais ou menos uma padronização de como deveria ser uma classe
//ela diz que todos os atributos devem ser privados ou protegidos, usando metodos geters e seters, get, set


    // var maria = new Diarista("Maria Araujo", "(68) 99920-5446","Tancredo 1517" ); //classe diariista esta em outro local, vamos importar
    // // maria.nome = "Maria Araujo";
    // // maria.telefone = "(68) 99920-5446";
    // // maria.endereco = "Tancredo 1517";

    // // var jose = new Diarista("JOSE");
    // System.out.println("Nome: " + maria.nome);
    // System.out.println("Telefone: " + maria.telefone);
    // System.out.println("Endereço: " + maria.endereco);

    // System.out.println("Nome: " + jose.nome);
    // System.out.println("Telefone: " + jose.telefone);
    // System.out.println("Endereço: " + jose.endereco);

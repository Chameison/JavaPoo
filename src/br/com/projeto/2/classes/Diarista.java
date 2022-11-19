package br.com.projeto.semana2.classes;

public class Diarista {
     
    public String nome; //paara serem atributos publicos

    public String telefone;

    public String endereco;

    public Diarista(String nome, String telefone, String endereco) {
        
    } 
    //construtor, e ele ja recerbera os valores que teremos. O construtor é atribuido a classe, é criado entao a instancia do objeto

    public void atender(String nomeClienteString){  //metodo publico /tipo de retorno / nome,
        System.out.println("Realizando atendimento para cliente " + nomeClienteString);
    }

}
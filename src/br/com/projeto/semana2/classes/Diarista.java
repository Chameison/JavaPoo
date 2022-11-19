package br.com.projeto.semana2.classes;

public class Diarista extends Pessoa {
     //aqui clicamos na luzinha
   
    //poderia ter outro construtor, podemos ter varios
    //por exemplo
    private String chavePix;
    public Diarista(String nome){
        super(nome, null, null); //a responsabilidade por criar o objeto é da classe pessoa, entao definimos como nulo os outros parametros
    }

    public Diarista(String nome, String telefone, String endereco, String chavePix) { //precisamos passar os atributo do objeto
        super(nome, telefone, endereco);//nao da pra ser nome = nome, temos qe     
        this.chavePix = chavePix;
        //usamos this.nome this faz referencia a propria classe, ao proprio objeto

        // this.nome = nome;
        // this.telefone = telefone;
        // this.endereco = endereco;

    } 
    
    //construtor, e ele ja recerbera os valores que teremos. O construtor é atribuido a classe, é criado entao a instancia do objeto

    public void atender(String nomeClienteString){  //metodo publico /tipo de retorno / nome,
        System.out.println("Realizando atendimento para cliente " + nomeClienteString);
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    //criou as definicoes para esse metodo. 
    //o Override quer dizer que o metodo sacar estar sobscrevendo o metodo sacar que foi definido na interface
    //é uma boa pratica toda vez que dazemos uma sobscrita de metodo
    @Override
    public void sacar(double valor) {
        var saldoAtual = this.getSaldo();
        var novoSaldo = saldoAtual - valor;
        this.setSaldo(novoSaldo);        
    }

    @Override
    public void depositar(double valor) {
        //diarista nao ganhara o bonus
        var saldoAtual = this.getSaldo();   
        var novoSaldo = saldoAtual + valor;
        this.setSaldo(novoSaldo);     
    }
}
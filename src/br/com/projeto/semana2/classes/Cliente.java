package br.com.projeto.semana2.classes;


public class Cliente extends Pessoa{
    // public String nome; Podemos apagar esses arquivos

    // public String telefone;

    // public String  endereco;
    public Cliente(String nome, String telefone, String endereco){
        super(nome, telefone, endereco); //usamos esse metoddo para herdar o construtor
    }

    @Override
    public void depositar(double valor) { //atraves desses metodos
        var saldoAtual = this.getSaldo();
        var novoSaldo = saldoAtual + valor + (valor * 0.1);
        this.setSaldo(novoSaldo);
    }
    @Override
    public void sacar(double valor){
        var saldoAtual = this.getSaldo();
        var novoSaldo = saldoAtual - valor;
        this.setSaldo(novoSaldo);
    }
    @Override
    public String toString() {
        return "Cliente: " + this.getNome();
    }
   // o exmeplo de ter doi metodos com a mesma assinatura e tratamentos diferentes em ambas da classe, CLIENTE E DIARISTA, ISSO é polimorfismo
  
  
}

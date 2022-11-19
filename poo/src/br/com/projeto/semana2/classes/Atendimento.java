package br.com.projeto.semana2.classes;

public class Atendimento { //vai represetnar o atendimento

    private String data;
    
    private Cliente cliente; // aqui ja fazemos uma composicao, pois sa
 
    private Diarista diarista;

    private int horas; //mudamos de public para privte
     
    public void setHoras(int horas){ //para definimos a recla de negocio, criamos metodos setters.
        if(horas < 1 || horas > 12) {
            System.out.println("A quantidade de horas de um atendimento não pode ser menor que 1 e nem maior que 12");
        }else{
            this.horas = horas;
        }
    }
    //metodos gettersm, oara recuerar um valor
    public int getHoras(){
        return horas;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Diarista getDiarista() {
        return diarista;
    }
    public void setDiarista(Diarista diarista) {
        this.diarista = diarista;
    }
    
}

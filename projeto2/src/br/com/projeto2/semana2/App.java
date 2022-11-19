package br.com.projeto2.semana2;

import br.com.projeto2.semana2.models.Diarista;

public class App {
    public static void main(String[] args) {
        var diarista = new Diarista(1l, "Josefuna", "(68) 992939923", "03296987290", "Avenida das flore");
        System.out.println(diarista.getId());
        System.out.println(diarista.getNome());
        System.out.println(diarista.getTelefone());
        System.out.println(diarista.getCpf());
        System.out.println(diarista.getEndereco());


    }
}
//aplciacao de terminal
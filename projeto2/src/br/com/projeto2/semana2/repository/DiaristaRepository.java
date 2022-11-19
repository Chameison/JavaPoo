package br.com.projeto2.semana2.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.projeto2.semana2.models.Diarista;

public class DiaristaRepository implements IRepository<Diarista, Long> { //Implentamos passando os parametros<T que é model, e Long que é ID id

    private List<Diarista> diaristas;
    
    private Long idAtual;

    public DiaristaRepository() {
        diaristas = new ArrayList<>(); //nao preciso passar o tipo dentro do diamante, ja ta passando em cima
        idAtual = 1l;
    }

    @Override
    public List<Diarista> buscaTodos() {
        return diaristas;
    }

    @Override
    public Diarista cadastrar(Diarista model) {
        model.setId(idAtual);
        diaristas.add(model); //pegar o modelo e adicionar a lista de diaristas
        idAtual++;
        return model; //retomamos ao modelo com os dados atualizados
    }

    @Override
    public Diarista buscarPorId(Long id) {
        for (Diarista diarista : diaristas) {
            if(diarista.getId().equals(id)){
                return diarista;
            } //classe fazemos comparação usando equals, nao ==
        }

        return null;
    }

    @Override
    public boolean excluirPorId(Long id) {
        var diaristaEncontrada = buscarPorId(id);
        if(diaristaEncontrada != null) {
            diaristas.remove(diaristaEncontrada);
            return true;
        }

        return false;
    } 
    
    
    
    
    //implements, vamos passar o tipo, Diarista e Long, id, tipo T é model, ou seja classe diarista, tipo id é Tipo Log ID
    //CRUD - CREATE , READ, UPGRADE, DELETE    
    
}
//
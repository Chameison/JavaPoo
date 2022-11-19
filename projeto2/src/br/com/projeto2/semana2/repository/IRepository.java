package br.com.projeto2.semana2.repository;

import java.util.List;

public interface IRepository<T, ID> {
    //diferentes classes de modelos
    //generic types: atraves do operador de diamante <> : Collection; so sabe quanto formos instanciar 
    //Ele ainda nao sabe que classes sao essas, teremos que informar, tipo t é nossa classe de modelo
    List<T> buscaTodos(); //Listar todos os dados do banco, tera que deolver uma lista. que tipo de dado tera ? 
    //defini o priemro metodo

    T cadastrar(T model); //2 ele tera de devovler o tipo de modelo com os dados cadastrados, ele vai receber um tipo t tambem, o modelo, model

    T buscarPorId(ID Id); //
    boolean excluirPorId(ID id); //dizer se conseguiu ou nao fazer a exclusao, Passando o Id que queremos excluir
    
}   

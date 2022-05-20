/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testemonitoria;

/**
 *
 * @author Augusto
 */
public class Funcionario extends Pessoa {
    //Atributos
    private String especialidade;
    private float salario;
    
    
    
    
    //Métodos
    public void receberAumento(){
        
        
    }
 
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String frase() {
        return "Dados {" + "nome = " + nome + ", idade  " + idade + " anos" + ", sexo = " + sexo + ", especialidade " + especialidade + '}';
    }
}

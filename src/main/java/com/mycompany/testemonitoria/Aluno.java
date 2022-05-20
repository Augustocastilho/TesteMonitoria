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
public class Aluno extends Pessoa{
    //Atributos
    private int matricula;
    private String curso;
    
    //Métodos
    public void pagarMensalidade(){
        System.out.println("Pagando Mensalidade do Aluno " + this.nome + "!");
         
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String frase() {
        return "Dados {" + "nome = " + nome + ", idade  " + idade + " anos" + ", sexo = " + sexo + ", matricula " + matricula + '}';
    }
}

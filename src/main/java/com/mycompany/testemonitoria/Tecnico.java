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
public class Tecnico extends Pessoa{
    //Atributos
    private int registroProfissional;
    
    
    //Métodos
    public void pagarMesnalidade(){
        
    }
    
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String frase() {
        return "Dados {" + "nome = " + nome + ", idade  " + idade + " anos" + ", sexo = " + sexo + ", registro Profissional " + registroProfissional + '}';
    }
}

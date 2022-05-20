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
public class Bolsista extends Pessoa{
    //Atributos
    private float bolsa;
    
    
    //Métodos
    public void renovarBolsa(){
        System.out.println("Renovando a Bolsa do Aluno " + this.nome);
        
    }
    
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista! Pagamento Facilitado!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String frase() {
        return "Dados {" + "nome = " + nome + ", idade  " + idade + " anos" + ", sexo = " + sexo + ", numero da bolsa " + bolsa + '}';
    }
}

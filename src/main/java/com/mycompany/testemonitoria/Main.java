/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testemonitoria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Augusto
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Alunos:");
        List<Aluno> alunos = new ArrayList<>();
        String [] nomes = {"Jonas", "Mateus", "Maria", "Amanda", "Rafael", "Bia"};
        int idades[] = {34, 20, 29, 32, 53, 24};
        String [] sexos = {"M", "M", "F", "F", "M", "F"};
        int matriculas[] = {15, 22, 38, 44, 51, 62};
        for (int i =0; i<6; i++){
            Aluno a = new Aluno();
            a.setNome(nomes[i]);
            a.setSexo(sexos[i]);
            a.setIdade(idades[i]);
            a.setMatricula(matriculas[i]);
            
            a.pagarMensalidade();
            System.out.println(a.frase());
            System.out.println("");
            
            alunos.add(a);
            
        }
        
        System.out.println("");
        System.out.println("Funcionarios:");
        List<Funcionario> fun = new ArrayList<>();
        String [] nomes1 = {"Jonas", "Mateus", "Maria", "Amanda", "Rafael", "Bia"};
        int idades1[] = {34, 20, 29, 32, 53, 24};
        String [] sexos1 = {"M", "M", "F", "F", "M", "F"};
        String [] especialidade = {"Faxineiro", "Professor", "Secretaria", "Professora", "Professor", "Diretora"};
        for (int i =0; i<6; i++){
            Funcionario f = new Funcionario();
            f.setNome(nomes1[i]);
            f.setSexo(sexos1[i]);
            f.setIdade(idades1[i]);
            f.setEspecialidade(especialidade[i]);
            
            System.out.println(f.frase());
            System.out.println("");
            
            fun.add(f);
            
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeobserver;

import atividadeobserver.Models.Professor;
import atividadeobserver.Models.Aluno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author itlac
 */
public class Main {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ObservablesProfessores professoresCadastrados = new ObservablesProfessores();
        ObserversAlunos alunosCadastrados = new ObserversAlunos();

        int option;
        Professor professorEscolhido;
        Aluno alunoEscolhido;
      
        do {
            System.out.println("\n");
            System.out.println("\n1 - Criar Professor  ");
            System.out.println("2 -  Criar Aluno ");
            System.out.println("3 - Conectar Aluno a Professor ");
            System.out.println("4 - Desconectar Aluno de Professor");
            System.out.println("5 - Definir data de avaliação  ");
            System.out.println("6 - Sair da aplicação   ");
            System.out.print("\nEscoha sua opção: ");
            option = Integer.parseInt(scanner.nextLine());
            switch(option) {
               case 1:
                    System.out.print("\nDigite o nome do professor: ");
                    Professor novoProfessor = new Professor(scanner.nextLine().toUpperCase());
                    professoresCadastrados.addProfessor(novoProfessor);
                    System.out.print("\nProfessor cadastrado com sucesso: ");
                    break;
               case 2:
                    System.out.print("\nDigite o nome do aluno: ");
                    Aluno novoAluno = new Aluno(scanner.nextLine().toUpperCase());
                    alunosCadastrados.addAluno(novoAluno);
                    System.out.print("\nAluno cadastrado com sucesso: ");
                    break;
               case 3:
                    professoresCadastrados.showProfessoresCadastrados();
                    System.out.print("\nEscolha o indice do professor desejado: ");
                    professorEscolhido = professoresCadastrados.getProfessor(Integer.parseInt(scanner.nextLine()));
                    alunosCadastrados.showAlunosCadastrados();
                    System.out.print("\nEscolha o indice do aluno desejado: ");
                    alunoEscolhido = alunosCadastrados.getAluno(Integer.parseInt(scanner.nextLine()));
                    professorEscolhido.addObserver(alunoEscolhido);
                    professorEscolhido.conectarAluno(alunoEscolhido);
                    System.out.print("\nAluno "+ alunoEscolhido.getName() + " registrado com sucesso para acompanhar o professor "+ professorEscolhido.getName());
                    break;
               case 4:
                    professoresCadastrados.showProfessoresCadastrados();
                    System.out.print("\nEscolha o indice do professor desejado: ");
                    professorEscolhido = professoresCadastrados.getProfessor(Integer.parseInt(scanner.nextLine()));
                    System.out.print("\nAlunos conectados a este professor: ");
                    professorEscolhido.showTodosAlunosConectados();
                    System.out.print("\nEscolha o indice do aluno desejado: ");
                    int index = Integer.parseInt(scanner.nextLine());
                    professorEscolhido.desconectarAluno(index);
                    System.out.print("\nAluno desconectado com sucesso do professor "+ professorEscolhido.getName());
                    break;
               case 5:
                    professoresCadastrados.showProfessoresCadastrados();
                    System.out.print("\nEscolha o indice do professor desejado: ");
                    professorEscolhido = professoresCadastrados.getProfessor(Integer.parseInt(scanner.nextLine()));
                    System.out.print("\nEscolha a nova data da avaliação: ");
                    String dataAvaliacao = scanner.nextLine();
                    professorEscolhido.setDataProva(dataAvaliacao);
            }
        } while (option != 6);
    }
    
}

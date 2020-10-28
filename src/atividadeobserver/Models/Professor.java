/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeobserver.Models;

/**
 *
 * @author Italo Luis
 */
import atividadeobserver.Models.Aluno;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Professor extends Observable
{
    private String nome;
    private String dataProva;
    private List<Aluno> alunosConectados = new ArrayList<Aluno>();

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getName() {
        return nome;
    }

    public void setDataProva(String dataProva) {
        this.dataProva = dataProva;
        setChanged();
        notifyObservers(dataProva);
    }

    public void showTodosAlunosConectados(){
        int i = 0;
        for(Aluno aluno : alunosConectados){
            System.out.print("\n" + i + " - " + aluno.getName());
            i++;
        }
    }

    public void conectarAluno(Aluno aluno){
        alunosConectados.add(aluno);
    }
    
    public void desconectarAluno(int index){
        this.deleteObserver(alunosConectados.get(index));
        alunosConectados.remove(index);
    }
    

   
}

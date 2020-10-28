/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeobserver;

import atividadeobserver.Models.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author itlac
 */
public class ObserversAlunos {
    private List<Aluno> listaAlunos = new ArrayList<Aluno>();
    
    public void showAlunosCadastrados(){
        int i = 0;
        for(Aluno a : listaAlunos){
            System.out.print("\n" + i + " - " + a.getName());
            i++;
        }
    }
    
    public void addAluno(Aluno a){
        listaAlunos.add(a);
    }
    
    public Aluno getAluno(int index){
        return listaAlunos.get(index);
    }
    
}

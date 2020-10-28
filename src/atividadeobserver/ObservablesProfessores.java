/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeobserver;

import atividadeobserver.Models.Professor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author itlac
 */
public class ObservablesProfessores {
    
    private List<Professor> listaProfessores = new ArrayList<Professor>();
    
    public void showProfessoresCadastrados(){
        int i = 0;
        for(Professor p : listaProfessores){
            System.out.print("\n" + i + " - " + p.getName());
            i++;
        }
    }
    
    public void addProfessor(Professor p){
        listaProfessores.add(p);
    }
    
    public Professor getProfessor(int index){
        return listaProfessores.get(index);
    }
    
    
    
}

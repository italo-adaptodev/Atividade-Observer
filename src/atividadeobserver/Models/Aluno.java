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
import java.util.Observer;
import java.util.Observable;

public class Aluno implements Observer
{
    private String nome;
    
    public Aluno(String nome) {
        this.nome = nome;
    }
    
    public void update(Observable prof, Object mensagem) {
        System.out.println(this.getName()+ ", O professor " + ((Professor) prof).getName() + " mudou a data da prova para " + mensagem);
    }
    
    public String getName() {
        return nome;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

/**
 *
 * @author ifnmg
 */
public class Aluno {
  
    private String nome;
    private String matricula;
    
    public String getNome(){
    return this.nome;
    }
    public void setNome(String n){
    this.nome = n;
    }
    
    public String getMatricula(){
    return this.matricula;
    }
    public void setMatricula (String m){
    this.matricula = m;
    }
}

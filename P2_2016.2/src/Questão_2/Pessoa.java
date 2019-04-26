/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Questão_2;

public class Pessoa {
    private String cpf;
    private String nome;
private int idade;
    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public boolean equals(Object o){
        if(o instanceof Pessoa){
            Pessoa p =(Pessoa) o;
            return(this.cpf.equals(p.cpf));
        }
        return false;
    }
    public String toString(){
    	 return nome + " - CPF: " + cpf + " - Idade: " + idade + " anos";

    }
}

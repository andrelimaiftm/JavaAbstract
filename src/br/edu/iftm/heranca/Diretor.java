package br.edu.iftm.heranca;

import br.edu.iftm.interfaces.Autenticavel;

public class Diretor extends Funcionario implements Autenticavel{

    private int senha;    
    
    public Diretor(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;        
    }

    @Override
    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Acesso Permitido!");
            return true;
        }else{
            System.out.println("Acesso Negado!");
            return false;
        }
    }

    @Override
    public double getBonificacao(){
        return this.salario*0.4+1000;
    }
    
}

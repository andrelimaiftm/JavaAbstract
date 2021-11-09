package br.edu.iftm.heranca;

import br.edu.iftm.interfaces.Autenticavel;

public class Cliente implements Autenticavel{

    private int senha;   

    public Cliente(int senha) {
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
    
}

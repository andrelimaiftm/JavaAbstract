package br.edu.iftm.heranca;

public abstract class Secretaria extends Funcionario {
   
   protected boolean teveAumento;

    public Secretaria(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.teveAumento = false;        
    }

    /*@Override
    public double getBonificacao() {
        if(!teveAumento){
            this.teveAumento = true;
            return this.salario*0.1;
        }else{
           return this.salario*0.2; 
        }
        
    }*/
    
}

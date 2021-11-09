package br.edu.iftm.heranca;

public class SecretariaAgencia extends Secretaria{

    public SecretariaAgencia(String nome, String cpf, double salario) {
        super(nome, cpf, salario);       
    }

    @Override
    public double getBonificacao() {
        if(!this.teveAumento){
            this.teveAumento = true;
            return this.salario*0.1;
        }else{
           return this.salario*0.2; 
        }
    }
    
}

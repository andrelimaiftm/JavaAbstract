package br.edu.iftm.heranca;

public class SecretariaAdministrativa extends Secretaria{

    public SecretariaAdministrativa(String nome, String cpf, double salario) {
        super(nome, cpf, salario);        
    }

    @Override
    public double getBonificacao() {
        if(!this.teveAumento){
            this.teveAumento = true;
            return this.salario*0.12;
        }else{
           return this.salario*0.2; 
        }
    }
    
}

package br.edu.iftm.heranca;

public abstract class Funcionario {
   
    protected String nome;
    protected String cpf;
    protected double salario;    

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public abstract double getBonificacao();  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario fabricaFuncionario(String tipoFuncionario){
        if(tipoFuncionario.equals("Gerente")){
            Gerente gerente = new Gerente(null, null, 0d, 0,0);
            return gerente;
        }else if(tipoFuncionario.equals("SecretariaAdministrativa")){
            SecretariaAdministrativa secretariaAdm = new SecretariaAdministrativa(null, null, 0d);
            return secretariaAdm;
        }else if(tipoFuncionario.equals("SecretariaAgencia")){
            SecretariaAgencia secretariaAg =  new SecretariaAgencia(null, null, 0d);
            return secretariaAg;
        }else if(tipoFuncionario.equals("Diretor")){
            Diretor diretor = new Diretor(null, null, 0d, 0);
            return diretor;
        }else{
            return null;
        }
    }

    
    
}

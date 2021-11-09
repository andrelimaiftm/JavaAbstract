import br.edu.iftm.heranca.Diretor;
import br.edu.iftm.heranca.Gerente;
import br.edu.iftm.heranca.SecretariaAgencia;

public class App {
    public static void main(String[] args) throws Exception {        
        Gerente g = new Gerente("Maria", "123456789", 5000d, 100, 10);
        Diretor d = new Diretor("Andre", "343456565", 5000d, 200);
        d.getBonificacao();
        g.autentica(100);
        System.out.println(g.getBonificacao());
        //Funcionario f= g;
        //System.out.println(f.getBonificacao());
        SecretariaAgencia s = new SecretariaAgencia("Julia", "987654321", 2000d);
        System.out.println(s.getBonificacao());
        /*ControleDeBonificacao cb = new ControleDeBonificacao();
        cb.registra(g);
        cb.registra(s);
        System.out.println(cb.getTotalDeBonificacoes());
        Funcionario[] vet = new Funcionario[2];
        vet[0] = s;
        vet[1] = g;*/

    }
}

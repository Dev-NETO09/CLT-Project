import java.util.List;

public class Operario extends Funcionario {

    public Operario(String nome, String matricula, Turno turno, List<Epi> epis) {
        super(nome, matricula, turno, epis);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("[Operario]");
        super.exibirInformacoes();
    }
}

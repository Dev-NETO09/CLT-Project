import java.util.List;

public class Gestor extends Funcionario {

    public Gestor(String nome, String matricula, Turno turno, List<Epi> epis) {
        super(nome, matricula, turno, epis);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("[Gestor]");
        super.exibirInformacoes();
    }
}

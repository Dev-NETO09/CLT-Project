import java.util.ArrayList;
import java.util.List;

public abstract class funcionario {
    protected String nome;
    protected String matricula;
    protected String turno;
    protected List<Epi> epis;

    public funcionario(String nome, String matricula, String turno) {
        this.nome = nome;
        this.matricula = matricula;
        this.turno = turno;
        this.epis = new ArrayList<>();
    }

    public void adicionarEPI(Epi epi) {
        epis.add(epi);
    }

    public void listarEPIs() {
        if (epis.isEmpty()) {
            System.out.println(" - Nenhum EPI cadastrado.");
        } else {
            for (Epi epi : epis) {
                System.out.println(" - " + epi);
            }
        }
    }

    public abstract void exibirInfo();
}

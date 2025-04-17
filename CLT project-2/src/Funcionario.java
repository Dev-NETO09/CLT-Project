import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Funcionario {
    protected String nome;
    protected String matricula;
    protected Turno turno;
    protected List<Epi> epis;

    public Funcionario(String nome, String matricula, Turno turno, List<Epi> epis) {
        this.nome = nome;
        this.matricula = matricula;
        this.turno = turno;
        this.epis = epis;
    }


    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Turno: " + turno);

        System.out.println("EPIs:");
        for (Epi epi : epis) {
            System.out.println(" - " + epi.getCodigo() + " (Codigo: " + epi.getDescricao() + ", Vencimento: " + epi.getVencimento() + ")");
        }

        baterPonto();
    }


    public void baterPonto() {
        String horario = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println(nome + " bateu ponto em: " + horario);
    }

    String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getMatricula() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getTurno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Iterable<Epi> getEpis() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

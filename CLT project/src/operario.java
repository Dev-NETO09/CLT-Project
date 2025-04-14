import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class operario extends funcionario {

    public operario(String nome, String matricula, String turno) {
        super(nome, matricula, turno);
    }

    public void baterPonto() {
        String horario = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println(nome + " bateu ponto em: " + horario);
    }

    @Override
    public void exibirInfo() {
        System.out.println("[Operario]");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Turno: " + turno);
        System.out.println("EPIs:");
        listarEPIs();
    }
}

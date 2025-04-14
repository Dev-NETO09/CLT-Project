public class gestor extends funcionario {

    public gestor(String nome, String matricula, String turno) {
        super(nome, matricula, turno);
    }

    @Override
    public void exibirInfo() {
        System.out.println("[Gestor]");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Turno: " + turno);
    }
}


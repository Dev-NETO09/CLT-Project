public class Exibicao {
    public static void exibirInformacoes(Funcionario funcionario) {
        System.out.println("[" + funcionario.getClass().getSimpleName() + "]");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Matricula: " + funcionario.getMatricula());
        System.out.println("Turno: " + funcionario.getTurno());
        System.out.println("EPIs:");
        for (Epi epi : funcionario.getEpis()) {
            System.out.println(" - " + epi);
        }
        System.out.println("--------------------------------------------------");
    }

    public static void exibirSubstituicaoEpi(Epi epiAntigo, Epi epiNovo) {
        System.out.println("EPI substituído com sucesso!");
        System.out.println("EPI Antigo: " + epiAntigo);
        System.out.println("EPI Novo: " + epiNovo);
    }
}

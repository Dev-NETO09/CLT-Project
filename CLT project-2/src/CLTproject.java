import java.util.ArrayList;
import java.util.List;

public class CLTproject {
    public static void main(String[] args) {
     
        List<Epi> epiOperario = new ArrayList<>();
        epiOperario.add(new Epi("EPI001", "Capacete de Seguranca", "2025-12-10"));
        epiOperario.add(new Epi("EPI002", "Oculos de Protecao", "2026-01-01"));
        epiOperario.add(new Epi("EPI003", "Luva de Protecao", "2024-08-01"));

        List<Epi> epiGestor = new ArrayList<>();
        epiGestor.add(new Epi("EPI004", "Botas de Seguranca", "2023-12-20"));
        epiGestor.add(new Epi("EPI005", "Cinto de Seguranca", "2027-06-15"));

     
        Operario op1 = new Operario("Jacinto Pinto", "OP123", Turno.NOITE, epiOperario);
        Gestor g1 = new Gestor("Paula Tejano", "GT001", Turno.TARDE, epiGestor);

        // bater ponto
        System.out.println("INFORMACOES INICIAIS:");
        op1.exibirInformacoes();
        
        System.out.println("\n--------------------------------------------------\n");

        g1.exibirInformacoes();

        // Simulei aq
        System.out.println("\nEPI substituido com sucesso!");
        System.out.println("EPI Antigo: EPI003 (Codigo: Luva de Protecao, Vencimento: 2024-08-01)");
        System.out.println("EPI Novo: EPI006 (Codigo: Luva de Protecao Nova, Vencimento: 2026-05-10)");

        System.out.println("\nEPI substituido com sucesso!");
        System.out.println("EPI Antigo: EPI004 (Codigo: Botas de Seguranca, Vencimento: 2023-12-20)");
        System.out.println("EPI Novo: EPI007 (Codigo: Botas de Seguranca Novas, Vencimento: 2028-01-01)");

        // Exibindo as informações após substituição de EPIs
        System.out.println("\nINFORMACOES APoS A SUBSTITUICAO:");
        op1.exibirInformacoes();
        
        System.out.println("\n--------------------------------------------------\n");

        g1.exibirInformacoes();
    }
}

import java.time.LocalDate;

public class CLTproject {
    public static void main(String[] args) {
      
        Epi capacete = new Epi("Capacete de Seguranca", "EPI001", LocalDate.of(2025, 12, 10));
        Epi oculos = new Epi("Oculos de Protecao", "EPI003", LocalDate.of(2026, 1, 1));

   
        operario op1;
        op1 = new operario("Jacinto Pinto", "OP123", "noite");
        gestor gestor1 = new gestor("Paula Tejano", "GT001", "tarde");

   
        op1.adicionarEPI(capacete);
        op1.adicionarEPI(oculos);

     
        op1.exibirInfo();
        op1.baterPonto();

        System.out.println("\n-------------------------------------------------------------------\n");

        gestor1.exibirInfo();
    }
}

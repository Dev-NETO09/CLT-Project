import java.time.LocalDate;

public class Epi {
    private String nome;
    private String codigo;
    private LocalDate dataVencimento;

    public Epi(String nome, String codigo, LocalDate dataVencimento) {
        this.nome = nome;
        this.codigo = codigo;
        this.dataVencimento = dataVencimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return nome + " (Codigo: " + codigo + ", Vencimento: " + dataVencimento + ")";
    }
}

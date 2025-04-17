public class Epi {
    private final String codigo;
    private final String descricao;
    private final String vencimento;

    public Epi(String codigo, String descricao, String vencimento) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.vencimento = vencimento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getVencimento() {
        return vencimento;
    }
}

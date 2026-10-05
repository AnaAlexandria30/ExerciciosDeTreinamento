package br.ufpb.ana;

public class AtendimentoUnha {
    private String nome;
    private String diaAtendimento;
    private String categoriaAtendimento;

    public AtendimentoUnha(String nome, String diaAtendimento, String categoriaAtendimento) {
        this.nome = nome;
        this.diaAtendimento = diaAtendimento;
        this.categoriaAtendimento = categoriaAtendimento;
    }
    public AtendimentoUnha() {
        this("", "", "");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDiaAtendimento() {
        return diaAtendimento;
    }
    public void setDiaAtendimento(String diaAtendimento) {
        this.diaAtendimento = diaAtendimento;
    }
    public String getCategoriaAtendimento() {
        return categoriaAtendimento;
    }
    public void setCategoriaAtendimento(String categoriaAtendimento) {
        this.categoriaAtendimento = categoriaAtendimento;
    }
}

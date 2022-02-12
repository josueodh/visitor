public class Atendente implements Pessoa {

    private int matricula;
    private String nome;
    private Setor setor;

    public Atendente(int matricula, String nome, Setor setor) {
        this.matricula = matricula;
        this.nome = nome;
        this.setor = setor;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeSetor() {
        return this.setor.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirAtendente(this);
    }

}
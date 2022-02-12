public class Diretor implements Pessoa {

    private String cpf;
    private String nome;
    private float salario;

    public Diretor(String cpf, String nome, float salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCPF() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return this.salario;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirDiretor(this);
    }

}
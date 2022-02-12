public class PessoaVisitor implements Visitor {
    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirGerente(Gerente gerente) {
        return "Gerente{" +
                "matricula=" + gerente.getMatricula() +
                ", nome='" + gerente.getNome() + '\'' +
                ", setor=" + gerente.getNomeSetor() +
                '}';
    }

    @Override
    public String exibirAtendente(Atendente atendente) {
        return "Atendente{" +
                "matricula=" + atendente.getMatricula() +
                ", nome='" + atendente.getNome() + '\'' +
                ", setor='" + atendente.getNomeSetor() + '\'' +
                '}';
    }

    @Override
    public String exibirDiretor(Diretor diretor) {
        return "Diretor{" +
                "cpf=" + diretor.getCPF() +
                ", nome='" + diretor.getNome() + '\'' +
                ", salario=" + diretor.getSalario() +
                '}';
    }

}

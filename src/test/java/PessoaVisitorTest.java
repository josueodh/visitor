import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {
    @Test
    void deveExibirAtendente() {
        Atendente aluno = new Atendente(1, "Ana", new Setor("Vendas"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Atendente{matricula=1, nome='Ana', setor='Vendas'}", visitor.exibir(aluno));
    }

    @Test
    void deveExibirGerente() {
        Gerente gerente = new Gerente(1, "Maria", new Setor("Vendas"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Gerente{matricula=1, nome='Maria', setor=Vendas}", visitor.exibir(gerente));
    }

    @Test
    void deveExibirDiretor() {
        Diretor diretor = new Diretor("123", "Pedro", 5000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Diretor{cpf=123, nome='Pedro', salario=5000.0}", visitor.exibir(diretor));
    }

}
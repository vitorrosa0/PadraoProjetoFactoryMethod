package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmprestimoPessoalTest {

    @Test
    void deveAprovarEmprestimoPessoal() {
        IEmprestimo emprestimo = EmprestimoFactory.getInstancia().obterEmprestimo("Pessoal");
        assertEquals("Emprestimo pessoal aprovado", emprestimo.aprovar());
    }

    @Test
    void deveRecusarEmprestimoPessoal() {
        IEmprestimo emprestimo = EmprestimoFactory.getInstancia().obterEmprestimo("Pessoal");
        assertEquals("Emprestimo pessoal recusado", emprestimo.recusar());
    }

}
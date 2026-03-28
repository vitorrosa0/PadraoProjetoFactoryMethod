package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmprestimoFactoryTest {

    @Test
    void deveRetornarExcecaoParaEmprestimoInexistente() {
        try {
            IEmprestimo emprestimo = EmprestimoFactory.getInstancia().obterEmprestimo("Financiamento");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Emprestimo inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaEmprestimoInvalido() {
        try {
            IEmprestimo emprestimo = EmprestimoFactory.getInstancia().obterEmprestimo("Empresarial");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Emprestimo inválido", e.getMessage());
        }
    }

}
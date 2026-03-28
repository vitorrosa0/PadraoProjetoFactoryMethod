package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmprestimoImobiliarioTest {

    @Test
    void deveAprovarEmprestimoImobiliario() {
        IEmprestimo emprestimo = EmprestimoFactory.getInstancia().obterEmprestimo("Imobiliario");
        assertEquals("Emprestimo imobiliario aprovado", emprestimo.aprovar());
    }

    @Test
    void deveRecusarEmprestimoImobiliario() {
        IEmprestimo emprestimo = EmprestimoFactory.getInstancia().obterEmprestimo("Imobiliario");
        assertEquals("Emprestimo imobiliario recusado", emprestimo.recusar());
    }

}
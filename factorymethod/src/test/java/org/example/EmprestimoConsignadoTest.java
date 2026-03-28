package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmprestimoConsignadoTest {

    @Test
    void deveAprovarEmprestimoConsignado() {
        IEmprestimo emprestimo = EmprestimoFactory.getInstancia().obterEmprestimo("Consignado");
        assertEquals("Emprestimo consignado aprovado", emprestimo.aprovar());
    }

    @Test
    void deveRecusarEmprestimoConsignado() {
        IEmprestimo emprestimo = EmprestimoFactory.getInstancia().obterEmprestimo("Consignado");
        assertEquals("Emprestimo consignado recusado", emprestimo.recusar());
    }

}
package org.example;

public class EmprestimoFactory {

    private static EmprestimoFactory instancia;
    private EmprestimoFactory() {}

    public static EmprestimoFactory getInstancia() {
        if (instancia == null) {
            instancia = new EmprestimoFactory();
        }
        return instancia;
    }

    public IEmprestimo obterEmprestimo(String emprestimo) {

        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Emprestimo" + emprestimo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Emprestimo inexistente");
        }

        if (!(objeto instanceof IEmprestimo)) {
            throw new IllegalArgumentException("Emprestimo inválido");
        }

        return (IEmprestimo) objeto;
    }

}

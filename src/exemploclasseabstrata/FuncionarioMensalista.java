/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploclasseabstrata;

/**
 *
 * @author Usuário
 */
public class FuncionarioMensalista extends Funcionario {
    private double salario;
    private double desconto;

    public FuncionarioMensalista() {
    }

    public FuncionarioMensalista(double salario, double desconto, int numeroCracha, String nome, String setor, String funcao) {
        super(numeroCracha, nome, setor, funcao);
        this.salario = salario;
        this.desconto = desconto;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + "\nSalário: " + salario + "\nDesconto: " + desconto + "\nTotal: " + calcularSalario();
    }
    
       @Override
    public double calcularSalario() {
        return salario - desconto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    
    
    
    
    
}

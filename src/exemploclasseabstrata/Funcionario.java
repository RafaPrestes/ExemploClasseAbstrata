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
public abstract class Funcionario {
    private int numeroCracha;
    private String nome;
    private String setor;
    private String funcao;
    
    public Funcionario(){      
    }

    public Funcionario(int numeroCracha, String nome, String setor, String funcao) {
        this.numeroCracha = numeroCracha;
        this.nome = nome;
        this.setor = setor;
        this.funcao = funcao;
    }
    
    public String imprimir(){
        return "Crachá: " + numeroCracha + "\nNome: " + nome + 
                "\nSetor: " + setor + "\nFunção: " + funcao;
    }
    
    public abstract double calcularSalario();

    public int getNumeroCracha() {
        return numeroCracha;
    }

    public void setNumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
}

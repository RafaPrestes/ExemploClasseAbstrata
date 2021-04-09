/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploclasseabstrata;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class Main {

    
    public static void main(String[] args) {
        ArrayList<Funcionario> listFuncionario = new ArrayList<>();
        int opc = 0, tipo, cracha, horas;
        String nome,setor,funcao;
        double valor, desconto;
        
        while(opc != 3){
            
            switch(opc){
                case 1: 
                    cracha = Integer.parseInt(JOptionPane.showInputDialog("Crachá: "));
                    nome = JOptionPane.showInputDialog("Nome: ");
                    setor = JOptionPane.showInputDialog("Setor: ");
                    funcao = JOptionPane.showInputDialog("Função: ");
                    tipo = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo de funcionario? \n1- Horista \n2- Mensalista"));
                        
                        if(tipo == 1){
                            horas = Integer.parseInt(JOptionPane.showInputDialog("Horas: "));
                            valor = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
                            listFuncionario.add(new FuncionarioHorista(horas, valor, cracha, nome, setor, funcao));  
                        }else{
                            valor = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
                            desconto = Double.parseDouble(JOptionPane.showInputDialog("Desconto: "));
                            listFuncionario.add(new FuncionarioMensalista(valor, desconto, cracha, nome, setor, funcao));
                        }
                    break;
                case 2: 
                    String msg = "";
                    for(Funcionario f : listFuncionario){
                        msg += f.imprimir() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 3: break;
                default: break;
            }
        }
    }
    
}

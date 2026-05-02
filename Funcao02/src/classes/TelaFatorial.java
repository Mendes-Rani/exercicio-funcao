/**Programa exercicio para calcular o fatorial de um numero inteiro, usando a classe Fatorial, onde o usuario digita um numero e o programa exibe a formula e o resultado do fatorial.
 *
 */

package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaFatorial {
    private JSpinner txtNum;
    private JButton btnFat;
    private JPanel painelMenu;
    private JLabel lblFormula;
    private JLabel lblResult;
    private JFrame frame;

    public TelaFatorial() {
        frame = new JFrame("TelaFatorial");
        txtNum.setBounds(50, 50, 100, 30);

        btnFat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(txtNum.getValue().toString());
                Fatorial f = new Fatorial();
                f.setValor(n);
                lblFormula.setText(f.getFormula());
                lblResult.setText(Integer.toString(f.getFatorial()));

                frame.pack();
            }
        });
    }

    static void main() {
        SwingUtilities.invokeLater(new Runnable() {;
            @Override
            public void run() {
                TelaFatorial tela = new TelaFatorial();
                tela.frame.setContentPane(tela.painelMenu);
                tela.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                tela.frame.setLocationRelativeTo(null);
                tela.frame.pack();
                tela.frame.setVisible(true);
            }
        });

    }
}

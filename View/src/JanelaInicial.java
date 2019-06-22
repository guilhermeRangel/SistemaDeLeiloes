

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JanelaInicial implements ActionListener{

    JFrame janelaPrincipal = new JFrame();
    JPanel painel = new JPanel();
    JLabel BemVindo = new JLabel("Bem Vindo selecione: ");
    JanelaCadastro janelaCadastro = null;

    JButton btnCliente = new JButton("Cliente");
    JButton btnAdm = new JButton("Administrador");




    public static void main(String args[]) {

        new JanelaInicial();



    }


    public JanelaInicial() {



        janelaPrincipal.setTitle("Sistema de Leiloes");
        janelaPrincipal.setSize(200, 200);

        janelaPrincipal.setLocation(400, 200);
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add Delegates
        btnCliente.addActionListener(this);
        btnAdm.addActionListener(this);

        painel.add(BemVindo);
        painel.add(btnCliente);
        painel.add(btnAdm);

        janelaPrincipal.add(painel);//mostramos a janela
        janelaPrincipal.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCliente) {


            janelaPrincipal.setVisible(false);
            janelaCadastro = new JanelaCadastro();
        }

        if (e.getSource() == btnAdm) {
            JOptionPane.showMessageDialog(null, "Nao ta pronto");


        }
    }
}

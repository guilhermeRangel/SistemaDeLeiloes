import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaCadastro implements ActionListener{



    JanelaMenu janelaMenu = null;


    JFrame janela = new JFrame();
    JPanel painel = new JPanel();



    JLabel rotulo = new JLabel("Insira seus dados: ");

    //campos de dados
    JTextField nome = new JTextField(100);
    JTextField cpf = new JTextField(100);
    JTextField email = new JTextField(100);

    JButton btnCadastrar = new JButton("Cadastrar");
    JButton btnLimpar = new JButton("Limpar");


    public static void main(String args[]) {

        new JanelaCadastro();

    }




    public JanelaCadastro() {

        //definimos o título da janela
        janela.setTitle("Sistema de Compras - Cadastro Cliente");
        //definimos a largura e a altura da janela
        janela.setSize(400, 400);
        janela.setLocation(400, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //ADD componentes ----------------------------
        painel.add(rotulo);
        painel.add(nome);

        painel.add(cpf);
        painel.add(email);



        nome.setText("Digite seu nome:");

        cpf.setText("CPF: 000.000.000-00");
        email.setText("email@dominio.com");

        painel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 20));



        //add Delegates
        btnCadastrar.addActionListener(this);
        btnLimpar.addActionListener(this);

        //add btns
        painel.add(btnCadastrar);
        painel.add(btnLimpar);


        janela.add(painel);//mostramos a janela


        janela.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCadastrar) {

            //factory
            Cliente cliente = new Cliente(nome.getText(), cpf.getText(), email.getText());
           Cliente.setInstancia(cliente);


            JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso!!");
            janela.setVisible(false);
            janelaMenu = new JanelaMenu();

        }


        if (e.getSource() == btnLimpar) {
            nome.setText("");
            cpf.setText("");
            email.setText("");


        }

    }

}





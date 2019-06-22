import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.View;

public class JanelaMenu extends Thread implements ActionListener {

    Cliente cli = Cliente.getInstancia();


    JList l1 = ListaDeLeiloes.getInstanceList1();
    JList l2 = ListaDeLeiloes.getInstanceList2();


    JLabel idUser = null;

    JFrame janela = new JFrame();
    JPanel painel = new JPanel();
    JLabel labelLeilaoGeral = new JLabel("Selecione um dos leiloes abertos  abaixo entrar:");

    JLabel labelLeilaoProprio = new JLabel("Selecione o seu leilao: ");

    DefaultListModel listModel1 = ListaDeLeiloes.getInstanceListModel1();
    DefaultListModel listModel2 = ListaDeLeiloes.getInstanceListModel2();



    JButton btnEntrarLeilao = new JButton("Entrar no Leilao");
    JButton btnEntrarLeilaoProprio = new JButton("Entrar");
    JButton btnEncerrarLeilao = new JButton("Encerrar Leilao selecionado");

    JButton btnCriarNovoLeilao = new JButton("Criar Novo Leilao");


    JanelaCadastraLeilao janelaCadastraLeilao = null;








    public JanelaMenu() {


        painel.removeAll();

        l1 = new JList(ListaDeLeiloes.getInstanceListModel1());
        l2 = new JList(ListaDeLeiloes.getInstanceListModel2());

    idUser = new JLabel("Bem vindo:  -  "+ cli.getNome());


        janela.setTitle("Sistema de Leiloes [" + idUser.getText() + "]");
        janela.setSize(400, 400);
        janela.setLocation(400, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        painel.setLayout(new GridLayout(8, 1, 5, 1));


        labelLeilaoGeral.setHorizontalAlignment(0);
        painel.add(labelLeilaoGeral); //label
        painel.add(l1); //list
        painel.add(btnEntrarLeilao); //btnEntrr
        btnEntrarLeilao.setEnabled(true);
        btnCriarNovoLeilao.setEnabled(true);
        btnEntrarLeilao.addActionListener(this);
        btnEntrarLeilaoProprio.addActionListener(this);



        labelLeilaoGeral.setHorizontalAlignment(0);
        painel.add(labelLeilaoProprio); //label
        painel.add(l2); //lista dos abertos qualquer
        painel.add(btnEntrarLeilaoProprio);
        painel.add(btnEncerrarLeilao);
        painel.add(btnCriarNovoLeilao);

        btnEntrarLeilaoProprio.setEnabled(true);
        btnEncerrarLeilao.setEnabled(true);
        btnCriarNovoLeilao.setEnabled(true);

        btnEntrarLeilaoProprio.addActionListener(this);
        btnEncerrarLeilao.addActionListener(this);
        btnCriarNovoLeilao.addActionListener(this);

        janela.add(painel);

        System.out.println("repaint");
        System.out.println(painel.getComponentCount());

        //painel.revalidate();
        //painel.updateUI();

        //painel.setEnabled(true);
       // painel.isPaintingForPrint();


        //janela.setResizable(true);
//        painel.validate();
        painel.repaint();
       // janela.setContentPane(painel);

        janela.repaint();

        janela.setVisible(true);
    }





    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnCriarNovoLeilao) {

        janela.setVisible(false);
        janelaCadastraLeilao = new JanelaCadastraLeilao();

        }

        if (e.getSource() == btnEntrarLeilaoProprio) {



        }

        if (e.getSource() == btnEncerrarLeilao) {


        if(l2.getSelectedIndex() >= 0) {
            listModel2.remove(l2.getSelectedIndex());

        }



        }



    }

    public void run() {
        // Your database code here
    }
}


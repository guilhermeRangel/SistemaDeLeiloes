import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JanelaMenu implements ActionListener {

    Cliente currentCli = null;
    JLabel idUser = null;

    JFrame janela = new JFrame();
    JPanel painel = new JPanel();
    JLabel labelLeilaoGeral = new JLabel("Selecione o leilao desejado para entrar:");

    JLabel labelLeilaoProprio = new JLabel("Selecione o seu leilao: ");

    DefaultListModel listModel1 = new DefaultListModel();
    DefaultListModel listModel2 = new DefaultListModel();

    JList lista1 = new JList(listModel1);
    JList lista2= new JList(listModel2);

    JButton btnEntrarLeilao = new JButton("Entrar no Leilao");
    JButton btnEntrarLeilaoProprio = new JButton("Entrar");
    JButton btnEncerrarLeilao = new JButton("Encerrar Leilao selecionado");

    JButton btnCriarNovoLeilao = new JButton("Criar Novo Leilao");


    JanelaCadastraLeilao jc = null;












    public JanelaMenu(Cliente cliente) {
    currentCli = cliente;
    idUser = new JLabel("Bem vindo:  -  "+ currentCli.getNome());

    listModel1.addElement("leilao 1:");
    listModel2.addElement("meu leiloes Aberto");

        janela.setTitle("Sistema de Leiloes");
        janela.setSize(400, 400);
        janela.setLocation(400, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        painel.setLayout(new GridLayout(8, 1, 5, 1));

//        idUser.setHorizontalAlignment(0);
//        painel.add(idUser); //list

        labelLeilaoGeral.setHorizontalAlignment(0);
        painel.add(labelLeilaoGeral); //label
        painel.add(lista1); //list
        painel.add(btnEntrarLeilao); //btnEntrr
        btnEntrarLeilao.setEnabled(true);
        btnCriarNovoLeilao.setEnabled(true);
        btnEntrarLeilao.addActionListener(this);
        btnEntrarLeilaoProprio.addActionListener(this);



        labelLeilaoGeral.setHorizontalAlignment(0);
        painel.add(labelLeilaoProprio); //label
        painel.add(lista2); //lista dos abertos qualquer
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


        janela.setVisible(true);
    }







    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnCriarNovoLeilao) {

        jc = new JanelaCadastraLeilao(currentCli);

        }


    }
}


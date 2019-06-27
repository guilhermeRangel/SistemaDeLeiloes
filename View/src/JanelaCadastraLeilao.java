import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JanelaCadastraLeilao extends Thread implements ActionListener{

    //singleton

    DefaultListModel listModel2 = ListaDeLeiloes.getInstanceListModel2();
    ArrayList<Leilao> listaDeLeiloes = ListaDeLeiloes.getInstanceListLeiloes();
    //singleton

        JList l2 = ListaDeLeiloes.getInstanceList2();

        JanelaMenu backJanelaMenu = null;



        Produto produto = null;

        Cliente cli = Cliente.getInstancia();



        JFrame janela = new JFrame();
        JPanel painel = new JPanel();
        JLabel labelLeilaoGeral = new JLabel("Digite os dados do produto a ser leiloado");

        JButton btnCadastrar = new JButton("Cadastrar Produto");
        JButton btnVoltar = new JButton("Voltar para a tela anterior");


        //campos de dados
        JTextField nome = new JTextField(100);
        JTextField descricao = new JTextField(100);
        JTextField valorInicial = new JTextField(100);



    public JanelaCadastraLeilao(){




        janela.setTitle("Nova Sala - Cadastrando Produto ...");
        janela.setSize(400, 400);
        janela.setLocation(400, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        painel.setLayout(new GridLayout(8, 2, 5, 1));
        btnCadastrar.setEnabled(true);
        btnVoltar.setEnabled(true);

        btnCadastrar.addActionListener(this);
        btnVoltar.addActionListener(this);

        nome.setText("Nome do produto");
        descricao.setText("Descricao detalhada");
        valorInicial.setText("321");
        painel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 20));


        painel.add(labelLeilaoGeral);

        painel.add(nome);
        painel.add(descricao);
        painel.add(valorInicial);

        painel.add(btnCadastrar);
        painel.add(btnVoltar);

        janela.add(painel);//mostramos a janela
        janela.setVisible(true);

        }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnCadastrar) {
            janela.setVisible(false);
            JOptionPane.showMessageDialog(null, "Leilao Criado com sucesso!");



            Produto produto = new Produto(nome.getText(), descricao.getText(), Double.parseDouble(valorInicial.getText()));
            Leilao leilao = new Leilao(produto, cli, true);

            listModel2.addElement(produto.getNomeProduto() +" R$: " +produto.getValorInicial());


            ListaDeLeiloes.setInstanciaList2(l2);

            listaDeLeiloes.add(leilao);


            Persistencia persistencia = new Persistencia(leilao);



            janela.setVisible(false);
            backJanelaMenu = new JanelaMenu();


        }

        if (e.getSource() == btnVoltar) {
            janela.setVisible(false);
            backJanelaMenu = new JanelaMenu();

        }

     }

    }

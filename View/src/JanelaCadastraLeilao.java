import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaCadastraLeilao implements ActionListener{



        Cliente currentCli = null;
        JLabel idUser = null;

        JFrame janela = new JFrame();
        JPanel painel = new JPanel();
        JLabel labelLeilaoGeral = new JLabel("Selecione o leilao desejado para entrar:");

        JLabel labelLeilaoProprio = new JLabel("Selecione o seu leilao: ");

        DefaultListModel listModel1 = new DefaultListModel();
        DefaultListModel listModel2 = new DefaultListModel();

        JList lista1 = new JList(listModel1);
        JList lista2 = new JList(listModel2);

        JButton btnEntrarLeilao = new JButton("Entrar no Leilao");
        JButton btnEntrarLeilaoProprio = new JButton("Entrar");
        JButton btnEncerrarLeilao = new JButton("Encerrar Leilao selecionado");

        JButton btnCriarNovoLeilao = new JButton("Criar Novo Leilao");


        JanelaCadastraLeilao jc = null;


        public JanelaCadastraLeilao(Cliente cliente){
        currentCli = cliente;

        }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnCriarNovoLeilao) {



        }


    }

    }

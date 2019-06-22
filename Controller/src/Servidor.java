

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

        public class Servidor extends Thread {

        private static ArrayList<BufferedWriter>clientes;
        private static ServerSocket server;
        private String nome;
        private Socket con;
        private InputStream in;
        private InputStreamReader inr;
        private BufferedReader bfr;

        /**
         * Método construtor
         * @param con do tipo Socket
         */
        public Servidor(Socket con){
            this.con = con;
            try {
                in  = con.getInputStream();
                inr = new InputStreamReader(in);
                bfr = new BufferedReader(inr);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public Servidor() {
            init();
        }



        /**
         * Método run
         */
        public void run(){

            try{

                String msg;
                OutputStream ou =  this.con.getOutputStream();
                Writer ouw = new OutputStreamWriter(ou);
                BufferedWriter bfw = new BufferedWriter(ouw);
                clientes.add(bfw);
                nome = msg = bfr.readLine();

                while(!"Sair".equalsIgnoreCase(msg) && msg != null)
                {
                    msg = bfr.readLine();
                    sendToAll(bfw, msg);
                    System.out.println(msg);
                }

            }catch (Exception e) {
                e.printStackTrace();

            }
        }

        /*
         * Método usado para enviar mensagem para todos os clients
         * @param bwSaida do tipo BufferedWriter
         * @param msg do tipo String
         * @throws IOException
         */
        public void sendToAll(BufferedWriter bwSaida, String msg) throws  IOException
        {
            BufferedWriter bwS;

            for(BufferedWriter bw : clientes){
                bwS = (BufferedWriter)bw;
                if(!(bwSaida == bwS)){
                    bw.write(nome + " -> " + msg+"\r\n");
                    bw.flush();
                }
            }
        }

        /*
         * Método main
         * @param args
         */
        public static void main(String []args) {

           init();

        } // Fim do método main


        public static void init(){
            try{
                //Cria os objetos necessário para instânciar o servidor

                server = new ServerSocket(Integer.parseInt("12345"));
                clientes = new ArrayList<BufferedWriter>();



                while(true){

                    System.out.println("Aguardando conexão...");

                    Socket con = server.accept();

                    System.out.println("Cliente conectado...");

                    Thread t = new Servidor(con);
                    t.start();


                }

            }catch (Exception e) {

                e.printStackTrace();
            }
        }

    } //Fim da classe


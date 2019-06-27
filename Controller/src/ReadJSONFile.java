import org.json.simple.parser.JSONParser;
import org.json.*;
import java.io.FileReader;
import java.util.ArrayList;


public class ReadJSONFile {
    ArrayList<Proposta> propostasParseados = new ArrayList<>();
    ArrayList<Leilao> listaDeLeiloes = ListaDeLeiloes.getInstanceListLeiloes();
    ArrayList<Leilao> leiloesParseados = new ArrayList<>();



    public void leilaoArrayList()  {

        Proposta propostaAux;





        Leilao leilaoAux;
        Produto produtoAux;
        Cliente clienteAux;
        Controller controller = null;

        JSONParser parser = new JSONParser();

       try {
           Object jsonString = parser.parse(new FileReader("persistencia.json"));
           String jsonParsedString = jsonString.toString();


           org.json.JSONArray jsonArray = new JSONArray(jsonParsedString);

           for(int i=0; i<jsonArray.length(); i++){
               org.json.JSONObject jsonObject = jsonArray.getJSONObject(i);

               String emailCliente = jsonObject.getString("emailCliente");
               String cpfCliente = jsonObject.getString("cpfCliente");
               String nomeCliente = jsonObject.getString("nomeCliente");

               String nome_produto = jsonObject.getString("nome_produto");
               String descicao_produto = jsonObject.getString("descicao_produto");
               Double valor_produto = jsonObject.getDouble("valor_produto");
               Boolean status = jsonObject.getBoolean("status") ;


               JSONArray propostas = jsonObject.getJSONArray("propostas");
               String propostaString = propostas.toString();
               org.json.JSONArray propostaArray = new JSONArray(propostaString);

               for(int j=0; j<propostaArray.length(); j++){
                   org.json.JSONObject teste = jsonArray.getJSONObject(j);

                   propostaAux = new Proposta(teste.getString("clinteProposta"),
                           controller.converteStringParaDouble(teste.getString("valorProposta")));

                   propostasParseados.add(propostaAux);
               }

                clienteAux = new Cliente(nomeCliente,cpfCliente,emailCliente);
                produtoAux = new Produto(nome_produto,descicao_produto, valor_produto);

                leilaoAux = new Leilao(produtoAux, clienteAux, status, propostasParseados);
                leiloesParseados.add(leilaoAux);
               listaDeLeiloes.add(leilaoAux);

               ListaDeLeiloes.setLeiloesList(listaDeLeiloes);


                leilaoAux = null;
                produtoAux = null;
                clienteAux = null;
           }


       } catch (Exception e) {
           e.printStackTrace();
       }








    }


}







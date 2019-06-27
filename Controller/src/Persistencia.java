

import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.JSONArray;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Persistencia {
    public Persistencia(Leilao leilao) {
        Persist(leilao);
    }

    public static void Persist(Leilao leilao) throws JSONException {

        ArrayList<Leilao> listaDeLeiloes = ListaDeLeiloes.getInstanceListLeiloes();
        //instancia um array de leiloes
        org.json.simple.JSONArray leiloes = new JSONArray();

        //instancia um novo JSONObject
        JSONObject obj = new JSONObject();
        JSONObject prop = null;


        for(int i=0; i<listaDeLeiloes.size(); i++){
            //preenche o objeto com os campos: titulo, ano e genero
            Produto produto = listaDeLeiloes.get(i).getProduto();

            JSONObject produtoFinal = new JSONObject();

            obj.put("nome_produto", produto.getNomeProduto());
            obj.put("descicao_produto", produto.getDescricao());
            obj.put("valor_produto", produto.getValorInicial());

            JSONArray propostas = new JSONArray();

            for(int j=0; j<listaDeLeiloes.get(i).getListaDePropostas().size(); j++){
                prop = new JSONObject();
                prop.put("clinteProposta", listaDeLeiloes.get(i).getListaDePropostas().get(j).getCli() );
                prop.put("valorProposta", listaDeLeiloes.get(i).getListaDePropostas().get(j).getValorLance());

                propostas.add(prop);
            }

            obj.put("propostas", propostas);

            Cliente teste = listaDeLeiloes.get(i).getCurrentCliente();


            obj.put("nomeCliente", teste.getNome());
            obj.put("cpfCliente", teste.getCpf());
            obj.put("emailCliente", teste.getEmail());
            obj.put("status", listaDeLeiloes.get(i).isStatus());

            leiloes.add(obj);
        }


        try(FileWriter file = new FileWriter("persistencia.json")){
            file.write(leiloes.toString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
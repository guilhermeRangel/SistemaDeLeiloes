

import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class TesteOrgJson1 {
    public TesteOrgJson1(Leilao leilao) {
        Persist(leilao);
    }

    public static void Persist(Leilao leilao) throws JSONException {

        /* -------------------------------------------------------
         * TESTE 1
         * cria um JSONObject para armazenar dados de um filme
         * -------------------------------------------------------*/

        //instancia um novo JSONObject
        JSONObject my_obj = new JSONObject();

        //preenche o objeto com os campos: titulo, ano e genero
        Produto produto = leilao.getProduto();
        JSONObject produtoFinal = new JSONObject();
        my_obj.put("nome_produto", produto.getNomeProduto());
        my_obj.put("descicao_produto", produto.getDescricao());
        my_obj.put("valor_produto", produto.getValorInicial());
        my_obj.put("propostas", leilao.getListaDePropostas());

        Cliente teste = leilao.getCurrentCliente();
        JSONObject cliente = new JSONObject();
        my_obj.put("nomeCliente", teste.getNome());
        my_obj.put("cpfCliente", teste.getCpf());
        my_obj.put("emailCliente", teste.getEmail());
        my_obj.put("status", leilao.isStatus());

        //serializa para uma string e imprime

        String json_string = my_obj.toString();


        try(FileWriter file = new FileWriter("persistencia.json")){
            file.write(my_obj.toString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
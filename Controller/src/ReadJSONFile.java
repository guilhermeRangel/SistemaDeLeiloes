import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileReader;
import java.io.IOException;



public class ReadJSONFile {

    public static void main(String[] args) throws IOException, ParseException {
        JSONParser parser = new JSONParser();

        Object obj = parser.parse(new FileReader("persistencia.json"));
        JSONObject jsonObject = (JSONObject) obj;

        String emailCliente = (String) jsonObject.get("emailCliente");
        String cpfCliente = (String) jsonObject.get("cpfCliente");
        String nome_produto = (String) jsonObject.get("nome_produto");
        String valor_produto = (String) jsonObject.get("valor_produto");
        String descicao_produto = (String) jsonObject.get("cpfCliente");
        String nomeCliente = (String) jsonObject.get("nomeCliente");
        String status = (String) jsonObject.get("status");
        String dcpfCliente = (String) jsonObject.get("cpfCliente");



    }



}







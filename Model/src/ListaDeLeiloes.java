import javax.swing.*;

public class ListaDeLeiloes {

    private static JList lista1;
    private static JList lista2;
    private static DefaultListModel listModel1;
    private static DefaultListModel listModel2;

    public static JList getInstanceList1() {
        if (lista1 == null) {
            lista1 = new JList();

        }
        return lista1;
    }



    public static JList getInstanceList2() {
        if (lista2 == null) {
            lista2 = new JList();

        }
        return lista2;
    }


    public static DefaultListModel getInstanceListModel1() {
        if (listModel1 == null) {
            listModel1 = new DefaultListModel();

        }
        return listModel1;
    }

    public static DefaultListModel getInstanceListModel2() {
        if (listModel2 == null) {
            listModel2 = new DefaultListModel();

        }
        return listModel2;
    }

    public static JList getInstanciaLista1() {
        return lista1;
    }
    public static JList getInstanciaLista2() {
        return lista2;
    }


    public static DefaultListModel getInstanciaListaModel1() {
        return listModel1;
    }
    public static DefaultListModel getInstanciaListaModel2() {
        return listModel2;
    }




    public static void setInstanciaList1(JList instancia1) {
        ListaDeLeiloes.lista1 = instancia1;
    }

    public static void setInstanciaList2(JList instancia2) {
        ListaDeLeiloes.lista2 = instancia2;
    }



    public static void setInstanciaListaModel1(DefaultListModel instancia1) {
        ListaDeLeiloes.listModel1 = instancia1;
    }
    public static void setInstanciaListaModel2(DefaultListModel instancia2) {
        ListaDeLeiloes.listModel2 = instancia2;
    }


    public ListaDeLeiloes() {

    }
}

package ExemploArray;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exemplo03 {
    public static void main(String[] args) {
        // arraylista é uma classe java mais flexivel para manipular uma lista
        ArrayList<String> lista = new ArrayList<String>();
        int selecionado = 0;
        Object[] opcoes = { "Incluir", "Listar", "Apagar", "Finalizar" };
        do {
            selecionado = JOptionPane.showOptionDialog(
                    null,
                    "O que você deseja?",
                    "Exemplo",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null, opcoes, opcoes[0]);
            if (selecionado == 0) { // opcoes[selecionado].equals("Incluir")
                String item = JOptionPane.showInputDialog("Digite");
                lista.add(item); // guarda na lista o item digitado
            }
            if (selecionado == 1) {
                String msg = "";
                for (String item : lista) {
                    msg += item + "\n";
                }
                JOptionPane.showMessageDialog(null, msg);
            }
            if (selecionado == 2) {
                Object[] opcaoApagar = new Object[lista.size()];
                for (int i = 0; i < opcaoApagar.length; i++) {
                    opcaoApagar[i] = lista.get(i);
                }
                Object itemSelecionado = JOptionPane.showInputDialog(
                        null,
                        "Selecione o item para apagar",
                        "Apagar",
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        opcaoApagar,
                        opcaoApagar[0]);
                // System.out.println(itemSelecionado.toString());
                for (int i = 0; i < lista.size(); i++) {
                    if (itemSelecionado.toString().equals(lista.get(i))) {
                        lista.remove(i);
                    }
                }
            }
        } while (selecionado != 3);
    }
}

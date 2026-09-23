package school.sptech.ex6;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {

    String nomeLista;
    Integer capacidadeMaxima;
    List<String> itens;

    void adicionarItem(String nome) {
        if (capacidadeMaxima == itens.size()) {

        } else {
            for (int i = 0; i < itens.size(); i++) {
                if (itens.get(i).equals(nome)) {
                    return;
                }
            }
            itens.add(nome);
        }
    }

    Boolean removerItem(String nome) {
        return itens.remove(nome);
    }

    String obterItem(Integer num) {
        try {
            return itens.get(num);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    Boolean substituirItem(Integer posi, String nome) {
        if (posi < 0 || posi >= itens.size()) {
            return false;
        }
        if (itens.contains(nome)) {
            return false;
        }
        itens.set(posi, nome);
        return true;
    }

    Integer calcularVagasRestantes() {
        return capacidadeMaxima - itens.size();
    }

    String removerItemNaPosicao(Integer posi) {
        if (posi < 0 || posi >= itens.size()) return null;
        return itens.remove((int) posi);
    }

    Integer removerItensDuplicados() {
        int tamanhoOriginal = itens.size();
        List<String> semDuplicados = new ArrayList<>();

        for (String item : itens) {
            if (!semDuplicados.contains(item)) {
                semDuplicados.add(item);
            }
        }
        itens.clear();
        itens.addAll(semDuplicados);
        return tamanhoOriginal - itens.size();
    }


}

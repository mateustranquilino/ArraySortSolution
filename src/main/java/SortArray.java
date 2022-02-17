import java.util.Arrays;

/*
Introdução

O intuito deste desafio é criar um projeto que receba uma lista de palavras e retorne-as ordenadas por ordem alfabética.

Exemplo

Entrada: [“zebra”, “cálice”, "borboleta" ]
Saída:  ["borboleta", “cálice”, “zebra”]

Regras

Criar um novo projeto usando Java e Maven ou Gradle
Apenas usar as funções: charAt, substring, compareTo
Nenhuma lib será permitida
O intuito é você criar todo o algoritmo usando o mínimo de funções pré prontas possível.
       - Criar quantos métodos achar necessários
       - Criar quantos for, while ou if que achar necessários
       - Usar técnicas de código limpo
       - Criar testes unitários (usando JUNIT Júpiter)
          - Cobrir todos os casos de testes que julgar necessário
       - Live code
       - Tempo máximo: 1 hora
       - Não serão permitidas buscas no google
         - A única exceção será para buscar a dependência do junit júpiter
      - Comitar no github e nos enviar por email

 */
public class SortArray {

    public SortArray(){

    }

    public void sort(String[] lista) {

        for (int i = 0; i < lista.length; i++) {

            for (int j = 0; j < lista.length; j++) {

                if (lista[i].compareTo(lista[j]) < 0) {
                    String aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
            }
        }
    }
}

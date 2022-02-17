
import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SortArrayTest {

    SortArray mySort;

    @Before
    public void inicia(){
        mySort = new SortArray();
    }

    @Test
    public void TestaOrdenacao(){
        String[] lista = {"zebra", "cálice", "borboleta", "macaco", "leao", "zebra", "borboleta", "abacaxi", "abacate"};
        String[] listaCopia = Arrays.copyOf(lista, lista.length);
        Arrays.sort(listaCopia);
        mySort.sort(lista);
        assertEquals(lista, listaCopia);
    }

    @Test
    public void TestaListaJaOrdenada(){
        String[] lista = {"a", "b", "c"};
        String[] listaCopia = Arrays.copyOf(lista, lista.length);
        mySort.sort(lista);
        assertEquals(lista, listaCopia);
    }

    @Test
    public void TestaListaVazia(){
        String[] lista = {};
        mySort.sort(lista);
        assertEquals(lista, new String[] {});
    }

    @Test
    public void TestaListaComUmElemento(){
        String[] lista = {"a"};
        String[] listaCopia = Arrays.copyOf(lista, lista.length);
        mySort.sort(lista);
        assertEquals(lista, listaCopia);
    }
}

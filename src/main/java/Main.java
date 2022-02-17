import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortArray mySort = new SortArray();
        String[] lista = {"abel", "abelha", "AAntonio","azevedo", "zebra", "cálice", "borboleta" };
        mySort.sort(lista);
        System.out.println(Arrays.toString(lista));
    }
}

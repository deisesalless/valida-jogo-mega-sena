import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> aposta = new ArrayList<>();
        aposta.addAll(List.of(33, 37, 40, 44, 55, 59));
        aposta.addAll(List.of(13, 19, 28, 38, 55, 59));
        aposta.addAll(List.of(04, 50, 52, 55, 57, 60));
        aposta.addAll(List.of(03, 21, 26, 36, 54, 59));
        aposta.addAll(List.of(04, 9, 12, 13, 23, 46));
        aposta.addAll(List.of(01, 19, 29, 39, 57, 59));
        aposta.addAll(List.of(05, 22, 32, 36, 55, 56));
        aposta.addAll(List.of(14, 31, 41, 49, 56, 59));
        aposta.addAll(List.of(27, 33, 34, 36, 42, 57));
        aposta.addAll(List.of(15, 21, 30, 46, 54, 59));
        aposta.addAll(List.of(03, 05, 11, 33, 49, 51));
        aposta.addAll(List.of(11, 13, 30, 35, 51, 59));
        aposta.addAll(List.of(15, 28, 31, 36, 38, 58));
        aposta.addAll(List.of(04, 06, 14, 30, 40, 44));
        aposta.addAll(List.of(18, 28, 30, 35, 51, 57));
        aposta.addAll(List.of(04, 05, 9, 12, 29, 30));
        aposta.addAll(List.of(04, 18, 22, 25, 28, 39));
        aposta.addAll(List.of(12, 20, 37, 50, 51, 60));
        aposta.addAll(List.of(22, 27, 30, 38, 54, 55));
        aposta.addAll(List.of(01, 10, 13, 36, 55, 58));
        aposta.addAll(List.of(01, 10, 13, 30, 40, 45));
        aposta.addAll(List.of(06, 11, 35, 36, 49, 53));
        aposta.addAll(List.of(04, 9, 23, 30, 35, 44));
        aposta.addAll(List.of(05, 06, 17, 21, 27, 54));
        aposta.addAll(List.of(02, 23, 36, 43, 49, 51));

        List<Integer> numerosVencedores = new ArrayList<>(List.of(13, 16, 33, 43, 46, 55));

        for (int i = 0; i < aposta.size(); i += 6) {
            List<Integer> apostaGrupo = aposta.subList(i, i + 6);
            int acertos = 0;

            for (Integer numero : apostaGrupo) {
                if (numerosVencedores.contains(numero)) {
                    acertos++;
                }
            }

            System.out.println("Acertos: " + acertos + " - Jogo: " + apostaGrupo);
        }

    }
}

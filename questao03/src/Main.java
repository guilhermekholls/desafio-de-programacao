import java.util.*;
import java.util.stream.IntStream;

public class Exec_3 {
	public static void main(String[] args) {
		final var palavrasList = List.of("ovo", "ifailuhkqq");
		palavrasList.forEach(palavra -> System.out.println(palavra + ": " + contadorDeAnagramas(palavra)));
	}

	private static Set<Set<Integer>> contadorDeAnagramas(String palavra) {
		final var parOrdenadosDeLetrasRepetidas = parOrdenadosDeLetrasRepetidas(palavra);
		parOrdenadosDeLetrasRepetidas.forEach((Set<Integer> parOrdenado) -> {
			
		});
		return parOrdenadosDeLetrasRepetidas;
	}

	private static Set<Set<Integer>> parOrdenadosDeLetrasRepetidas(String palavra) {
		if (Objects.isNull(palavra) || palavra.isBlank()) {
			return Collections.emptySet();
		}

		final var parOrdenadoList = new HashSet<Set<Integer>>();
		IntStream.range(0, palavra.length())
				.forEach(i -> IntStream.range(0, palavra.length())
						.filter(j -> i != j && palavra.charAt(i) == palavra.charAt(j))
						.mapToObj(j -> Set.of(i, j))
						.forEach(parOrdenadoList::add));

		return parOrdenadoList;
	}
}

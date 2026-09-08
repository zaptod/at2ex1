import java.util.Scanner;

/*
 * Exercício 1 - Cadastro simples
 *
 * Casos de teste:
 * Nome: "Ana Souza"  | Idade: 22 | Cidade: "Belo Horizonte" -> exibe os três dados
 * Nome: "Pedro Lima" | Idade: 0  | Cidade: "Contagem"       -> exibe os três dados, inclusive idade 0
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // 1. Entradas
        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine(); // consome a quebra de linha deixada pelo nextInt

        System.out.print("Digite a cidade: ");
        String cidade = entrada.nextLine();

        // 2. Processamento: não há cálculos neste exercício

        // 3. Decisão: não há condição neste exercício

        // 4. Saída
        System.out.println();
        System.out.println("=== Dados do cadastro ===");
        System.out.println("Nome...: " + nome);
        System.out.println("Idade..: " + idade + " ano(s)");
        System.out.println("Cidade.: " + cidade);

        entrada.close();
    }
}

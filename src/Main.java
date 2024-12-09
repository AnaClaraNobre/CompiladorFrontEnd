import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1 - Executar Scanner");
            System.out.println("2 - Executar Parser");
            System.out.println("3 - Executar Integração");
            System.out.println("4 - Exibir Entrada");
            System.out.println("5 - Sair");

            System.out.print("Digite sua escolha: ");
            String escolha = scanner.nextLine();

            try {
                switch (escolha) {
                    case "1":
                        System.out.println("Executando Scanner...");
                        exibirEntrada(); // Exibe o conteúdo da entrada antes de executar
                        ScannerF.execute();
                        break;
                    case "2":
                        System.out.println("Executando Parser...");
                        exibirEntrada(); // Exibe o conteúdo da entrada antes de executar
                        Parse.execute();
                        break;
                    case "3":
                        System.out.println("Executando Integração...");
                        exibirEntrada(); // Exibe o conteúdo da entrada antes de executar
                        integracao.execute();
                        break;
                    case "4":
                        System.out.println("Exibindo conteúdo da entrada:");
                        exibirEntrada(); // Apenas exibe o conteúdo da entrada
                        break;
                    case "5":
                        System.out.println("Saindo do programa. Até logo!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opção inválida! Por favor, escolha entre 1 e 5.");
                }
            } catch (Exception e) {
                System.out.println("Erro ao executar a opção selecionada:");
                e.printStackTrace();
            }
        }
    }

    private static void exibirEntrada() {
        try {
            File inputFile = new File("entrada.txt");
            if (!inputFile.exists()) {
                System.out.println("Arquivo 'entrada.txt' não encontrado.");
                return;
            }

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            System.out.println("================ Entrada =================");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("=========================================");
            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de entrada:");
            e.printStackTrace();
        }
    }
}

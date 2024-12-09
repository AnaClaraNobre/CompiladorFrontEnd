public class NarrativeFormatter {

    public static String narrate(String label, String... children) {
        StringBuilder narrative = new StringBuilder();

        switch (label) {
            case "CODE":
                narrative.append("Analisando o código:\n");
                for (String child : children) {
                    narrative.append("- ").append(child).append("\n");
                }
                break;

            case "VAR_DECLAR":
                narrative.append("Variável declarada: ")
                         .append(children[0])  // Tipo da variável
                         .append(" ")
                         .append(children[1]); // Nome da variável
                if (children.length > 2) {
                    narrative.append(" = ").append(children[2]); // Valor inicial
                }
                narrative.append(".");
                break;

            case "SE":
                narrative.append("Condição `if` encontrada: ").append(children[0]).append("\n");
                narrative.append("Bloco interno:\n").append(children[1]);
                break;

            case "SENAO":
                narrative.append("Bloco `else` encontrado:\n").append(children[0]);
                break;

            case "ENQUANTO":
                narrative.append("Laço `while` encontrado: ").append(children[0]).append("\n");
                narrative.append("Bloco interno:\n").append(children[1]);
                break;

            case "PARA":
                narrative.append("Laço `for` encontrado: ").append(children[0]).append("\n");
                narrative.append("Bloco interno:\n").append(children[1]);
                break;

            case "ATRIBUICAO":
                narrative.append("Atribuição realizada: ")
                         .append(children[0])  // Variável
                         .append(" = ")
                         .append(children[1])  // Valor
                         .append(".");
                break;

            case "EXPRESSION":
                narrative.append("Expressão analisada: ").append(children[0]).append(".");
                break;

            default:
                narrative.append(label).append(": ").append(String.join(", ", children));
                break;
        }

        return narrative.toString();
    }
}

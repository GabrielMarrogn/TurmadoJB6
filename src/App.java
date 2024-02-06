import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String jogo;

        while ((jogo = br.readLine()) != null) {
            String[] dados = jogo.split(" ");
            String papel = "papel";
            String pedra = "pedra";
            String tesoura = "tesoura";

            // Papel ganha de pedra
            if (dados[0].equals(papel) && dados[1].equals(pedra) && dados[2].equals(pedra)) {
                System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");
            } else if (dados[0].equals(pedra) && dados[1].equals(papel) && dados[2].equals(pedra)) {
                System.out.println("Iron Maiden's gonna get you, no matter how far!");
            } else if (dados[0].equals(pedra) && dados[1].equals(pedra) && dados[2].equals(papel)) {
                System.out.println("Urano perdeu algo muito precioso...");
            }

            // Tesoura ganha de papel
            else if (dados[0].equals(tesoura) && dados[1].equals(papel) && dados[2].equals(papel)) {
                System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");
            } else if (dados[0].equals(papel) && dados[1].equals(tesoura) && dados[2].equals(papel)) {
                System.out.println("Iron Maiden's gonna get you, no matter how far!");
            } else if (dados[0].equals(papel) && dados[1].equals(papel) && dados[2].equals(tesoura)) {
                System.out.println("Urano perdeu algo muito precioso...");
            }

            // Pedra ganha de tesoura
            else if (dados[0].equals(pedra) && dados[1].equals(tesoura) && dados[2].equals(tesoura)) {
                System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");
            } else if (dados[0].equals(tesoura) && dados[1].equals(pedra) && dados[2].equals(tesoura)) {
                System.out.println("Iron Maiden's gonna get you, no matter how far!");
            } else if (dados[0].equals(tesoura) && dados[1].equals(tesoura) && dados[2].equals(pedra)) {
                System.out.println("Urano perdeu algo muito precioso...");
            }

            else {
                System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
            }

        }

    }
}

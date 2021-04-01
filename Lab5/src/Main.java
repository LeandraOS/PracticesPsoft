import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String transporte = "";
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("\n> Pressione 0 caso deseje finalizar o aplicativo!");
            System.out.println("> Escolha o meio de transporte desejado entre (Metro, Onibus, Carro ou Pedestre): ");
            transporte = input.nextLine().toUpperCase();
            if (transporte.equals("0")) {
                break;
            }
            Usuario usuario = new Usuario("Leandra");
            usuario.modificaTransporte(transporte);

        }
    }
}


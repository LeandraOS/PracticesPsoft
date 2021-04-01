import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Pressione 0 para finalizar o aplicativo!");
        String transporte = "";
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Escolha o meio de transporte desejado: ");
            transporte = input.nextLine().toUpperCase();
            if (transporte.equals("0")) {
                break;
            }
            Usuario usuario = new Usuario();
            usuario.modificaTransporte(transporte);

        }
    }
}


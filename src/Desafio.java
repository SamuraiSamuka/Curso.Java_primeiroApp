import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        imprimeDados(nome, tipoConta, saldo);

        int opcao = 0;
        while (opcao != 4) {
            opcao = mostrarMenu();
            switch (opcao) {
                case 1:
                    imprimirSaldo(saldo);
                    break;
                case 2:
                    receberValor(saldo);
                    break;
                case 3:
                    transferirValor(saldo);
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar o meu software! :)");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void imprimeDados(String nome, String tipoConta, double saldo) {
        System.out.println("""
                *********************************************
                Dados iniciais do cliente:
                
                Nome:           %s
                Tipo conta:     %s
                Saldo inicial:  %f
                *********************************************
                """.formatted(nome, tipoConta, saldo)
        );
    }
    private static int mostrarMenu() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("""
                
                Operações
                
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Digite a opção desejada: """);
        int opcao = leitura.nextInt();

        return opcao;
    }
    private static void imprimirSaldo(double saldo) {
        System.out.println("O saldo atual é R$ " + saldo);
    }
    private static double receberValor(double saldo) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor a ser recebido: ");
        double valor = leitura.nextDouble();

        double saldoAtualizado = saldo + valor;
        System.out.println(String.format("O valor de %f foi recebido. O seu saldo é de %f", valor, saldoAtualizado));
        return saldoAtualizado;
    }
    private static double transferirValor(double saldo) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor a ser transferido: ");
        double valor = leitura.nextDouble();

        double saldoAtualizado = saldo - valor;
        System.out.println(String.format("O valor de %f foi transferido. O seu saldo é de %f", valor, saldoAtualizado));
        return saldoAtualizado;
    }
}

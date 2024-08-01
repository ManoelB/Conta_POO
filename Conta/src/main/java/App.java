public class App {
    public static void main(String[] args) {
        var banco = new Banco("Manoel", "Ana", "Beatriz");

        banco.creditar("Manoel", 1000);
        banco.debitar("Ana", 200);
        banco.creditar("Beatriz", 500);

        System.out.println("Saldo de Manoel: " + banco.getSaldo("Manoel"));
        System.out.println("Saldo de Ana: " + banco.getSaldo("Ana"));

        banco.transferir("Manoel", "Ana", 300);

            System.out.println("Saldo de Manoel após transferência: " + banco.getSaldo("Manoel"));
        System.out.println("Saldo de Ana após transferência: " + banco.getSaldo("Ana"));
    }
}

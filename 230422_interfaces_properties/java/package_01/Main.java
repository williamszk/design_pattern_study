package package_01;

public class Main {
    public static void main(String[] args) {

        PremiumUser alice = new PremiumUser(
                "Alice Heritage",
                1000,
                "The Contender",
                12);

        NormalUser bob = new NormalUser(
                "Bob Ferguson",
                55);

        DescribeUser.describe(bob);
        DescribeUser.describe(alice);

    }
}
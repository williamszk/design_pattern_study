package package_01;

public class DescribeUser {
    public static void describe(User user) {
        System.out.println("======== User Report ============");
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println();
    }
}

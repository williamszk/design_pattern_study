package package_01;

public class NormalUser implements User {
    public String name;
    public int age;

    public NormalUser(
            String name,
            int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name + " - normal user";
    }

    public int getAge() {
        return this.age;
    }
}

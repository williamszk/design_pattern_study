package package_01;

public class PremiumUser implements User {
    public String premiumName;
    public int monthlyPayment;
    public String specialAvatarName;
    public int age;

    public PremiumUser(
            String premiumName,
            int monthlyPayment,
            String specialAvatarName,
            int age) {

        this.premiumName = premiumName;
        this.monthlyPayment = monthlyPayment;
        this.specialAvatarName = specialAvatarName;
        this.age = age;
    }

    public String getName() {
        return this.premiumName + " - " + this.specialAvatarName;
    }

    public int getAge() {
        return this.age;
    }
}

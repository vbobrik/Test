class AdminApp{
    public static void main (String args []) {
        User vova = new User(30, "Vova", "Vladimir", "Pop", 'M', 10.22);
        System.out.println(vova.getFullName());
        vova.greetings();
    }
}
class User {

    int age;
    String username;
    String firstName;
    String lasttName;
    boolean isAdult;
    int bla;
    char sex; // M or F
    double moneyAmount;

    User (int age, String username, String firstName, String lasttName, char sex, double moneyAmount) {
        this.age = age;
        this.username = username;
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.isAdult = age >= 18;
        this.sex = sex;
        this.moneyAmount = moneyAmount;
    }

    String getFullName() {
        return this.firstName + " " + this.lasttName;
    }

    void greetings() {
        System.out.println("Hello, " + this.username);
    }


}

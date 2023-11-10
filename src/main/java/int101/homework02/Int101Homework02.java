package int101.homework02;

    import work01.Utilitor;
    import work02.Person;
    import work03.Account;



public class Int101Homework02 {

    public static void main(String[] args) {
       work01Utilitor();
       work02Person();
       work03Account();
    }

    static void work01Utilitor() {

        System.out.println( "----------1.2----------");

        try {
            System.out.println(Utilitor.testString(""));
        } catch (Exception e) {
            System.out.println("Error appeared: " + e.toString());
        }

        try {
            System.out.printf(Utilitor.testString(null));
        } catch (Exception e) {
            System.out.println("Error appeared: " + e.toString());
        }

        System.out.println("testString method: " + Utilitor.testString("Test string"));

        System.out.println( "----------1.3----------");

        try {
            System.out.printf(Utilitor.testPositive(0) + "");
        } catch (Exception e) {
            System.out.println("Error appeared: " + e.toString());
        }

        System.out.println("testPositive method: " + Utilitor.testPositive(100));
        System.out.println( "----------1.4----------");
        try {
            System.out.printf(Utilitor.computeIsbn10(-1) + "");
        } catch (Exception e) {
            System.out.println("Error appeared: " + e);
        }

        System.out.println("computeIsbn10 method: " + Utilitor.computeIsbn10( 1_000_000_000));

    }

    static void work02Person() {
        System.out.println( "----------2.6----------");
        try {
            Person nullPerson = new Person(null, null);
        } catch (Exception e) {
            System.out.println("Error appeared: " + e.toString());
        }
        Person First = new Person("Thanapat", "Khumpiboon");
        Person Maja = new Person("Vimonsiri", "Ponoi");

        System.out.println( "----------2.7----------");
        System.out.println(First.toString());
        System.out.println(Maja.toString());
        System.out.println( "----------2.8----------");
        System.out.println("First's firstName: " + First.getFirstName());
        System.out.println("First's lastName: " + First.getLastName());
        System.out.println("First's ID: " + First.getId());
        System.out.println( "----------2.9----------");
        System.out.println("Change First's firstName to null: ");
        try {
            First.setFirstName(null);
        } catch (Exception e) {
            System.out.println("Error appeared: " + e.toString());
        }
        System.out.println("Change First's firstName to Scar: ");
        First.setFirstName("Scar");
        System.out.println("First's firstName: " + First.getFirstName());

        System.out.println("Change First's lastName to null: ");
        try {
            First.setLastName(null);
        } catch (Exception e) {
            System.out.println("Error appeared: " + e.toString());
        }
        System.out.println("Change First's lastName to Kandill: ");
        First.setLastName("Kandill");
        System.out.println("First's firstName: " + First.getLastName());
        System.out.println( "----------2.10----------");
        System.out.println("First equals First: " + First.equals(First));
        System.out.println("Maja equals Maja: " + Maja.equals(Maja));
        System.out.println("First equals Maja: " + First.equals(First));
        System.out.println("Maja equals First: " + Maja.equals(First));
    }

    static void work03Account() {
        System.out.println( "----------3.6----------");

        try {
            new Account(null);
        } catch (Exception e) {
            System.out.println("Error appeared: " + e.toString());
        }

        Person First = new Person("Thanapat", "Khumpiboon");
        Account FirstAccount = new Account(First);
        System.out.println("First account has been created.");

        System.out.println( "----------3.7----------");
        System.out.println("First account's balance: " + FirstAccount.getBalance() + "$");
        System.out.println("First account's no: " + FirstAccount.getNo());
        System.out.println("First account's owner: " + FirstAccount.getOwner());
        System.out.println( "----------3.8----------");

        try {
            System.out.println(FirstAccount.deposit(-1));
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("First account's balance (deposit 500): " + FirstAccount.deposit(500));
        System.out.println( "----------3.9----------");

        try {
            System.out.println(FirstAccount.withdraw(-1));
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("First account's balance (withdraw 100): " + FirstAccount.withdraw(100));
        System.out.println( "----------3.10----------");
        Person Maja = new Person("Vimonsiri", "Ponoi");
        Account MajaAccount = new Account(Maja);

        try {
            FirstAccount.transfer(100, null);
        } catch (Exception e) {
            System.out.println(e);
        }

        FirstAccount.transfer(100, MajaAccount);

        System.out.println("Maja account's balance: " + FirstAccount.getBalance());
        System.out.println("First account's balance: " + FirstAccount.getBalance());

        System.out.println( "----------3.11----------");
        System.out.println(FirstAccount.toString());
        System.out.println(MajaAccount.toString());
        System.out.println( "----------3.12----------");
        System.out.println("First's account equals First's account: " + FirstAccount.equals(FirstAccount));
        System.out.println("Maja's account equals Maja's account: " + MajaAccount.equals(MajaAccount));
        System.out.println("First's account equals Maja's account: " + FirstAccount.equals(MajaAccount));
        System.out.println("Maja's account equals First's account: " + MajaAccount.equals(FirstAccount));
    }

}

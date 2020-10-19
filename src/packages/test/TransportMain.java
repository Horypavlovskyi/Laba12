package packages.test;

import packages.transport.Passport;
import packages.transport.PassportUtil;

public class TransportMain {
    public static void main(String[] args) {
        Passport passport1 = new Passport("Mazda 6", "Алексей Викторович");
        PassportUtil.changeOwner(passport1);
        System.out.println(passport1);
    }

}

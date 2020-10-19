package packages.transport;

import packages.Test;

public class PassportUtil {
    public PassportUtil() {
        System.out.println("закрытый конструктор");
    }

    public static void changeOwner(Passport ownerName) {
        Passport passport2 = new Passport("Mazda 6", "Михаил Михайлович");
        ownerName.setOwnerName(passport2.getOwnerName());



    }

}

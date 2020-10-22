package packages.transport;

import packages.Test;

class PassportUtil {
    public PassportUtil() {
        System.out.println("закрытый конструктор");
    }

    public static Passport changeOwner(Passport ownerName) {
        Passport passport2 = new Passport("Mazda 6", "Михаил Михайлович");
        ownerName.setOwnerName(passport2.getOwnerName());


        return ownerName;
    }

}

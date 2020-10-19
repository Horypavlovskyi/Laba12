package packages.citizen;

import packages.Test;

public class PassportUtil {
    public PassportUtil() {
        System.out.println("закрытый конструктор");
    }

    public static void marriageRegistrate(Passport man, Passport women) {
        man.setSpouseId(women.getiD());
        women.setSpouseId((man.getiD()));



    }
}

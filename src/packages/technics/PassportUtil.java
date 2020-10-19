package packages.technics;

import java.util.Date;

public class PassportUtil {
    public PassportUtil() {
        System.out.println("закрытый конструктор");
    }


    public static void warrantyReplace(Passport passport) {
    Date date1 = new Date();
        passport.setWarrantyStartDate(date1);
    }
}

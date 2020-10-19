package packages.test;


import packages.citizen.Passport;
import packages.citizen.PassportUtil;
import java.util.*;

public class CitizenMain {
    public static void main(String[] args) {
        Passport passportMan = new Passport("111222", "Олег Владимирович");
        Passport passportWoman = new Passport("222111", "Марина Олеговна");

        PassportUtil.marriageRegistrate(passportMan, passportWoman);
        System.out.println(passportMan);
        System.out.println(passportWoman);
    }
}
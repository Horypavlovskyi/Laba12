package packages.citizen;

public class Passport {
    private String iD;
    private String fullName;
    private String spouseId;

    public Passport(String iD, String fullName) {
        this.iD = iD;
        this.fullName = fullName;

    }

    @Override
    public String toString() {
        return "Passport{" +
                "iD='" + iD + '\'' +
                ", fullName='" + fullName + '\'' +
                ", spouseId='" + spouseId + '\'' +
                '}';
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSpouseId() {
        return spouseId;
    }

    public void setSpouseId(String spouseId) {
        this.spouseId = spouseId;
    }
}


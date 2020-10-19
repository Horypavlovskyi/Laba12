package packages.technics;

import java.util.Date;

public class Passport {
    private String company;
    private String model;
    Date warrantyStartDate;

    public Passport(String company, String model, Date warrantyStartDate) {
        this.company = company;
        this.model = model;
        this.warrantyStartDate = warrantyStartDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getWarrantyStartDate() {
        return warrantyStartDate;
    }

    public void setWarrantyStartDate(Date warrantyStartDate) {
        this.warrantyStartDate = warrantyStartDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", warrantyStartDate=" + warrantyStartDate +
                '}';
    }
}


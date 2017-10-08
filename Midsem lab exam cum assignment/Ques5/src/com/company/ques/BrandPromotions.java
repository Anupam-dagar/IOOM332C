package com.company.ques;

public class BrandPromotions extends Person {
    private String brandName;
    private String officeName;

    public BrandPromotions(String name, String behaviour, String brandName, String officeName, String type)
    {
        super(name, behaviour, type);
        this.brandName = brandName;
        this.officeName = officeName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getOfficeName() {
        return officeName;
    }

    @Override
    public void print()
    {
        System.out.println(super.getName() + " " + this.brandName + " " + this.officeName);
    }
}

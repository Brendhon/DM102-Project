package org.inatel.Sponsor;

public class Sponsor {
    // Attributes
    private String name;
    private String website;
    private String industry;
    private int moneyInvested;

    // Methods
    public Sponsor(String name, String website, String industry) {
        this.name = name;
        this.website = website;
        this.industry = industry;
        this.moneyInvested = 0;
    }

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }

    public String getIndustry() {
        return industry;
    }

    public String getInvestmentInfo() {
        String info = "";
        info += this.getName() + " (" + this.getMoneyInvested() + ")";
        return info;
    }

    private int getMoneyInvested() {
        return moneyInvested;
    }

    public void setInvestment(int investment) {
        this.moneyInvested = investment;
    }

    public int getInvestment() {
        return this.moneyInvested;
    }

    // This method is used to add the investment to the tournament
    public void newInvestment(int investment) {
        this.moneyInvested += investment;
    }
}

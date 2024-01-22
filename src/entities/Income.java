package entities;

public class Income {
    private Double annualIncome;
    private Double annualServiceIncome;
    private Double annualCapitalIncome;

    public Income(Double annualIncome, Double annualServiceIncome, Double annualCapitalIncome) {
        this.annualIncome = annualIncome;
        this.annualServiceIncome = annualServiceIncome;
        this.annualCapitalIncome = annualCapitalIncome;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public Double getAnnualServiceIncome() {
        return annualServiceIncome;
    }

    public void setAnnualServiceIncome(Double annualServiceIncome) {
        this.annualServiceIncome = annualServiceIncome;
    }

    public Double getAnnualCapitalIncome() {
        return annualCapitalIncome;
    }

    public void setAnnualCapitalIncome(Double annualCapitalIncome) {
        this.annualCapitalIncome = annualCapitalIncome;
    }
}

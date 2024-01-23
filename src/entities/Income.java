package entities;

import java.util.ArrayList;
import java.util.List;

public class Income {
    private Double annualIncome;
    private Double annualServiceIncome;
    private Double annualCapitalIncome;
    private Double medicalExpenses;
    private Double educationalExpenses;

    private List<Taxs> taxsList = new ArrayList<>();

    public Income(Double annualIncome, Double annualServiceIncome, Double annualCapitalIncome, Double medicalExpenses, Double educationalExpenses) {
        this.annualIncome = annualIncome;
        this.annualServiceIncome = annualServiceIncome;
        this.annualCapitalIncome = annualCapitalIncome;
        this.medicalExpenses = medicalExpenses;
        this.educationalExpenses = educationalExpenses;
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

    public Double getMedicalExpenses() {
        return medicalExpenses;
    }

    public void setMedicalExpenses(Double medicalExpenses) {
        this.medicalExpenses = medicalExpenses;
    }

    public Double getEducationalExpenses() {
        return educationalExpenses;
    }

    public void setEducationalExpenses(Double educationalExpenses) {
        this.educationalExpenses = educationalExpenses;
    }

    public List<Taxs> getTaxsList() {
        return taxsList;
    }

    public double deductibleExpenses(){
        return medicalExpenses + educationalExpenses;
    }

    public String toString() {
        for (Taxs taxs : taxsList) {
            return "Imposto bruto total: "
                    + taxs.totalTaxs()
                    + "Abatimento: ";
        }

    }
}

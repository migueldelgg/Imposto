package entities;

public class Spending {
    private Double medicalExpenses;
    private Double educationalExpenses;

    public Spending(Double medicalExpenses, Double educationalExpenses) {
        this.medicalExpenses = medicalExpenses;
        this.educationalExpenses = educationalExpenses;
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
}

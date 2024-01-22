package entities;

public class Taxs {

    private double salaryTax;
    private double serviceTax;
    private double capitalTax;

    public Taxs(double salaryTax, double serviceTax, double capitalTax) {
        this.salaryTax = salaryTax;
        this.serviceTax = serviceTax;
        this.capitalTax = capitalTax;
    }

    public double getSalaryTax() {
        return salaryTax;
    }

    public void setSalaryTax(double salaryTax) {
        this.salaryTax = salaryTax;
    }

    public double getServiceTax() {
        return serviceTax;
    }

    public void setServiceTax(double serviceTax) {
        this.serviceTax = serviceTax;
    }

    public double getCapitalTax() {
        return capitalTax;
    }

    public void setCapitalTax(double capitalTax) {
        this.capitalTax = capitalTax;
    }

    public String toString(){
        return "Imposto sobre salário: " +  String.format("%.2f\n", salaryTax) +
                "Imposto sobre serviços: " + String.format("%.2f\n", serviceTax) +
                "Imposto sobre ganho de capital: " + String.format("%.2f\n", capitalTax);
    }
}

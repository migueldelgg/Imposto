package services;

import entities.Income;
import entities.Taxs;

public class ProcessingService {

    TaxIncome taxIncome;

    public ProcessingService(TaxIncome taxIncome) {
        this.taxIncome = taxIncome;
    }

    public void processTax(Income income) {
        double incomeTaxValue = taxIncome.taxIncome(income.getAnnualIncome());
        double serviceTaxValue = taxIncome.taxServiceIncome(income.getAnnualServiceIncome());
        double capitalTaxValue = taxIncome.taxCapitalIncome(income.getAnnualCapitalIncome());

        income.getTaxsList().add(new Taxs(incomeTaxValue, serviceTaxValue, capitalTaxValue));
    }
}

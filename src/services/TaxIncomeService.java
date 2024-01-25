package services;

public class TaxIncomeService implements TaxIncome {
    @Override
    public double taxIncome(double amount) {
        double amountMonth = amount / 12;

        if (amountMonth < 3000.0) {
            return 0.0;
        } else if (amountMonth <= 5000.0) {
            return amount * 0.10;
        } else {
            return amount * 0.20;
        }
    }

    @Override
    public double taxServiceIncome(double amount) {
        return amount == 0.0 ? 0.0 : amount * 0.15;
    }

    @Override
    public double taxCapitalIncome(double amount) {
        return amount == 0.0 ? 0.0 : amount * 0.20;
    }
}

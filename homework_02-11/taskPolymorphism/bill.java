package taskPolymorphism;

class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                // TODO создать платежи с различным типами налогообложения
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
class Bill {
    private double amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        // TODO вместо 0.0 посчитать размер налога исходя из TaxType
        double taxAmount = 0.0;

        taxService.payOut(taxAmount);
    }
}
class TaxService {
    public void payOut(double taxAmount) {
        System.out.format("Уплачен налог в размере %.2f%n", taxAmount);
    }
}
class TaxType {
    public double calculateTaxFor(double amount) {
        // TODO override me!
        return 0.0;
    }
}
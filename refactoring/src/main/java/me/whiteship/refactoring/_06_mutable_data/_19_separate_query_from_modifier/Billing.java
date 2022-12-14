package me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier;

public class Billing {

    private Customer customer;

    private EmailGateway emailGateway;

    public Billing(Customer customer, EmailGateway emailGateway) {
        this.customer = customer;
        this.emailGateway = emailGateway;
    }

    //sendBill 분리
    public double totalOutstanding() {
        return customer.getInvoices().stream()
                .map(Invoice::getAmount)
                .reduce((double) 0, Double::sum);
    }

    //private - public 변경
    public void sendBill() {
        emailGateway.send(formatBill(customer));
    }

    private String formatBill(Customer customer) {
        return "sending bill for " + customer.getName();
    }
}

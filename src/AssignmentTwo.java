import model.Invoice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AssignmentTwo {
    public static void main(String[] args) {
        List<Invoice> invoices = new ArrayList<>();
        List<Invoice> oracleAndTrainingInvoices = new ArrayList<>();
        List<Integer> ids = new ArrayList<>();
        List<Integer> firstFiveIds = new ArrayList<>();
        invoices.stream()
                .reduce(invoice -> {
                    if (invoice.getCustomer() == Customer.ORACLE){
                        if (invoice.getTitle().contains("Training")){
                            oracleAndTrainingInvoices.add(invoice);
                        }
                    }
                    return invoice;
                });

        List<Invoice> comparator = invoices.stream()
                .sorted((inv1, inv2) -> inv1.getAmount().compareTo(inv2.getAmount()))
                .collect(Collectors.toList());


        List<Integer> idInv = oracleAndTrainingInvoices.stream()
                .map(Invoice -> Invoice.getId())
                .collect(Collectors.toCollection(()->ids));

        ids.stream()
                .reduce(i -> {
                    boolean add = firstFiveIds.add(i);
                    return add;
                })
                .limit(5);
    };
}

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AssignmentTwo {
    public static void main(String[] args) {
        List<Invoice> invoices = new ArrayList<>();
        List<Invoice> oracleAndTrainingInvoices = new ArrayList<>();
        List<Integer> firstFiveIds = new ArrayList<>();

        // Adding the data dummy
        invoices.add(new Invoice("Oracle", "Training", 10, 1));
        invoices.add(new Invoice("Oracle", "Testing", 15, 2));
        invoices.add(new Invoice("Oracle2", "Training", 30, 3));
        invoices.add(new Invoice("Oracle3", "Testing", 20, 4));
        invoices.add(new Invoice("Oracle", "Training", 25, 5));
        invoices.add(new Invoice("Oracle5", "Training", 40, 6));

        oracleAndTrainingInvoices = invoices.stream()
                .filter(invoice -> invoice.getCustomer() == Customer.ORACLE && invoice.getTitle().contains("Training"))
                .sorted(Comparator.comparingDouble(Invoice::getAmount))
                .peek(e -> System.out.println("id : " + e.getId() + "\nCustomer : " + e.getCustomer()
                        + "\nTittle : " + e.getTitle() + "\nAmount : " + e.getAmount() + "\n"))
                .collect(Collectors.toList());

        firstFiveIds = oracleAndTrainingInvoices.stream()
                .map(Invoice::getId)
                .limit(5)
                .peek(e -> System.out.println("First Five Id : " + e))
                .collect(Collectors.toList());
    }
}

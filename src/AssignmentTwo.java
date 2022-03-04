import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.List;

public class AssignmentTwo {
    public static void main(String[] args) {
        List<Invoice> invoices = new ArrayList<>();
        List<Invoice> oracleAndTrainingInvoices = new ArrayList<>();
        List<Integer> ids = new ArrayList<>();
        List<Integer> firstFiveIds = new ArrayList<>();

        for (Invoice inv: invoices){
            if(inv.getCustomer() == Customer.ORACLE){
                if(inv.getTitle().contains("Training")) {
                    oracleAndTrainingInvoices.add(inv);
                }
            }
        }

        Integer sum = firstFiveIds.stream().reduce(0, (i, j) -> i +j);

    }
}

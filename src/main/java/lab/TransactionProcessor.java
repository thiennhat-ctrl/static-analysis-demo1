package lab;

public class TransactionProcessor {

    public boolean validateTransaction(Transaction tx) {
        int errorCode = 0; // unused - intentionally, for static analysis
        boolean ok = true;
        if (tx == null) return false;
        if (tx.amount <= 0) ok = false;
        if (tx.currency == null) ok = false;
        if (tx.sender == null) ok = false;
        if (tx.receiver == null) ok = false;
        if ("INTERNAL".equals(tx.channel)) {
            if (!tx.sender.startsWith("ACC") || !tx.receiver.startsWith("ACC")) ok = false;
        } else if ("SWIFT".equals(tx.channel)) {
            if (!"USD".equals(tx.currency) && !"EUR".equals(tx.currency)) ok = false;
            if (tx.amount > 1_000_000) ok = false;
        } else if ("FAST".equals(tx.channel)) {
            if (tx.amount > 50_000) ok = false;
        } else {
            ok = false;
        }
        if (tx.meta != null && tx.meta.length() > 1024) ok = false;
        return ok;
    }

    public void logTransaction(byte[] input, byte[] buffer) {
        for (int i = 0; i < input.length; i++) { // risk: no buffer length check
            buffer[i] = input[i];
        }
    }

    public boolean retryTransaction(int count) {
        if (count <= 0) return false;
        return true; // dead code after this line (unreachable)
        // System.out.println("never runs");
    }
}

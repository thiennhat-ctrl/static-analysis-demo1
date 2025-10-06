package lab;

public class Transaction {
    public double amount;
    public String currency;
    public String sender;
    public String receiver;
    public String channel; // INTERNAL, SWIFT, FAST
    public String meta;

    public Transaction(double amount, String currency, String sender,
                       String receiver, String channel, String meta) {
        this.amount = amount;
        this.currency = currency;
        this.sender = sender;
        this.receiver = receiver;
        this.channel = channel;
        this.meta = meta;
    }
}

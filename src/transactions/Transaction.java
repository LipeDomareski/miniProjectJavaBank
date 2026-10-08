package transactions;
import java.time.LocalDateTime;

public class Transactions {
    private int id;
    private double value;
    private TransactionType type;
    private LocalDateTime date;

    public Transactions (int id, double value, TransactionType type, LocalDateTime date)
    {
        this.id = id;
        this.value = value;
        this.type = type;
        this.date = date;
    }

    //getters
    public int getId() { return id; }
    public double getValue() { return value; }
    public TransactionType getType() { return type; }
    public LocalDateTime getDate() { return date; }


}

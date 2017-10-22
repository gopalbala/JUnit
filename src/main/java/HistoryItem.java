import lombok.Getter;

@Getter
public class HistoryItem {

	private final int id;
	private final int amount;
	private final String operation;
	private final int total;

	public HistoryItem(int id, int amount, String operation, int total) {
		this.id = id;
		this.amount = amount;
		this.operation = operation;
		this.total = total;
		
	}

}


public class Campaign {
	private int id;
	private int discountRate;
	private String name;
	private String beginningDate;
	private String endingDate;
	private String category;
	
	public Campaign() {
		
	}
	
	public Campaign(int id, int discountRate, String name, String beginningDate, String endingDate, String category) {
		super();
		this.id = id;
		this.discountRate = discountRate;
		this.name = name;
		this.beginningDate = beginningDate;
		this.endingDate = endingDate;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBeginningDate() {
		return beginningDate;
	}
	public void setBeginningDate(String beginningDate) {
		this.beginningDate = beginningDate;
	}
	public String getEndingDate() {
		return endingDate;
	}
	public void setEndingDate(String endingDate) {
		this.endingDate = endingDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}

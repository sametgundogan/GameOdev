
public class Game {
	int gameId;
	String gameName;
	String category;
	int price;
	public Game(){
		
	}
	public Game(int gameId, String gameName, String category, int price) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.category = category;
		this.price = price;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}

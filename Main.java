
public class Main {

	public static void main(String[] args) {
			Campaign kampanya1 = new Campaign();
			kampanya1.setId(0001);
			kampanya1.setName("Öğrenci indirimi!");
			kampanya1.setDiscountRate(15);
			kampanya1.setBeginningDate("12.12.2019");
			kampanya1.setEndingDate("01.01.2020");
			kampanya1.setCategory("Action");
			
			User user1 = new User();
			user1.setFirstName("Samet");
			user1.setLastName("Gündoğan");
			user1.setNationalIdentity("111111111");
			user1.setUserid(00002);
			user1.setYearofBirth(1994);
			
			Game game1 = new Game();
			game1.setCategory("Action");
			game1.setGameName("Zombie Attack");
			game1.setGameId(00001);
			game1.setPrice(150);
			
			CampaignService newcampaign = new CampaignManager();
			newcampaign.delete(kampanya1);
			newcampaign.add(kampanya1);
			newcampaign.update(kampanya1);
			
			UserService newuser1 = new UserManager();
			newuser1.enroll(user1);
			newuser1.delete(user1);
			newuser1.update(user1);
			
			GameService newgame1 = new GameManager();
			newgame1.add(game1);
			newgame1.delete(game1);
			newgame1.update(game1);
			
			GameSaleService newsale1 = new GameSaleManager();
			newsale1.sell(user1, game1, kampanya1);
			
			
			
			
			
	}

}


public class GameSaleManager implements GameSaleService{

	@Override
	public void sell(User user, Game game, Campaign campaign) {
		double lastprice = game.getPrice()-(game.getPrice()*campaign.getDiscountRate()/100);		
		System.out.println(game.getGameName() + "oyunun satış işlemi " + lastprice + " fiyatından gerçekleşmiştir.");
	}

}

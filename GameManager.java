
public class GameManager implements GameService, GameSaleService{

	@Override
	public void add(Game game) {
			System.out.println(game.getGameName() + " adlı oyun eklendi!");		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " adlı oyun silindi!");	
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+ " adlı oyun güncellendi!");		
	}

	@Override
	public void sell(User user, Game game, Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

}

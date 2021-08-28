
public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " isimli kampanya eklendi!");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+ " ismili kampanya silindi.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCategory()+ " kategorisindeki kampanyalar güncellendi. " + campaign.getBeginningDate() + " itibarıyla " 
	+ campaign.getEndingDate() + " tarihine kadar geçerli %" + campaign.getDiscountRate() + " indirim. Bu Fırsatı kaçırma!");		
	}
	
}

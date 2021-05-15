package Concrete;

import java.util.ArrayList;

import Abstract.CampaignService;
import Entities.Campaign;


public class CampaignManager implements CampaignService {
	
	ArrayList<Campaign> campaigns;
	private Campaign _campaign =new Campaign();
	
	
	public CampaignManager() {
		super();
		campaigns=new ArrayList<Campaign>() {};
		
	}

	@Override
	public void add(Campaign campaign) {
		
		campaigns.add(campaign);
			System.out.println("Kampanya Eklendi");
	}

	@Override
	public void delete(Campaign campaign) {
	
		for (Campaign g : campaigns) {
			if(g.getId()==campaign.getId()) _campaign=g;
		}
		
		campaigns.remove(_campaign.getId()-1);
		System.out.println(" "+_campaign.getName()+" isimli kampanya silindi");
	}

	@Override
	public void update(Campaign campaign) {
		for (Campaign g : campaigns) {
			if(g.getId()==campaign.getId()) _campaign=g;
		}
		
		campaigns.set(_campaign.getId()-1, campaign);
		System.out.println(" "+_campaign.getName()+" isimli kampanya güncellendi");
		
	}

	@Override
	public void list() {
		
		for (Campaign campaign : campaigns) {
			System.out.println("Campaign Id="+campaign.getId()+"\nName="+campaign.getName()+"\nCampaign Rate = %"+campaign.getCampaignRate());
		}
		
	}
}

package de.phpmonkeys.jklout2.types;

import java.util.List;

public class Influence {
	
	private List<InnerItem> myInfluencers;
	private List<InnerItem> myInfluencees;
	private int myInfluencersCount;
	private int myInfluenceesCount;
	
	public List<InnerItem> getMyInfluencers() {
		return myInfluencers;
	}
	public void setMyInfluencers(List<InnerItem> myInfluencers) {
		this.myInfluencers = myInfluencers;
	}
	public List<InnerItem> getMyInfluencees() {
		return myInfluencees;
	}
	public void setMyInfluencees(List<InnerItem> myInfluencees) {
		this.myInfluencees = myInfluencees;
	}
	public int getMyInfluencersCount() {
		return myInfluencersCount;
	}
	public void setMyInfluencersCount(int myInfluencersCount) {
		this.myInfluencersCount = myInfluencersCount;
	}
	public int getMyInfluenceesCount() {
		return myInfluenceesCount;
	}
	public void setMyInfluenceesCount(int myInfluenceesCount) {
		this.myInfluenceesCount = myInfluenceesCount;
	}

}

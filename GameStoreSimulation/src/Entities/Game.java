package Entities;

import Abstract.Entity;

public class Game implements Entity {

	private int id;
	private String name;
	private int price;
	private String systemRequirements;
	
	public Game() {
		
	}
	
	public Game(int id, String name, int price, String systemRequirements) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.systemRequirements = systemRequirements;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSystemRequirements() {
		return systemRequirements;
	}

	public void setSystemRequirements(String systemRequirements) {
		this.systemRequirements = systemRequirements;
	}
	
	
}

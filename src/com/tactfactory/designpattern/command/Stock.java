package com.tactfactory.designpattern.command;

public class Stock {
	private String Name;
	private Integer Quantity;
	private GlobalStock StockName;
	
	public Stock(String name, Integer quantity, GlobalStock stockName) {
		Name = name;
		Quantity = quantity;
		StockName = stockName;
	}

	public Stock(String name) {
		Name = name;
	}
	
	public Stock() {

	}
	
	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getQuantity() {
		return Quantity;
	}

	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}
	
	
	
	public GlobalStock getStockName() {
		return StockName;
	}

	public void setStockName(GlobalStock stockName) {
		StockName = stockName;
	}

	@Override
	  protected Object clone() throws CloneNotSupportedException {
	    Stock result = new Stock();
	    result.setName(this.getName());
	    result.setQuantity(this.getQuantity());
	    result.setStockName(this.getStockName());
	    return result;
	  }	
	
	
}

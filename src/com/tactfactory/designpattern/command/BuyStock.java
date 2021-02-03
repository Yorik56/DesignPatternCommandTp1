package com.tactfactory.designpattern.command;

public class BuyStock implements Command {
	
	  private final Stock stock;
//	  private Stock beforeExecute;

	  public BuyStock(final Stock stock) {
	    this.stock = stock;
	  }

	@Override
	public boolean execute() throws CloneNotSupportedException {
		
		for (Stock stock : this.stock.getStockName().getGlobalStock()) {
			if(stock.getName().equals(this.stock.getName())){
				stock.setQuantity((stock.getQuantity() + this.stock.getQuantity()));
			}
		}
		
		return true;
	}


//	public boolean buy() {
//		this.stock.setName(name);
//	}
}

package com.tactfactory.designpattern.command;

public abstract class BuyStock implements Command {
	
	  private Stock stock;
//	  private Stock beforeExecute;

	  public BuyStock(final Stock stock) {
	    this.stock = stock;
	  }
	
	public boolean buy() {
		return false;
	}
}

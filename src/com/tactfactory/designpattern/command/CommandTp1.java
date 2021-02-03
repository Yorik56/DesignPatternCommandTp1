package com.tactfactory.designpattern.command;

public class CommandTp1 {
	public static void main(String[] args) throws CloneNotSupportedException {
			
		GlobalStock globalStock = new GlobalStock();
	    globalStock.getGlobalStock().add(new Stock("myItem"));
	    globalStock.getGlobalStock().add(new Stock("apple"));
	    globalStock.getGlobalStock().add(new Stock("pinapple"));
		
    
	    Stock stock = new Stock("myItem", 20, globalStock);
	    
	    BuyStock buystock = new BuyStock(stock);
	    
	    globalStock.executeCommand(buystock);
	    globalStock.executeCommand(new BuyStock(stock));
	    
	    for (Stock item : globalStock.getGlobalStock()) {
			System.out.println(item.getName() + " " + item.getQuantity());
		}
	    
	    globalStock.showHistory();
	    
	  }
}

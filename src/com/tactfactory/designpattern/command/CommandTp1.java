package com.tactfactory.designpattern.command;

public class CommandTp1 {
	public static void main(String[] args) {
			
		GlobalStock globalStock = new GlobalStock();
	    globalStock.globalStock.add(new Stock("myItem"));
	    globalStock.globalStock.add(new Stock("apple"));
	    globalStock.globalStock.add(new Stock("pinapple"));
		
	    Invoker invoker = new Invoker();
	    
	    Stock stock = new Stock("myItem", 20, globalStock);
	    
	    
	    
	  }
}

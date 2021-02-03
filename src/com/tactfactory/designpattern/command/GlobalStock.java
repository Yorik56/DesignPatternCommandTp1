package com.tactfactory.designpattern.command;

import java.util.ArrayList;

public class GlobalStock {
	private ArrayList<Stock> globalStock = new ArrayList<Stock>();

	private Invoker invoker = new Invoker();
	
	public void executeCommand(Command command) throws CloneNotSupportedException {
	    if (command.execute()) {
	      this.invoker.push(command);
	    }
	  }
	
	 public void showHistory() {
	    this.invoker.showHistory();
     }

	public ArrayList<Stock> getGlobalStock() {
		return globalStock;
	}
	 
	 
	
}

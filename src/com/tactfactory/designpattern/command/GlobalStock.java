package com.tactfactory.designpattern.command;

import java.util.ArrayList;

public class GlobalStock {
	public ArrayList<Stock> globalStock;

	private Invoker invoker = new Invoker();
	
	public void executeCommand(Command command) throws CloneNotSupportedException {
	    if (command.execute()) {
	      this.invoker.push(command);
	    }
	  }
	
	 public void showHistory() {
	    this.invoker.showHistory();
     }
	
}

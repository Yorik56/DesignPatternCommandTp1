package com.tactfactory.designpattern.command;

public interface Command {
	
	public abstract boolean execute() throws CloneNotSupportedException;

	  public abstract boolean buy();
	  
	  public abstract boolean sell();
	
}

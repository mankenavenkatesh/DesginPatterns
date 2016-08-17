package com.intuit.training.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	public void undo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException; 
	
}

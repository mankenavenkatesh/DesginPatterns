package com.intuit.training.command;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class CommandServlet extends HttpServlet{

	private static final long serialVersionUID=1L;
	private Properties props;
	private List<Command> commands=new ArrayList<>();
	
	public CommandServlet() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		props=new Properties();
		ServletContext context=getServletContext();
		InputStream in=context.getResourceAsStream("commands.properties");
		try {
			props.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri=request.getRequestURI();
		String subUri=uri.substring(uri.lastIndexOf("/"));
		if(subUri.equals("/undo.do")){
			Command cmd=commands.get(commands.size()-1);
			cmd.undo(request, response);
			commands.remove(cmd);
		}
		else{
		String className=props.getProperty(subUri);
		try {
			Class clz=Class.forName(className);
			Command cmd=(Command) clz.newInstance();
			cmd.execute(request, response);
			commands.add(cmd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}

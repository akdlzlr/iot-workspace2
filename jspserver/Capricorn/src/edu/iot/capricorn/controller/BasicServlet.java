package edu.iot.capricorn.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.iot.capricorn.model.ModelAndView;
import edu.iot.capricorn.util.Util;


public abstract class BasicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BasicServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ModelAndView mav = new ModelAndView();
		try {
			get(mav,request,response);
			done(mav,request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void get(ModelAndView mav,HttpServletRequest request, HttpServletResponse response) throws Exception{}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ModelAndView mav = new ModelAndView();
		try {
			post(mav,request,response);
			done(mav,request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void post(ModelAndView mav,HttpServletRequest request, HttpServletResponse response) throws Exception{}
	
	protected void done(ModelAndView mav,HttpServletRequest request, HttpServletResponse response) throws Exception{
		String view = mav.getView();
		Map<String, Object> map = mav.getMap();
		Util.toScope(request, map);
		
		if(view.startsWith("redirect:")) {
			view = view.substring("redirect:".length()).trim();
			String url;
			if(view.charAt(0)=='/') {
				url = request.getContextPath()+view;
			}else {
				url = view;
			}
			response.sendRedirect(url);
		}else {
			RequestDispatcher dispatcher = request.getRequestDispatcher(view);
			dispatcher.forward(request, response);

		}
		
		
		
	}
	
}

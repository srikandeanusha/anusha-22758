package com.cybage.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.dao.UserDao;
import com.cybage.dao.UserDaoImpl;
import com.cybage.model.User;
import com.cybage.service.UserService;
import com.cybage.service.UserServiceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@ServletSecurity(
		value = @HttpConstraint(rolesAllowed = {"user"})
		
		)

public class UserController extends HttpServlet {
	
	public static final Logger log = LogManager.getLogger(UserController.class.getName());
	private UserDao userDao = new UserDaoImpl();
	private UserService userservice = new UserServiceImpl(userDao);
	private static final long serialVersionUID = 1L;
 
    public UserController() {
        super();
        
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		//System.out.println("inside user controller");
		log.info("inside user controller");
		String path = request.getPathInfo();
		//pw.print(path);
		if(path.equals("/add")) {
			System.out.println("inside add method");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String address = request.getParameter("address");
			
			User user = new User(username, password, address,"user");
			try {
				int added = userservice.addUser(user);
				if(added > 0) {
					response.sendRedirect("list");
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
		if(path.equals("/list")) {
			System.out.println("inside display method");
			try {
				List<User> users = userservice.findUser();
				request.setAttribute("users", users);
				request.getRequestDispatcher("/user/view-user.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(path.equals("/delete")) {
			System.out.println("inside delete");
			int id = Integer.parseInt(request.getParameter("id"));
			System.out.println("id :"+id);
			try {
				userservice.deleteUser(id);
				response.sendRedirect("list");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(path.equals("/update")) {
			System.out.println("hello");
			int id = Integer.parseInt(request.getParameter("id"));
			System.out.println(id);
			User u;
			try {
				u = userservice.findUserById(id);
				System.out.println(u.getName());
				request.setAttribute("user", u);
				request.getRequestDispatcher("/user/edit.jsp").forward(request, response);
				//userservice.updateUser(u);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
		if(path.equals("/update-data")) {
			String username = request.getParameter("username");
			System.out.println(request.getParameter("id"));
			int id = Integer.parseInt(request.getParameter("id"));
			String address = request.getParameter("address");
			User u = new User();
			u.setId(id);
			u.setName(username);
			u.setAddress(address);
			try {
				userservice.updateUser(u);
				response.sendRedirect("list");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

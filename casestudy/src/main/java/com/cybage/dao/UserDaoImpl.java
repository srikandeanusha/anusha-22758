package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.User;
import com.cybage.util.DbUtil;


public class UserDaoImpl implements UserDao{

	public int addUser(User user) throws Exception {
		Connection con = DbUtil.getCon();

		String sql = "insert into user values (?,?,?,?,?)";

		PreparedStatement ps = con.prepareStatement(sql);

		ps.setInt(1, user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());
		ps.setString(4, user.getAddress());
		ps.setString(5, user.getRole());

		return ps.executeUpdate();
	}

	public List<User> findUser() throws Exception {

		Connection con = DbUtil.getCon();

		String sql = "select id,username,address from user";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery(sql);
		List<User> users = new ArrayList<User>();
		
		while(rs.next()) {
			User u = new User();
			u.setId(rs.getInt(1));
			u.setName(rs.getString(2));
			u.setAddress(rs.getString(3));
			users.add(u);
		}
		return users;
	}

	public User findUserById(int id) throws Exception {
		Connection con = DbUtil.getCon();

		String sql = "select id,username,address from user where id ='"+id+"'";
		
		//PreparedStatement ps = con.prepareStatement(sql);
//		ps.setInt(1, id);
		Statement ps = con.createStatement();
		ResultSet rs = ps.executeQuery(sql);
		rs.next();
		User u = new User();
		
			
			u.setId(rs.getInt(1));
			u.setName(rs.getString(2));
			u.setAddress(rs.getString(3));
			
		
		return u;
		
	}

	public int deleteUser(int id) throws Exception {
		Connection con = DbUtil.getCon();

		String sql = "delete from user where id = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		
		return ps.executeUpdate();
	}

	public int updateUser(User user) throws Exception {
		Connection con = DbUtil.getCon();

		String sql = "update user set username=?,address=? where id=?";

		PreparedStatement ps = con.prepareStatement(sql);

		ps.setInt(3, user.getId());
		ps.setString(1, user.getName());
		
		ps.setString(2, user.getAddress());

		return ps.executeUpdate();
		
	}

}

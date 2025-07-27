package application;

import java.sql.Connection;
import java.sql.SQLException;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		
		//System.out.println("Projeto usando Java e Mysql!");
		
		Connection conn = DB.getConnection();
		
		try {
			if(!(conn.isClosed())) {
				System.out.println("*Operação sql divertida*");
			}
		}catch(SQLException e) {
			throw new DbException(e.getMessage()); 
		}
		
		DB.closeConnection();

	}

}

package com.holaMundo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	//coment

	Connection myConnection;
	String URL = "jdbc:postgresql://localhost:5432/inventario";
	String pwd = "sa";
	String user = "postgres";

	public Connection getConexion() {
		try {
			Class.forName("org.postgresql.Driver");

		} catch (Exception e) {
			System.out.println("Driver de conexi�n incorrecto");
			e.printStackTrace();
		}
		try {
			if (myConnection == null) {
				myConnection = DriverManager.getConnection(URL, user, pwd);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return myConnection;
	}


}

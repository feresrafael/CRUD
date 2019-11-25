/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo.jdbc;

/**
 *
 * @author feres
 */
import java.sql.Connection;

public class TestBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = new ConnectionFactory().getConnection();
		System.out.println("Conexão OK");
	
	}

}

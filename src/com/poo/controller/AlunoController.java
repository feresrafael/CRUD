/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo.controller;

/**
 *
 * @author feres
 */
import java.util.ArrayList;
import java.util.List;

import com.poo.dao.AlunoDAO;
import com.poo.model.Aluno;

public class AlunoController {

	public void Create(Aluno aluno)
	{
		try
		{
			AlunoDAO dao = new AlunoDAO();
			dao.Create(aluno);
		}
		finally{
			System.out.println("Fim da Insercao");
		}
	}
	public List<Aluno> ReadAll()
	{	List<Aluno> Alunos1 =  new ArrayList<Aluno>();
		try{
			AlunoDAO dao = new AlunoDAO();

			Alunos1 = dao.readAll();

		}
		finally{
			System.out.println("Fim da Pesquisa");
		}
		return Alunos1;

	}

	public void Delete(Aluno aluno)
	{
		try
		{
			AlunoDAO dao = new AlunoDAO();
			dao.Delete(aluno);
		}
		finally{
			System.out.println("Fim da Insercao");
		}
	}

	public void Update(Aluno aluno)
	{
		try
		{
			AlunoDAO dao = new AlunoDAO();
			dao.Update(aluno);
		}
		finally{
			System.out.println("Fim da Insercao");
		}
	}




}

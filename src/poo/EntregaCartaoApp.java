package poo;

import poo.model.Cliente;

//import java.util.ArrayList;


import poo.model.Endereco;

public class EntregaCartaoApp {

	public static void main(String[] args) {

		Endereco endereco = new Endereco();
		endereco.cep = "000000";
		//endereco.

		Cliente cliente = new Cliente();
		//cliente.

		try {
			
			cliente.adicionaEndereco(endereco);
			System.out.println("Endereco adicionado com sucesso!");
			
		} catch (Exception e) {
			System.err.println("Houve um erro ao adicionar um endereco " + e.getMessage());
		}
		
	}

}

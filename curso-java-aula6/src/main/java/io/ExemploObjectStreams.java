package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExemploObjectStreams {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Juquinha");
		pessoa.setNome("Da silva");
		
		ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(arrayOutputStream);
		out.writeObject(pessoa);
		
		System.out.println(arrayOutputStream.size());
		
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOutputStream.toByteArray());
		ObjectInputStream inputStream = new ObjectInputStream(byteArrayInputStream);
		Pessoa pessoaDeserializada = (Pessoa) inputStream.readObject();
		
		System.out.println(pessoaDeserializada);
		System.out.println(pessoaDeserializada == pessoa);
	}
}
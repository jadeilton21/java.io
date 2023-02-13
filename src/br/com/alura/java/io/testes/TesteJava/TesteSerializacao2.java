package br.com.alura.java.io.testes.TesteJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao2 {


    public static void main(String[] args) throws Exception{


        // Criando arquivo de texto ou de qualquer coisa aparti do java.
        String nome = "jade";

        ObjectOutputStream objeto = new ObjectOutputStream(new FileOutputStream("Jade.fau"));
        objeto.writeObject(nome);
        objeto.close();





        // Saida da mensagem do arquivo criado a cima.....


        ObjectInputStream objeto2 = new ObjectInputStream(new FileInputStream("Jade.fau"));
        String nomes = (String) objeto2.readObject();
        System.out.println(nomes);
        objeto2.close();

    }
}

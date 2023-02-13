package br.com.alura.java.io.testes.TesteJava;

import java.io.*;

public class Io5TextoCompletoLer {


    public static void main(String[] args) throws Exception{


        InputStream file = new FileInputStream("Banco de dados Tabelas.txt");
        Reader reader = new InputStreamReader(file);
        BufferedReader reader1 =new BufferedReader(reader);


        String linhas = reader1.readLine();


        while(linhas != null){
            System.out.println("--> " + linhas);
            linhas = reader1.readLine();

        }

        reader1.close();




    }
}

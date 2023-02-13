package br.com.alura.java.io.testes.TesteJava;

import java.io.*;

public class Io6LerTestoCompleto {


    public static void main(String[] args) throws Exception {


        InputStream texto = new FileInputStream("Banco de dados Tabelas.txt");
        Reader bit = new InputStreamReader(texto);
        BufferedReader transformar = new BufferedReader(bit);


        String linhas = transformar.readLine();


        while(linhas != null){
            System.out.println(linhas);
            linhas = transformar.readLine();
        }
        transformar.close();





    }
}

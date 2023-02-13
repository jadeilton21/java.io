package br.com.alura.java.io.testes.TesteJava;

import java.io.*;

public class Io7LerTextoCompleto {


    public static void main(String[] args)  throws Exception {

        // Entrada de Dados..
        InputStream texto = new FileInputStream("atividade.txt");
        Reader bit = new InputStreamReader(texto);
        BufferedReader transformar = new BufferedReader(bit);




        String linhas = transformar.readLine();


        while (linhas != null){

            System.out.println(linhas);
            linhas = transformar.readLine();

        }


    }
}

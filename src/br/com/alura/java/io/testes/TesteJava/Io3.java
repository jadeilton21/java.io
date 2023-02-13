package br.com.alura.java.io.testes.TesteJava;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.io.*;

public class Io3 {


    public static void main(String[] args)throws Exception {
        // Entrada de texto..
        InputStream fiz = new FileInputStream("atividade.txt");
        Reader reader = new InputStreamReader(fiz);
        BufferedReader reader1 = new BufferedReader(reader);


        String linha = reader1.readLine();


        while( linha != null){
            System.out.println("--> " + linha);
            linha = reader1.readLine();

        }
        reader1.close();




    }
}

package br.com.alura.java.io.testes.TesteJava;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Io2 {


    public static void main(String[] args) throws Exception {


        FileInputStream file = new FileInputStream("atividade.txt");
        InputStreamReader reader = new InputStreamReader(file);
        BufferedReader br = new BufferedReader(reader);

        String linha = br.readLine();

        System.out.println("--> " + linha);


    }
}

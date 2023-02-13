package br.com.alura.java.io.testes.TesteJava;

import java.io.PrintStream;

public class IoJavaWriter {


    public static void main(String[] args) throws Exception{


        PrintStream atividade = new PrintStream("atividade.txt");


        atividade.println("Faia, 4, 10, 299,");

        atividade.close();
    }
}

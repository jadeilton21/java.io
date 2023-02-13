package br.com.alura.java.io.testes.TesteJava;

import java.io.PrintStream;

public class IoPrintStream2 {


    public static void main(String[] args) throws Exception {


        PrintStream jaderasta = new PrintStream("atividade.txt");

        jaderasta.println("jade rasta");
        jaderasta.println();
        jaderasta.println();
        jaderasta.println("fayaaaaaa");
        jaderasta.println("ieaaaaaaaa");


        jaderasta.close();



    }
}

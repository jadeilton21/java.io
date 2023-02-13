package br.com.alura.java.io.testes.TesteJava;

import java.io.PrintStream;

public class IoPrintStream {


    public static void main(String[] args) throws Exception {



        PrintStream entradaDeDados = new PrintStream("atividade.txt");

        entradaDeDados.println(" Jade sexy hehehe");
        entradaDeDados.println();
        entradaDeDados.println("Fayaaaaa");
        entradaDeDados.println();


        entradaDeDados.close();


    }
}

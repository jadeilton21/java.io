package br.com.alura.java.io.testes.TesteJava;

import java.io.PrintWriter;

public class IoPrinteWriter {


    public static void main(String[] args) throws Exception{


        PrintWriter entradaDeDados = new PrintWriter("ativade.txt");


        entradaDeDados.write(" Fayaaaa jamaicana");
        entradaDeDados.write("Gostosoo");
        entradaDeDados.write(System.lineSeparator());
        entradaDeDados.println("Fayaaaaaaaa");
        entradaDeDados.write(System.lineSeparator());

        entradaDeDados.close();

    }
}

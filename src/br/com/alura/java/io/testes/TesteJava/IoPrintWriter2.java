package br.com.alura.java.io.testes.TesteJava;

import java.io.PrintWriter;

public class IoPrintWriter2 {


    public static void main(String[] args) throws Exception {

        long inicio = System.currentTimeMillis();
        PrintWriter entradaDeDados = new PrintWriter("atividade.txt");

        entradaDeDados.println("fAAAAAAIA");
        entradaDeDados.write(System.lineSeparator());
        entradaDeDados.println("Faiaaaa");
        entradaDeDados.println();
        entradaDeDados.write(" Eu sei que vou te amar sempre");
        entradaDeDados.println();
        entradaDeDados.println("Faaaaaaaaaaaaaiaaa");
        entradaDeDados.println();
        entradaDeDados.println(System.lineSeparator());

        long fim = System.currentTimeMillis();

        System.out.println(" Se passaram " + (fim - inicio) + " Segundos...");

        entradaDeDados.close();





    }
}

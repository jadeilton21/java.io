package br.com.alura.java.io.testes.TesteJava;

import java.io.PrintStream;

public class IoPrintStream3 {


    public static void main(String[] args) throws Exception {


        PrintStream entrada = new PrintStream("atividade.txt");

        entrada.println("yeaaaaa");
        entrada.println("fayaa");
        entrada.println(" Eu sei que vou te amar");
        entrada.println(" Gosto de Bucetas...");
        entrada.println();
        entrada.println("Vem de 4 gostosa");

        entrada.close();


    }
}

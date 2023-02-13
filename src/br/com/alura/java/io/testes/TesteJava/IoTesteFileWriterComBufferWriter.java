package br.com.alura.java.io.testes.TesteJava;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class IoTesteFileWriterComBufferWriter {


    public static void main(String[] args) throws Exception{

        BufferedWriter entradaDeDados = new BufferedWriter(new FileWriter("atividade.txt"));
        entradaDeDados.write("Eu sou foda....");
        entradaDeDados.write(System.lineSeparator());
        entradaDeDados.write("Jade Gostoso");
        entradaDeDados.write(System.lineSeparator());
        entradaDeDados.write("SExy sem sensualidade");
        entradaDeDados.write(System.lineSeparator());



        entradaDeDados.close();


    }
}

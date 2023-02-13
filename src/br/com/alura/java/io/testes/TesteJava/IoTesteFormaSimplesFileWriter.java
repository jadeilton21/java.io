package br.com.alura.java.io.testes.TesteJava;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class IoTesteFormaSimplesFileWriter {


    public static void main(String[] args) throws Exception{


        BufferedWriter entradaDeDados = new BufferedWriter(new FileWriter("atividade.txt"));


        entradaDeDados.write("jade lindo e sexy e comedor");
        entradaDeDados.write(System.lineSeparator());
        entradaDeDados.write("fayaaa");
        entradaDeDados.write(System.lineSeparator());
        entradaDeDados.write("ganja");
        entradaDeDados.write(System.lineSeparator());




        entradaDeDados.close();
    }
}

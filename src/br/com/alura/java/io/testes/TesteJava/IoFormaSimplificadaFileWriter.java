package br.com.alura.java.io.testes.TesteJava;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class IoFormaSimplificadaFileWriter {


    public static void main(String[] args) throws Exception{


        FileWriter saida = new FileWriter("atividade.txt");
        BufferedWriter bw = new BufferedWriter(saida);


        bw.write("Jade gostoso");
        bw.write(System.lineSeparator());
        bw.write(System.lineSeparator());
        bw.write("Jade lindooooo");

        bw.close();



    }
}

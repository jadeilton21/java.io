package br.com.alura.java.io.testes.TesteJava;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class IoOutraFormaDeFazerBufferd2{


    public static void main(String[] args) throws Exception{


        BufferedWriter saidaDeCoisas = new BufferedWriter(new FileWriter("atividade.txt"));
        saidaDeCoisas.write("Jade lindo e sexy e comedor");
        saidaDeCoisas.write(System.lineSeparator());
        saidaDeCoisas.write("eu mando aqui ");
        saidaDeCoisas.write(System.lineSeparator());
        saidaDeCoisas.write("Jade comedor");
        saidaDeCoisas.write(System.lineSeparator());
        saidaDeCoisas.write("Jade amor lindo");


        saidaDeCoisas.close();




    }
}

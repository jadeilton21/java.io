package br.com.alura.java.io.testes.TesteJava;

import java.io.File;
import java.util.Scanner;

public class IoJavaUtilScanner5 {


    public static void main(String[] args) throws Exception  {


        Scanner scanner = new Scanner(new File("atividade.txt"));

        while (scanner.hasNextLine()){

            String linha = scanner.nextLine();
            System.out.println(linha);
        }

        scanner.close();

    }
}

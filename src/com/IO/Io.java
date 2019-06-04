package com.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Io {
    Scanner scan = new Scanner(System.in);
    String insert;

        public void entrada() {
            System.out.println("Digite o que deve ser impresso no documento");
            insert = scan.next();
            byte b[] = insert.getBytes();
            try (FileOutputStream gravador = new FileOutputStream("stream.txt")) {
                gravador.write(b);
                System.out.println("Dados gravados com sucesso!");
            } catch (IOException e) {
                e.printStackTrace();

            }
        }


    public void leitor() {
        try (FileInputStream leitor = new FileInputStream("stream.txt")) {
            int leitura = leitor.read();
            while (leitura != -1) {
                System.out.print((char) + leitura);
                leitura = leitor.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

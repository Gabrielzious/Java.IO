package com.io;

import com.excecoes.ExcecaoDeEnderecoInvalido;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LeitorDeArquivos {

    private String nomeLeitor;
    Scanner scan = new Scanner(System.in);

    public LeitorDeArquivos(String nomeLeitor) {
        this.nomeLeitor = nomeLeitor;
    }

    public String getNomeLeitor() {
        return nomeLeitor;
    }

    public void leitor() throws ExcecaoDeEnderecoInvalido {
        System.out.println("insira o nome do documento de texto que vc deseja fazer a leitura pelo leitor: " + "'" +this.getNomeLeitor()+ "'" );
        String nome = scan.next();

        try (FileInputStream leitor = new FileInputStream(nome +".txt")) {
            int leitura = leitor.read();
            while (leitura != -1) {
                System.out.print((char) + leitura);
                leitura = leitor.read();
            }
            System.out.println("\n");
        } catch (IOException e) {
            throw new ExcecaoDeEnderecoInvalido("Não foi possível localizar o caminho para o leitor:" + this.getNomeLeitor());
        }
    }
}

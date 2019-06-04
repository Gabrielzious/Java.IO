package com.IO;

import com.excecoes.ExcecaoDeEnderecoInvalido;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class GeradorDeArquivos {


    private String nomeGerador;

    public GeradorDeArquivos(String nomeGerador) {
        this.nomeGerador = nomeGerador;
    }

    public String getNomeGerador() {
        return nomeGerador;
    }

    public void entrada() throws ExcecaoDeEnderecoInvalido {
        Scanner scan = new Scanner(System.in);
        String insert;

        System.out.println("Digite o que deve ser impresso no documento pelo gerador " + "'" + this.getNomeGerador() + "'");
        insert = scan.next();
        byte b[] = insert.getBytes();
        try (FileOutputStream gravador = new FileOutputStream(this.getNomeGerador()+".txt")) {
            gravador.write(b);
            System.out.println("Dados gravados com sucesso!");
        } catch (IOException e) {
            throw new ExcecaoDeEnderecoInvalido("Nao foi possível localizar o endereço para criação do arquivo no gerador: " + this.getNomeGerador());

        }
    }
}

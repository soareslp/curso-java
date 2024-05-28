package br.com.alura.leilao.acceptance.steps;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class licPage {

    public static void alterarFormatoDoArquivo(String caminhoDoArquivo, String nomeDoArquivo, String extensaoOriginal, String novoFormato) {
        try {
            String nomeCompleto = nomeDoArquivo + extensaoOriginal;
            Path arquivoOriginal = FileSystems.getDefault().getPath(caminhoDoArquivo, nomeCompleto);
            System.out.println(arquivoOriginal);

            if (Files.exists(arquivoOriginal)) {
                String novoNomeDoArquivo = nomeDoArquivo + novoFormato;
                Path novoArquivo = arquivoOriginal.resolveSibling(novoNomeDoArquivo);
                Files.move(arquivoOriginal, novoArquivo, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Formato do arquivo alterado com sucesso. Novo caminho: " + novoArquivo.toString());
                System.out.println("Novo nome do arquivo: " + novoNomeDoArquivo);
            } else {
                System.out.println("Arquivo não encontrado no caminho especificado.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

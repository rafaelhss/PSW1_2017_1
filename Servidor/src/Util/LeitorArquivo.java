package Util;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

/**
 * Created by p_8220 on 07/03/2017.
 */
public class LeitorArquivo {

    private static String pastaArquivos = "C:\\Users\\rafael.soares\\Documents\\NetBeansProjects\\ServidorWEb\\PSW1_2017_1-master\\Servidor\\src\\arquivos\\";

    public static String lerArquivo(String nomeArquivo){
        try {
            return new String(readAllBytes(get(pastaArquivos + nomeArquivo)));
        } catch(NoSuchFileException ne) {
        	String erro = ">>>>>  ERRO: Arquivo nao encontrado: " + ne.getMessage();
        	System.out.println(erro);
            return erro;
        } catch (IOException e) {
            //e.printStackTrace();
        	String erro = ">>>>>  ERRO: " + e.getMessage();
        	e.printStackTrace();
        	System.out.println(erro);
            return erro;
        }
    }


}

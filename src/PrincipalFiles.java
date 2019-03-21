/*
 * http://www.generatedata.com/
 * http://www.benjaminkeen.com/open-source-projects/generatedata-com/
 * https://www.devpleno.com/mockaroo/
 * 
 */


import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class PrincipalFiles {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("arquivos/dados.csv");
		
		//LEITURA
		
//		//Files.lines
//		Stream<String> stream = Files.lines(path, StandardCharsets.ISO_8859_1);
//		stream.forEach(System.out::println); 

		
//		//Files.readAllLines
//		List<String> list = Files.readAllLines(path, StandardCharsets.ISO_8859_1);
//		for(String umaLista: list){
//			System.out.println(umaLista);
//		}
		
		
		
//		//Files.readAllBytes
//		byte[] byteArray = Files.readAllBytes(path);
//		System.out.println("Total de Bytes: " + byteArray.length);
//		for(int x=0; x < byteArray.length; x++){
//			//Operação desejada em byte
//		}


		//ESCRITA
		
//		List<String> lista = Arrays.asList("Casa", "Árvore", "Machado", "Etc...");
//		Path pathSaida = Paths.get("arquivos/saida.txt");
//		Files.write(pathSaida, lista, StandardCharsets.UTF_8); //O projeto Eclipse está em UTF8

		
		
	}

}

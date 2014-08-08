package Main.Lexico;

import java.io.*;
import Portugol.lexer.*;
import Portugol.node.*;
import AnaliseLexica.MyLexer;
//import portugol.parser.Parser;
//import portugol.parser.ParserException;

/**
 * Classe de testes
 * @author Gilcley Silva
 *              and 
 *         Jessica silveira
 */
public class MainLexico {

	public static void main(String[] args) throws LexerException, IOException {
		//carrega o arquivo
		File file = new File("C:\\Users\\Jéssica\\workspace\\Compilador\\src\\ArquivosTeste\\t.txt");
		Reader t;
		try {
			for (int i = 0; i < args.length; i++) {
				t = new FileReader(file);//ler o arquivo através de File
				//arq_teste = new FileReader(args[i]); //ler o arquivo atraves de arg[]
				MyLexer lexer = new MyLexer(new PushbackReader(t));

				do {
					Token token = lexer.next();
					String nome = token.getClass().getSimpleName();

					if (!nome.equals("EOF")) {
						nome = nome.substring(1, nome.length());

					}
					if (token instanceof TBlanks) {
						//System.out.print(token.getText());
					} else {
						System.out.print(nome + "\n");
					}
					//caso seja o final do arquivo ele para
					if (token instanceof EOF) {
						break;
					}
				} while (true);
			}
		} catch (LexerException ex) {
			System.out.println(" ERRO lexico !!!");
		}

	}
}


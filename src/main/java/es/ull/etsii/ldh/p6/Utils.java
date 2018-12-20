package es.ull.etsii.ldh.p6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.esotericsoftware.minlog.Log;

/**
 * Contiene funciones varias
 * 
 * @author Sergio Reyes de León
 *
 */
public abstract class Utils {


	/**
	 * Leer fichero de texto
	 * 
	 * @param filename nombre del fichero
	 * @return cadena con el contenido del fichero
	 */
	public static String readFile(String filename) {
		String content = null;
		File file = new File(filename);
		FileReader reader = null;
		try {
			reader = new FileReader(file);
			char[] chars = new char[(int) file.length()];
			reader.read(chars);
			content = new String(chars);
			reader.close();
		} catch (IOException e) {
			Log.trace(e.getMessage());
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				Log.trace(e.getMessage());
			}
		}
		return content;
	}

	/**
	 * Escribir array de String en fichero de texto
	 * 
	 * @param filename nombre del fichero
	 * @param content  array de string
	 */
	public static void writeFile(String filename, String[] content) {
		FileWriter file = null;
		PrintWriter pw = null;
		try {
			file = new FileWriter(filename);
			pw = new PrintWriter(file);

			for (String s : content)
				pw.println(s);

		} catch (Exception e) {
			Log.trace(e.getMessage());
		} finally {
			if (pw != null)
				pw.close();
			try {
				if (file != null)
					file.close();
			} catch (Exception e) {
				Log.trace(e.getMessage());
			}
		}
	}

	
}
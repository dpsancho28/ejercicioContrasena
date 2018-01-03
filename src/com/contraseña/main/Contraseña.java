package com.contrase�a.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contrase�a {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System. in);
		Integer numero;
		Map listaContrase�as = new HashMap<String, Boolean>();
		
		// Solicitamos n�mero de contrase�as
		System.out.println("�Cuantas contrase�as quieres generar?: ");
		
		// Recogemos n�mero de contrase�as
		numero = reader.nextInt();
		
		// Creamos array de contrase�as con el n�mero solicitado
		if (numero != null){
			for (int i=0; i<numero; i++){
				String contrase�a = generarContrase�a();
				Boolean esFuerte = esFuerte(contrase�a);
				listaContrase�as.put(contrase�a, esFuerte);
			}
			System.out.println("...:::Listado Contrase�as:::...");
			System.out.println(listaContrase�as.toString());
		}else{
			System.out.println("N�mero solicitado incorrecto.");
		}			
	}

	private static String generarContrase�a() {
		String contrase�a = "123aB";
		
		return contrase�a;		
	}
	
	public static boolean esFuerte(String contrase�a){
        int cuentanumeros=0;
        int cuentaminusculas=0;
        int cuentamayusculas=0;
        //Vamos caracter a caracter y comprobamos que tipo de caracter es
        for (int i=0;i<contrase�a.length();i++){
        	char caracter = contrase�a.charAt(i);
                if (contrase�a.charAt(i)>=97 && contrase�a.charAt(i)<=122){
                    cuentaminusculas+=1;
                }else{
                    if (contrase�a.charAt(i)>=65 && contrase�a.charAt(i)<=90){
                        cuentamayusculas+=1;
                }else{
                    cuentanumeros+=1;
                    }
                }
            }
            //Si la constrase�a tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
            if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2){
            return true;
        }else{
            return false;
        }
    }
}

package com.contraseña.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contraseña {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System. in);
		Integer numero;
		Map listaContraseñas = new HashMap<String, Boolean>();
		
		// Solicitamos número de contraseñas
		System.out.println("¿Cuantas contraseñas quieres generar?: ");
		
		// Recogemos número de contraseñas
		numero = reader.nextInt();
		
		// Creamos array de contraseñas con el número solicitado
		if (numero != null){
			for (int i=0; i<numero; i++){
				String contraseña = generarContraseña();
				Boolean esFuerte = esFuerte(contraseña);
				listaContraseñas.put(contraseña, esFuerte);
			}
			System.out.println("...:::Listado Contraseñas:::...");
			System.out.println(listaContraseñas.toString());
		}else{
			System.out.println("Número solicitado incorrecto.");
		}			
	}

	private static String generarContraseña() {
		String contraseña = "123aB";
		
		return contraseña;		
	}
	
	public static boolean esFuerte(String contraseña){
        int cuentanumeros=0;
        int cuentaminusculas=0;
        int cuentamayusculas=0;
        //Vamos caracter a caracter y comprobamos que tipo de caracter es
        for (int i=0;i<contraseña.length();i++){
        	char caracter = contraseña.charAt(i);
                if (contraseña.charAt(i)>=97 && contraseña.charAt(i)<=122){
                    cuentaminusculas+=1;
                }else{
                    if (contraseña.charAt(i)>=65 && contraseña.charAt(i)<=90){
                        cuentamayusculas+=1;
                }else{
                    cuentanumeros+=1;
                    }
                }
            }
            //Si la constraseña tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
            if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2){
            return true;
        }else{
            return false;
        }
    }
}

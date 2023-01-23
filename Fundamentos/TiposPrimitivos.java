package Fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informa��es do funcion�rio
		
		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; //L= literal long
		
		// Tipos num�ricos reais
		float salario = 11_445.44F; //F= literal float
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo boleano
		boolean estaDeFerias = false; // true or false
				
		// Tipo caractere
		char status = 'A'; // ativo 'sempre entre aspas simples' 	
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// N�mero de viagens 
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
				
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}

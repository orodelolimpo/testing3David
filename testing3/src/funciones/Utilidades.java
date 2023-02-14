package funciones;

/**
 * Clase de utilidades con diversas funciones
 * @author LYDIA
 *
 */
public class Utilidades {
/**
 * constante estática
 */
	public static final int HORASJORNADA = 38;
	
	/**
	 * método de la clase que devuelve la representación textual de la nota.
	 * @param nota dobule con la nota a comprobar
	 * @return una cadena de tipo String con la calificación resultante (Suspenso, Bien, Notable, Sobresaliente o Matrícula)
	 * 
	 * @throws ArithmeticException cuando la nota no está entre 0 y 10.
	 */
	public String devuelveNota(double nota) {
		String descripcion = "Matrícula";
		
		if (nota<0.0 || nota >10) {
			throw new ArithmeticException("La nota debe estar entre 0.0 y 10");
		} else if (nota<5.0) {
			descripcion="Suspenso";
		} else if (nota <6.5) {
			descripcion = "Bien";
		} else if (nota<8.5) {
			descripcion ="Notable";
		} else if (nota<10) {
			descripcion ="Sobresaliente";
		} else {
			descripcion = "Matrícula";
		}
		return descripcion;
	}
	/**
	 * método de la clase que calcula el salario del empreado en función e las horas y horas extras.Pagando las horas 
	 * normales (hasta {@see HORASJORNADA}
	 * 
	 * @param numHoras int que corresponte al número de horas trabajadas en la jornada

	 * @param precioHoras double que indica el valor o precio del número de horas trabajadas.
	 * @param precioExtras double que indica el valor o precio de las horas extras trabajadas
	 * @return devuelve el cálculo de las horas por su precio y las horas extras por el precio de las horas Extras.
	 * @throws ArithmeticException cuando numHoras, precioHOras o precioExtras son cero o negativo
	 */
	
	public double calculaSalario(int numHoras, double precioHoras, double precioExtras) {
		int extras=0;
		int horas=numHoras;
		
		if (numHoras<=0 ||  precioHoras<=0 ||precioExtras <=0) {
			throw new ArithmeticException("Las horas, y precios de horas normales o Extras deben ser positivo");// esto puede quedase vacío.
		}	
		
		if (numHoras>HORASJORNADA) {
			extras = numHoras-HORASJORNADA;
			horas = HORASJORNADA;
		}
		return horas*precioHoras+extras*precioExtras;	
		
	}
	
	/**
	 * método de la clase que nos da el número de divisiores de un número pasado por parámetro
	 * @param num itn a comprobar
	 * @return int con el número de divisores
	 */
	
	public int cuentaDivisores(int num) {
		int cuenta=0;
		
		for (int i = 1; i <= num; i++) {
			if (num%i==0) {
				cuenta++;
			}
		}
		return cuenta;
	}
	/**
	 * método que devuleve el menor elemento deun array dado como parámetro, por ejemplo un vector[2,3,-1,9] devolvería -1 
	 * @param v[] vector de enteros con los números
	 * @return int con el menor número del vector.
	 */
	public double devuelveMenor(int v[]) {
		double menor=v[0];
		for (int i = 0; i < v.length; i++) {
			if (v[i]< menor) {
				menor=v[i];
			}
		}
		return menor;
	}
	/**método o función que ordena los elementos del vector por el método de la burbuja.
	 * El vector pasado como  parámetro tamibén quedará ordenado.
	 * 
	 * @param v int [] con los datos del vector
	 * @return int[] con todos los elementos del vector ordenados de mayor a menor 
	 */
	public int [] burbuja(int[] v)
    {
      int auxiliar;
      int[] ordenado;
      for(int i = 1; i < v.length; i++)
      {
        for(int j = 0;j < v.length-i;j++)
        {
          if(v[j] > v[j+1])
          {
            auxiliar = v[j];
            v[j] = v[j+1];
            v[j+1] = auxiliar;
          }   
        }
      }
      ordenado = v;
      return ordenado;
    }
}

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Ejercicio3_TestSET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hSet=new HashSet<String>();
		Set<String> lSet=new LinkedHashSet<String>();
		Set<String> tSet=new TreeSet<String>();
		
		long tHSet;
		long tLSet;
		long tTSet;
		
		long ayuda;
		
		ayuda=System.currentTimeMillis();
		for (long i = 0; i < 1000000; i++) {
			String elemento="Elemento "+i;
			hSet.add(elemento);
		}
		tHSet=System.currentTimeMillis()-ayuda;
		
		ayuda=System.currentTimeMillis();
		for (long i = 0; i < 1000000; i++) {
			String elemento="Elemento "+i;
			lSet.add(elemento);
		}
		tLSet=System.currentTimeMillis()-ayuda;
		
		ayuda=System.currentTimeMillis();
		for (long i = 0; i < 1000000; i++) {
			String elemento="Elemento "+i;
			tSet.add(elemento);
		}
		tTSet=System.currentTimeMillis()-ayuda;
		
		System.out.println("HashSet size: "+hSet.size());
		System.out.println("LinkedHashSet size: "+lSet.size());
		System.out.println("TreeSet size: "+tSet.size());
		
		System.out.println("El tiempo para crear un HashSet es: "+tHSet);
		System.out.println("El tiempo para crear un LinkedHashSet es: "+tLSet);
		System.out.println("El tiempo para crear un TreeSet es: "+tTSet);
	}

}

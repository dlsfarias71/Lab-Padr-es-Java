package one.digitalinnovation.gof;


	

	/**
	 * Singleton "apressado".
	 * @author dlsfarias71
	 */
	
public class SingletonEager {
		
		private static SingletonEager instancia;
		 
		private SingletonEager() {
		super();
			
		}
		
		public static SingletonEager getIntancia() {
			if(instancia == null) {
				instancia = new SingletonEager ();
			}
			return instancia;
			
		}

}

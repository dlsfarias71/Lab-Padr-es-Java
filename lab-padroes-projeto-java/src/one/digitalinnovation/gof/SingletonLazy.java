package one.digitalinnovation.gof;


	
	/**
	 * Singleton "preguicoso".
	 * @author dlsfarias71
	 */
	
	public class SingletonLazy{
		
		private static SingletonLazy instancia;
		 
		private SingletonLazy() {
			
		}
		
		public static SingletonLazy getIntancia() {
			if(instancia == null) {
				instancia = new SingletonLazy ();
			}
			return instancia;
			
		}
		

}


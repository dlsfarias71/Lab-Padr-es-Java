package one.digitalinnovation.gof;

/**
 * Singleton "Lazy Holder".
 * 
 * @author dlsfarias71
 */

 public class SingletonLazyHolder {

		
		private static class InstanceHolder{
			public static SingletonLazyHolder instancia = new SingletonLazyHolder();
		}
		 
		private SingletonLazyHolder() {
			super();
	
		}
		
		public static SingletonLazyHolder getIntancia() {
			
			return InstanceHolder.instancia;
			
		}
	

}

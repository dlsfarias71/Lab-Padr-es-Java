package one.digitalinnovation.gof;

import Strategy.ComportamentoAgressivo;
import Strategy.ComportamentoDefensivo;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

public class Test {
	
	//Singleton
	
	public static <Comportamento> void main(String[]args) {
		SingletonLazy lazy = SingletonLazy.getIntancia();
		System.out.println(lazy);
		lazy =SingletonLazy.getIntancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getIntancia();
		System.out.println(eager);
		eager =SingletonEager.getIntancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getIntancia();
		System.out.println(lazyHolder);
		lazyHolder =SingletonLazyHolder.getIntancia();
		System.out.println(lazyHolder);
		
		//Strategy
		
      ComportamentoNormal normal = new ComportamentoNormal();
      ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
      ComportamentoAgressivo agressivo = new  ComportamentoAgressivo();
		
		
  
		
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo  = new Robo();
		robo.setComportamento(defensivo);
		robo.mover();
	    robo = new Robo();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
	}

}

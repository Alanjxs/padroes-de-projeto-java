package padroes.projeto.java;

import padroes.projeto.java.singleton.SingletonEager;
import padroes.projeto.java.singleton.SingletonLazy;
import padroes.projeto.java.singleton.SingletonLazyHolder;
import padroes.projeto.java.strategy.Comportamento;
import padroes.projeto.java.strategy.ComportamentoAgressivo;
import padroes.projeto.java.strategy.ComportamentoDefensivo;
import padroes.projeto.java.strategy.ComportamentoNormal;
import padroes.projeto.java.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * Exemplos do Singleton
		 */
		SingletonLazy obj = SingletonLazy.getInstancia();
		System.out.println(obj);
		obj = SingletonLazy.getInstancia();
		System.out.println(obj);
		
		SingletonEager obj2 = SingletonEager.getInstancia();
		System.out.println(obj2);
		obj2 = SingletonEager.getInstancia();
		System.out.println(obj2);
		
		SingletonLazyHolder obj3 = SingletonLazyHolder.getInstancia();
		System.out.println(obj3);
		obj3 = SingletonLazyHolder.getInstancia();
		System.out.println(obj3);
		
		/*
		 * Exemplos do Strategy
		 */
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();

	

	}

}

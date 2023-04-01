package padroes.projeto.java;

public class Test {

	public static void main(String[] args) {
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

	}

}

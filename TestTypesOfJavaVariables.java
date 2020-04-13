/* This Test Types of Varyables*/ 
class VarEx{

	/* Static Variable */ 
	static	int var1 = 10;
	/* Instanc Varyable */
        	int var2 = 20;

	public static void main(String[] args) {
		/* Run Static Variable */ 
		System.out.println(var1);
		/* Run the Instanc Variable */ 
		VarEx v = new VarEx();
		System.out.println(v.var2);
		/* Try run [Method] Outside [MAIN_Method] */ 
		externalMethod();

	}

	/* External Method */ 
	public static  void externalMethod(){
  		/* local Variable */
		final int var3 = 30;
		System.out.println(var3);
	}
}		

class VarEx2{
	static int var4 = 100;
	public static void main(String[] args) {
		System.out.println(var4);
		/*Run a Instance Variable from other class (which called VarEx class)*/ 
		VarEx v = new VarEx();
		System.out.println(v.var1);
	}
}	

	 

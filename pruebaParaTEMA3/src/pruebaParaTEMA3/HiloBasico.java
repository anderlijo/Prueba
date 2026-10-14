package pruebaParaTEMA3;


public class HiloBasico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Empieza main");
		
		Thread t = new Thread(new  Runnable() {
			
			@Override
			public void run() {
				long tiempoInicial = System.currentTimeMillis();
				
				//codigo 
				
				
				for(int i = 2_00; i >=0; i --) {
					System.out.println("Resta main: "+i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				long tiempoFinal=System.currentTimeMillis();
				System.out.println("tiempo: "+(tiempoFinal- tiempoInicial));
			}
			
		
		});
		t.start();
		
//		for(int i = 0; i <120; i ++) {
//			System.out.println("Suma main: "+i);
//		}
//		
//		
//		
//		System.out.println("Termina main");

	}

}

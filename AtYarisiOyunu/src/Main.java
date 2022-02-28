
public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("\t... At Yarýþý Oyununa Hoþgeldiniz ...");
		int bitiþ = 50 ;
		int haberbatur = 0;
		int tansel = 0 ;
		int mirhat = 0 ;
		int sahbatur = 0 ;
		int cas = 0 ;
		String atIsimleri = "\n"+
							"\tATLAR\n"+
							"1. AT -----> Haberbatur\n"+
							"2. AT -----> Tansel\n"+
							"3. AT -----> Mirhat\n"+
							"4. AT -----> Þahbatur\n"+
							"5. AT -----> Caþ";
		System.out.println(atIsimleri);
		
		while (!(haberbatur >= 50 && tansel >= 50 && mirhat >= 50 && sahbatur >= 50 && cas >= 50)) {
			int[] ilerleme = new int[5];
		    for (int i= 0; i < ilerleme.length; i++) {
		        ilerleme[i] = (int)(Math.random()*16);
		    }
		    	haberbatur += ilerleme [0];
				Thread.sleep(1000);
		    	System.out.println("Haberbatur"+" "+ilerleme[0]+" "+"kadar ilerledi");
		    	tansel += ilerleme [1];
				Thread.sleep(1000);
		    	System.out.println("Tansel"+" "+ilerleme[1]+" "+"kadar ilerledi");

		    	mirhat += ilerleme [2];
				Thread.sleep(1000);
		    	System.out.println("Mirhat"+" "+ilerleme[2]+" "+"kadar ilerledi");

		    	sahbatur += ilerleme [3];
				Thread.sleep(1000);
		    	System.out.println("Þahbatur"+" "+ilerleme[3]+" "+"kadar ilerledi");

		    	cas += ilerleme [4];
				Thread.sleep(1000);
		    	System.out.println("Caþ"+" "+ilerleme[4]+" "+"kadar ilerledi");
		    	
		    	if (haberbatur >= 50) {
					System.out.println("Kazanan at : ");
					Thread.sleep(3000);
					System.out.println("Haberbatur");
					break;
				}
				if (tansel >= 50) {
					System.out.println("Kazanan at : ");
					Thread.sleep(3000);
					System.out.println("Tansel");
					break;
					
				}
				if (mirhat >= 50) {
					System.out.println("Kazanan at : ");
					Thread.sleep(3000);
					System.out.println("Mirhat");
					break;
				}
				if (sahbatur >= 50) {
					System.out.println("Kazanan at : ");
					Thread.sleep(3000);
					System.out.println("Þahbatur");
					break;
				}
				if (cas >= 50) {
					System.out.println("Kazanan at : ");
					Thread.sleep(3000);
					System.out.println("Caþ");
					break;
				}
}
		
	}

}

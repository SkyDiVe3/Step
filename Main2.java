public class Main2{
	public static void main(String[] args) {
		byte value = 5;
		/*1.Compatibil cu int 
		  2.Intevalul byte contine 5 =(-127 -> +128)  */
		int x = 100;
		long value = 300000000L /*Sau -> l */;
		double num = 10.5/*D*/;
		float fl =12.5F /*Se pune F la sfarsit din cauza 
		ca se va socoti double  */

		int sum = 5 + 6 + 8 + 9; 
			
		// +Converssia tipurilor incompatibil
		/* Putem sa fortam java sa ne converteze 
		o valoare fortat*/
		//Indicam in paranteze tipul necesar in fata valorii
		int intValue=257;
		byte fromInt = (byte)intValue;



	}
}	
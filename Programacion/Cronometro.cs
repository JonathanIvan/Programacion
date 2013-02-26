using System;
namespace Practica2
{
	public class Cronometro
	{
		public Cronometro ()
		{
		}
		
		public void inicializar(){
			int h,m,s;
			for (h=0;h<24;h++) {
				for (m=0;m<60;m++) {	
					for (s=0;s<60;s++) {
						Console.WriteLine ("\nH  M  S  \n");
						Console.WriteLine (h+":"+m+":"+s);
						System.Threading.Thread.Sleep(1000);
					    Console.Clear();



					}
				}
			}

	}
	}
}


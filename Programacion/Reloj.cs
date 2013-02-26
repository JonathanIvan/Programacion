using System;
namespace Practica2
{
	public class Reloj
	{
		public Reloj ()
		{
		}
		
		public void inicializar(){

			DateTime fechaActual = DateTime.Now;
			Console.WriteLine("Hora Actual");
			Console.WriteLine(fechaActual.Hour + ":" +
			                  fechaActual.Minute + ":"
			                  + fechaActual.Second);

		}
	}
}


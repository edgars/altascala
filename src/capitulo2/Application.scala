package capitulo2;



object Application {
	
	var veiculo1 = new Veiculo("Ford","Marverick")
    var veiculo2 = new Veiculo(1)
	var veiculo3 = new Esportivo("VOLKS","GOL");
	var veiculo4 = new Ecologico("TOYOTA","ECOCAR");
	
	def main(args: Array[String]) {
		
		Console.println("#############################");
		Console.println(" Scala Tutorial = Capitulo 2     ");
		Console.println("#############################");
		
		Console.println(veiculo1)
		Console.println(veiculo3)
		
		Console.println(veiculo4)
		
		
		veiculo3 .ligar()
		veiculo3.desligar()
		
		veiculo4.carregar("220");
		
	}
}
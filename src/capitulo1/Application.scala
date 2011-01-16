package capitulo1;



object Application {
	
	val veiculo1 : Veiculo = {
		new Esportivo
	}
	
	val veiculo2 : Veiculo = {
		new Caminhao
	}
	
	def main(args: Array[String]) {
		
		Console.println("#############################");
		Console.println("         Scala Tutorial     ");
		Console.println("#############################");
		
		println(veiculo1.toXML);
		println(veiculo2.toXML);
	}
}
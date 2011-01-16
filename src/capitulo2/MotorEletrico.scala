package capitulo2

trait MotorEletrico extends Motor {
	
	val voltagem_220: String = "220"
	val voltagem_110: String = "110"
		
	def carregar(voltagem:String) = {
		
		if (voltagem eq voltagem_220) {
			println("Carregando em 3 segundos...")
			Thread.sleep(3000)
			
		} else {
			println("Carregando em 5 segundos...")
			Thread.sleep(5000)
		}
		
		println("Carregado 100%");
		
	}	
		

}


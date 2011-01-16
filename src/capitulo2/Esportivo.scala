package capitulo2

class Esportivo(marca:String,modelo:String) extends Veiculo(marca,modelo) with Motor {
	
	override var combustivel= "FLEX"
	override var nome="AP"
	
	override def ligar() {
		println( ".... Ligando Motor... wruuuunnnn.....")
	} 
	
	override def desligar(){
		println(".... Motor Desligado")
	}

}
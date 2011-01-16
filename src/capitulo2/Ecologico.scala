package capitulo2

class Ecologico(marca:String,modelo:String) extends Veiculo(marca,modelo) with MotorEletrico {
	
    override var combustivel= "Eletricidade"
	override var nome="BD"
	
	override def ligar() {
		println( ".... Ligando Motor...zuuuuuumuuuuuuuu.....")
	} 
	
	override def desligar(){
		println("....dzzzz  Motor Desligado")
	}

}
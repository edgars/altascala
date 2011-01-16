package capitulo2

class Veiculo(marca:String, modelo:String) {
	
	require(marca!=null && modelo!="NIVA")
	
	def this(marcaId:Integer) = this( {if (marcaId == new Integer(1)) "Ford" else "Not Found"},
			
			                           "Not Specified Model Yet" ) 
		
	override def toString = marca.+(" , ").+(modelo)

}
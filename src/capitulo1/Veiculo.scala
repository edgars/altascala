package capitulo1;

class Veiculo {
	
	val marca : String  = ""  ;
	val modelo :String = ""  ;
    val motor : String = "Motor Geral"  ;
   
    override def toString() : String = {
    	marca + ",  " + modelo +  ", "+ motor;
    }
    
    def toXML(): String = {
    	<veiculo>
    	           <marca>{marca}</marca>
                   <modelo> {modelo}</modelo> 
                   <motor>{motor}</motor>
        </veiculo>
                .toString;
    }
}
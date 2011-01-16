package capitulo1;

import javax.swing._

object HelloSwing extends JFrame( "Scala :::: Frame") 
{    
    def main( args: Array[String] ) = 
    {
       showFrame();
    }
    
    def showFrame() = {
        
    	setSize(400, 300)
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE )
        add( new JLabel( "Bem Vindo A Scala" ) )
        pack()
        setSize(400, 300);
        setVisible( true )
    	
    }

}

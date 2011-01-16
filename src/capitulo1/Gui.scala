package capitulo1

import scala.xml._

//
//
//object Gui extends scala.gui.Application {
//  
//  val mainWindow = new container.Window {
//    
//    val press = new widget.Button {
//      text = "Press me, please"
//      subscribe(this)
//      toplevel eventloop {
//        case this.Click() =>
//          field.text = "Wow! Someone pressed me."
//      }
//    }
//    
//    val say = new widget.Label {
//      text = "I'm here for your information"
//      toplevel eventloop {
//        case press.Click() =>
//          text = "Hey! Button was pressed ;-)"
//      }
//      subscribe(press)
//    }
// 
//    val field = new widget.TextField with behaviour.KeyTracker {
//      trackingKey = true
//      columns = 25
//      subscribe(this)
//      toplevel eventloop {
//        case this.TextChanged() =>
//          Console.println("Text changed")
//      }
//    }
// 
//    subscribe(this, press)
// 
//    toplevel eventloop {
//      case this.Closing() => System.exit(0)
//      case press.Click() =>
//        Console.println("Oho, the button was pressed.")
//    }
//    
//    lay { new Group {
//      object buttonGroup extends Group {
//        beside(press, say)
//        valign(Alignment.Center)
//      }
//      above(buttonGroup, field)
//    }}

//  }
//}
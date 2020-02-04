     'use strict'
class Automobile { 
  run(){
  console.log("speed is 40")
} 
}
class MarutiSuzuki extends Automobile { 
   run(){
       super.run()
       console.log("speed is 50")
   }
   } 

class MS800 extends MarutiSuzuki { 
        run(){
            super.run()
        }
}


 var obj = new MS800()
 obj.run()
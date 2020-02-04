'use strict'
class Shape { 
   constructor(...a) { 
      this.area = a
   }
} 
class Circle extends Shape { 
   constructor(b) {
      super()
      this.b=b 
      console.log("Area of the circle:  "+3.14*b*b) 
   } 
} 
var obj = new Circle(3); 

class rectangle extends Shape { 
   constructor(l,w) {
      super() 
      this.l=l
      this.w=w
      console.log("Area of the rectangle:  "+this.l*this.w )
   } 
} 
var obj1 = new rectangle(1,2); 

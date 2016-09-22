def getRepresentation(x:Int): Int ={
var list = List[Int]()
 x.toBinaryString.split("1").foreach{
  e => list = e.length::list
}
println("Binarna reprezentacja: "+x.toBinaryString)
list.sorted(Ordering[Int].reverse).head
}

def getVal: Int = {
 try{
   println("Prosze wpisac liczbe calkowita")
   readInt
 }catch{
  case e: NumberFormatException => println("Prosze podac wartości typu Int")
  getVal
 }
}


println(getRepresentation(getVal))

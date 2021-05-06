fun main(){
var jane= introduction("Beth",21)
matchine(4)
  matchine(15)
  matchine(20)




}
fun introduction(name: String, age:Int){
  var person=  ("my name is $name and i am $age years old.")
    println(person)


}

fun matchine(age: Int){
  if (age<=6) {
    println("Milk")
  }else if(age<6 && age>15){
    print("fanta")
  }
  else{
    print("cocacola")
  }
}
fun names(){
  var myNames= arrayOf("Beth", "Joyce","jackilin", "Joseph")
  println(myNames.length)

}

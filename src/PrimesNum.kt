
// En este programa puedes ingresar un numero entero y te dirá si es parte del grupo de numeros primos o no
// Los numeros primos son solo divisibles por 1 y por el mismo. ej: 1,2,3,5,7,11,13...etc

fun main(args: Array<String>){

    var num: Int
    var divisor = 0

println("Digite un numero para verificar si es primo")
    print("Numero: ")

    num= readLine()!!.toInt()

    //Numero debe ser mayor que 1

    if(num < 2){
        print("Numero invalido")

    }else{
        for (i in 1..num){
            if((num % i)== 0 ){
                divisor++
            }
        }
        if (divisor==2){
            println("El numero $num es primo")
        }else{
            println("El numero $num no es primo")
        }
    }
}
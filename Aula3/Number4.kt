fun main() {
	val n = readInt("Numero")
	val type = when(n) {
	    in 1 .. Int.MAX_VALUE  -> "positivo"
		0 -> "zero"
		else -> "negativo"
	}
	println("$n é $type")
    println("Bye.")
}
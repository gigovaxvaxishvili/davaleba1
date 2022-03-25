fun main(){
    var r = Point( x = 1, y = 6)
    var r1 = Point( x = 1, y = 6)
    println(r)
    var f1 = Fraction(n=5.0, d= 10.0)
    println(f1)





}

class Point(var x: Int, var y: Int){
    override fun toString(): String {
        return "$x : $y"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point){
            if(x > y)
                return true
        }
        return false
    }





}
class Fraction(n: Double, d: Double) {
    private var numenator: Double = n
    private var denominator: Double = d

    override fun equals(other: Any?): Boolean {
        if (other is Fraction){
            if(numenator * other.denominator / denominator == other.numenator)
                return true
        }
        return false
    }
    override fun toString(): String {
        return "$numenator / $denominator"
    }


}
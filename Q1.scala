class Rational(x:Int,y:Int)
{
    val nume = x
    val deno = y

    def neg = new Rational(-this.nume,this.deno)
    override def toString(): String = nume + "/" + deno
}

object Main extends App
{
    val x = new Rational(5,8).neg
    print(x)
}
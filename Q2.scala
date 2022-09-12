class Rational(x:Int,y:Int)
{
    val nume = x
    val deno = y

    def neg = new Rational(-this.nume,this.deno)
    def +(r1:Rational) = new Rational(this.nume*r1.deno+r1.nume*this.deno,this.deno*r1.deno)
    override def toString(): String = nume + "/" + deno
}

object Main extends App
{
    val r1 = new Rational(3,4)
    val r2 = new Rational(5,8).neg
    val r3 = new Rational(2,7).neg
    val r4 = r1+r2+r3
    print(r4)
}
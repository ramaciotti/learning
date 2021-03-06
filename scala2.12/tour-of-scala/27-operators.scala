object Operators {
  def definingAndUsingOperators(): Unit = {
    case class Vec(val x: Double, val y: Double) {
      def +(that: Vec) = new Vec(this.x + that.x, this.y + that.y)
    }

    val vector1 = Vec(1.0, 1.0)
    val vector2 = Vec(2.0, 2.0)

    val vector3 = vector1 + vector2
    println(vector3)

    case class MyBool(x: Boolean) {
      def and(that: MyBool): MyBool = if (x) that else this
      def or(that: MyBool): MyBool = if (x) this else that
      def negate: MyBool = MyBool(!x)
    }

    def not(x: MyBool) = x.negate
    def xor(x: MyBool, y: MyBool) = (x or y) and not (x and y)
  }

  def main(args: Array[String]): Unit = {
    definingAndUsingOperators()
  }
}

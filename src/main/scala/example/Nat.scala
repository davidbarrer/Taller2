package example
//EJERCICIO 9 Impĺementación de los Nat. Donde el caso base se tiene el Cero y el caso recursivo es el sucesor de un natural

sealed trait Nat
case object Cero extends Nat
case class Suc(nat:Nat) extends Nat

object Nat {
  //EJERCICIO 10 función fromNatToInt que toma un número natural Nat y lo transforma a su valor Int.

  def fromNatToInt(nat:Nat):Int = nat match {
    case Cero => 0
    case Suc(n) => 1 + Nat.fromNatToInt(n)
  }
  //EJERCICIO 11 función fromIntToNat que toma un número entero Int y lo transforma a su valor correspondiente natural.
  def fromIntToNat(int:Int):Nat = int match {
    case 0 => Cero
    case n => Suc(fromIntToNat(n-1))
  }
}

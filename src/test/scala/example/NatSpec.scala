package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class NatSpec extends AnyFlatSpec with Matchers {
   //EJERCICIO 9
  "Nat puede construirse " should "como Cero" in {
    val cero = Cero
    cero shouldEqual Cero
  }
  "Nat puede construirse " should "como uno" in {
    val uno = Suc(Cero)
    uno shouldEqual Suc(Cero)
  }

  "Nat puede construirse" should "como dos" in {
    val dos = Suc(Suc(Cero))
    dos shouldEqual Suc(Suc(Cero))
  }

  //EJERCICIO 10
  "la transformación de Nat a entero" should "debe ser 7 si Suc(Suc(Suc(Suc(Suc(Suc(Suc(Cero)))))))" in {
    val siete = Suc(Suc(Suc(Suc(Suc(Suc(Suc(Cero)))))))
    Nat.fromNatToInt(siete) shouldEqual 7
  }

  "la transformación de Nat a entero" should "debe ser 5 si (Suc(Suc(Suc(Suc(Suc(Cero))))))" in {
    val cinco = (Suc(Suc(Suc(Suc(Suc(Cero))))))
    Nat.fromNatToInt(cinco) shouldEqual 5
  }



  //EJERCICIO 11
  "La transaformación de entero a Nat" should "debe ser Suc(Suc(Suc(Suc(Suc(Suc(Cero)))))) si 6" in {
    Nat.fromIntToNat(6) shouldEqual Suc(Suc(Suc(Suc(Suc(Suc(Cero))))))
  }

  "La transaformación de entero a Nat" should "debe ser (Suc(Suc(Suc(Suc(Cero)))) si 3" in {
    Nat.fromIntToNat(3) shouldEqual (Suc(Suc(Suc(Cero))))
  }

  }

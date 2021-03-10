package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TallerInmutablesSpec extends AnyFlatSpec with Matchers {


  //EJERCICIO 1
  "El resultado de recorrer la lista x " should "deberia ser 9" in {
    List.x shouldEqual 9
  }


  //EJERCICIO 2


  "El resultado de remover el primer valor de una lista (1,2,3,4)" should "debería ser Const(2,Const(3,Const(4,Nil)))" in {
    val list1 = List(1,2,3,4)
    List.tail(Const(2,Const(3,Const(4,Nil)))) shouldEqual Const(3,Const(4,Nil))
  }

  "El resultado de remover el primer valor de una lista (1)" should "debería ser Nil" in {
    val list1 = List(1)
    List.tail(Const(2,Nil)) shouldEqual Nil
  }

  "El resultado de remover el primer valor de una lista (true,false)" should "debería ser Nil" in {
    val list1 = List(true,false)
    List.tail(Const(true,Const(false,Nil))) shouldEqual Const(false,Nil)
  }



  //EJERCICIO 3


  "El resultado de devolver el primer valor de una lista (1,2,3,4)" should "debería ser 1" in {
    val list1 = List(1,2,3,4)
    List.head(list1) shouldEqual 1
  }

  "El resultado de devolver el primer valor de una lista (true,false,false)" should "debería ser true" in {
    val list1 = List(true,false,false)
    List.head(list1) shouldEqual true
  }

  "El resultado de devolver el primer valor de una lista (15.0,12.0,8.0)" should "debería ser 15.0" in {
    val list1 = List(15.0,12.0,8.0)
    List.head(list1) shouldEqual 15.0
  }




  //EJERCICIO 4

  "El resultado de una lista con solo valores verdaderos (trure,true,true)" should "debería de ser true" in {
    val list1 = List(true, true, true)
    List.and(list1) shouldEqual true
  }


  "El resultado de una lista (true, false, true)" should "debería de ser false" in {
    val list1 = List(true, false, true)
    List.and(list1) shouldEqual false
  }

  "El resultado de una lista  (true, true, true, false)" should "debería de ser false" in {
    val list1 = List(true, true, true, false)
    List.and(list1) shouldEqual false
  }


  //EJERCICIO 5


  "El resultado de una lista  (false,true,false)" should "debería de ser false" in {
    val list1 = List(false, false, false)
    List.or(list1) shouldEqual false
  }

  "El resultado de una lista (false, false, true)" should "debería de ser true" in {
    val list1 = List(false, false, true)
    List.or(list1) shouldEqual true
  }


  "El resultado de una lista (false, true, false)" should "debería de ser true" in {
    val list1 = List(false, true, false)
    List.or(list1) shouldEqual true
  }



  //EJERCICIO 6


  "El resultado de una lista con valores (2,8,5,6,8,9)" should "debería de ser 9" in {
    val list1 = List(2,8,5,6,8,9)
    List.max(list1) shouldEqual 9
  }


  "El resultado de una lista con valores (0)" should "debería de ser 0" in {
    val list1 = List(0)
    List.max(list1) shouldEqual 0
  }


  "El resultado de una lista con valores (10,1,1,1)" should "10" in {
    val list1 = List(10,1,1,1)
    List.max(list1) shouldEqual 10
  }




  //EJERCICIO 7

  "El resultado de una lista con valores (9,8,5,6,8,2)" should "debería de ser 2" in {
    val list1 = List(9L,8L,5L,6L,8L,2L)
    List.min(list1) shouldEqual 2L
  }


  "El resultado de una lista con valores (9,8,5,6,8,2)" should "debería de ser 1" in {
    val list1 = List(1L,8L,5L,6L,8L,2L)
    List.min(list1) shouldEqual 1L
  }

  //EJERCICIO 8
  "El resultado de una lista con valores (9.0,8.0,5.0,6.0,8.0,2.0)" should "debería de ser (2.0,9.0)" in {
    val list1 = List(9.0,8.0,5.0,6.0,8.0,2.0)
    List.minMax(list1) shouldBe (2.0,9.0)
  }

  "El resultado de una lista con valores (1.0,8.0,5.0,6.0,8.0,2.0)" should "debería de ser (1.0,8.0)" in {
    val list1 = List(1.0,8.0,5.0,6.0,8.0,2.0)
    List.minMax(list1) shouldBe (1.0,8.0)
  }



  "El resultado de una lista con valores (2.0,8.0,5.0,6.0,8.0,9.0)" should "debería de ser (9.0,2.0)" in {
    val list1 = List(2.0,8.0,5.0,6.0,8.0,9.0)
    List.minMax(list1) shouldBe (2.0,9.0)
  }









}

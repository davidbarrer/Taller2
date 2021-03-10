package example

import scala.annotation.tailrec

sealed trait List [+A]
  case object Nil extends List[Nothing]
  case class Const[+A](h:A,t:List[A]) extends List[A]

  object List {
    // A* seq [A]
    def length[A](lst: List[A]): Int = lst match {
      case Nil => 0
      case Const(h, t) => 1 + length(t)
    }

    def sum(ints: List[Int]): Int = ints match {
      case Nil => 0
      case Const(h, t) => h + sum(t)

    }

    def product(ds: List[Double]): Double = ds match {
      case Nil => 1
      case Const(h, t) => h * product(t)
    }

    def apply[A](as: A*): List[A] = {
      if (as.isEmpty) Nil
      else Const(as.head, apply(as.tail: _*))
    }

    //EJERCICIO2
    //Remueve el primer valor de una lista dada tipo List
    def tail[A](lst: List[A]): List[A] = lst match {
      case Nil => Nil
      case Const(h, t) => t
    }


    //EJERCICIO3 Devuelve el primer valor de una lista tipo List
    def head[A](lst: List[A]): A = lst match {
      case Const(h, t) => h
    }

    //EJERCICIO4 Recibe una lista de booleanos y devuelve true si todos los elementos son verdaderos, de lo contrario devuelve false
    def and(lst: List[Boolean]): Boolean = lst match {
      case Nil => true
      case Const(false, t) => false
      case Const(true, t) => and(t)
    }


    //EJERCICIO5 rercibe una lista de booleanos y devuelve false si todos los elementos son falsos, de lo contrario devuelve true
    def or(lst: List[Boolean]): Boolean = lst match {
      case Nil => false
      case Const(true, t) => true
      case Const(false, t) => or(t)
    }


    //EJERCICIO 6 función que devuelve el mayor valor en una lista de valores tipo Int
    def max(lst: List[Int]): Int = {
      @tailrec
      def maxTemporal(lst: List[Int], max: Int): Int = lst match {
        case Nil => max
        case Const(h, t) => maxTemporal(t, if (h > max) h else max)
      }

      maxTemporal(tail(lst), head(lst)) //Elimina el primer valor de la lista en el primer parametro, y el segundo parametro es el primero de la lista
    }


    //EJERCICIO 7 función que devuelve el mínimo valor en una lista de valores tipo Long
    def min(lst: List[Long]): Long = {
      @tailrec
      def minTemporal(lst: List[Long], min: Long): Long = lst match {
        case Nil => min
        case Const(h, t) => minTemporal(t, if (h < min) h else min)
      }

      minTemporal(tail(lst), head(lst))
    }

    // EJERCICIO 8 DEVUELVO EL MINIMO Y EL MAXIMO DE UNA LISTA DE DOUBLES
    def minMax(lst: List[Double]): (Double, Double) = {
      @tailrec
      def minMaxTemporal(lst: List[Double], min: Double, max: Double): (Double, Double) = lst match {
        case Nil => (min, max)
        case Const(h, t) => minMaxTemporal(t, if (h<min) h else min, if(h>max) h else max)
      }
    minMaxTemporal(tail(lst),head(lst),head(lst))
  }


    //EJERCICIO1

    val x = List(4,5,6,7,8) match {
      case Const(x, Const(5, Const(7, _)))  => x
      case Nil  => 1
      case Const(x, Const(y, Const(6, Const(7, _))))  => x + y
      case Const(h, t)  => h + List.sum(t )
      case _  => 777
    }

    }










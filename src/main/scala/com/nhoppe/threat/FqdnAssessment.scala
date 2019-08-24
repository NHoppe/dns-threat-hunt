package com.nhoppe.threat

import scala.collection.immutable.Map
import scala.math._

object FqdnAssessment {
  def numberOfsubdomains(fqdn:String): Int = {
    fqdn.count(_ == '.')
  }

  def domainLength(fqdn:String): Int = {
    fqdn.length
  }

  def entropy(fqdn:String): Double = {
    fqdn
      .groupBy (character => character)
      .values
      .map(item => item.length.toDouble / fqdn.length )
      .map(p => -p * log10(p) / log10(2))
      .sum
  }

  def numberOfUppercaseLetters(fqdn:String): Int = {
    val listChars:List[Char] = fqdn.toList
    listChars.count(_.isUpper)
  }

  def numberOfLowercaseLetters(fqdn:String): Int = {
    val listChars:List[Char] = fqdn.toList
    listChars.count(_.isLower)
  }

  def hasNonAlphanumeric(fqdn:String): Boolean = {
    val detected: Option[Char] = fqdn.find(c => !(c.isLetterOrDigit || "-.".contains(c)))
    detected match {
      case Some(detected) => true
      case None => false
    }
  }

  def hasPunycode(fqdn:String): Boolean = {
    fqdn.startsWith("xn--")
  }
}

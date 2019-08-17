package com.nhoppe.threat

import scala.collection.immutable.Map

object FqdnAssessment {
  def numberOfsubdomains(fqdn:String): Int = {
    fqdn.count(_ == '.')
  }

  def domainLength(fqdn:String): Int = {
    fqdn.length
  }

  // TODO
  // def entropy = {
  // }

  def letterCase(fqdn:String): Map[String,Int] = {
    val listChars: List[Char] = fqdn.toList
    Map(
      "uppercase" -> listChars.count(_.isUpper),
      "lowercase" -> listChars.count(_.isLower)
    )
  }

  def hasNonAlphanumeric(fqdn:String): Boolean = {
    val detected: Option[Char] = fqdn.find(_.isLetterOrDigit)
    detected match {
      case Some(detected) => true
      case None => false
    }
  }

  def hasPunycode(fqdn:String): Boolean = {
    fqdn.startsWith("xn--")
  }
}

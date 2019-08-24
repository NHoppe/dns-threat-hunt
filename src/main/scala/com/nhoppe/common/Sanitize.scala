package com.nhoppe.common

import java.net.IDN

object Sanitize {
  
  @throws(classOf[IllegalArgumentException])
  def fqdn(fullyQualifiedDomainName:String): String = {
    IDN.toASCII(fullyQualifiedDomainName.replaceFirst("^http[s]?://",""))
  }
}
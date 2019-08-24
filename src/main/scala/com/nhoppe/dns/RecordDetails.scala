package com.nhoppe.dns

import java.net.IDN

// RFC1035
// https://www.ietf.org/rfc/rfc1035.txt

@throws(classOf[IllegalArgumentException])
class RecordDetails(fullyQualifiedDomainName:String, qTypeValue:Int, qClassValue:Int, ttl:Int = -1) {
  val fqdn:String = IDN.toASCII(fullyQualifiedDomainName.replaceFirst("^http[s]?://",""))
  val qtype = Qtype(qTypeValue)
  val qclass = Qclass(qClassValue)

  def getFQDN(): String = {
    fqdn
  }

  def getQTypeValue(): Int = {
    qtype.id
  }

  def getQTypeName(): String = {
    qtype.toString
  }

  def getQClassValue(): Int = {
    qclass.id
  }

  def getQClassName(): String = {
    qclass.toString
  }

  def getTTL(): Int = {
    ttl
  }
}

package com.nhoppe.dns.protocol

import com.nhoppe.common.Sanitize

// RFC1035
// https://www.ietf.org/rfc/rfc1035.txt

@throws(classOf[IllegalArgumentException])
class Query(fullyQualifiedDomainName:String, qTypeValue:Int, qClassValue:Int) {
  val fqdn:String = Sanitize.fqdn(fullyQualifiedDomainName)
  val qtype = QType(qTypeValue)
  val qclass = QClass(qClassValue)

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
}

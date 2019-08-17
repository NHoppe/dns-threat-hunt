package com.nhoppe.dns

import java.net.IDN

// RFC1035
// https://www.ietf.org/rfc/rfc1035.txt

@throws(classOf[IllegalArgumentException])
class RecordDetails(fullyQualifiedDomainName:String, qtype:Qtype.Value, qclass:Qclass.Value, ttl:Option[Int]) {
  val fqdn:String = IDN.toASCII(fullyQualifiedDomainName)

  def getFQDN():String = {
    fqdn
  }

  def getQTYPE():Qtype.Value = {
    qtype
  }

  def getQCLASS():Qclass.Value = {
    qclass
  }

  def getTTL():Int = {
    ttl match {
      case Some(ttl) => ttl
      case None => -1
    }
  }
}

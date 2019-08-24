package com.nhoppe.dns.protocol

// RFC1035
// https://www.ietf.org/rfc/rfc1035.txt

object QClass extends Enumeration {
  type QClass = Value

  val IN = Value(1)
  val CS = Value(2)
  val CH = Value(3)
  val HS = Value(4)
  val ANY = Value(255)
}

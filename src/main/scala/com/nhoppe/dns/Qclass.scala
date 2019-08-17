package com.nhoppe.dns

// RFC1035
// https://www.ietf.org/rfc/rfc1035.txt
object Qclass extends Enumeration {
  type Qclass = Value

  val IN = 1
  val CS = 2
  val CH = 3
  val HS = 4
  val ANY = 255
}

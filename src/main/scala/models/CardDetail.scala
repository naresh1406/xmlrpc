package models

import java.util.Date

import xmlrpc.protocol.XmlrpcProtocol._
import xmlrpc.Xmlrpc._
import xmlrpc.protocol.XmlrpcProtocol

/**
 * Created by ngupta on 7/4/2020 AD.
 */

case class CardDetail(terminalID: String, customerReference: String, trackingNumber: String, transactionID: String, transactionDate: Date, checksum: String)


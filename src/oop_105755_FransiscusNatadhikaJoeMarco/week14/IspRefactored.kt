package oop_105755_FransiscusNatadhikaJoeMarco.week14

interface Printable {
    fun print(doc: String)
}

interface Scannable {
    fun scan(doc: String): String
}

interface Faxable {
    fun fax(doc: String)
}

class ModernSimplePrinter : Printable {
    override fun print(doc: String) = println("Printing securely: $doc")
}

class AllInOnePrinter : Printable, Scannable, Faxable {
    override fun print(doc: String) = println("Printing: $doc")
    override fun scan(doc: String): String = "Scanned: $doc"
    override fun fax(doc: String) = println("Faxing: $doc")
}
class KontoBankowe(var stanKonta: Int) {

  def this(){
    this(0)
  }

  def wplata(kwotaDoWplaty: Int) : Unit = {
    println("Wplacam: " + kwotaDoWplaty)
    stanKonta = stanKonta + kwotaDoWplaty
  }

  def wyplata(kwotaDoWyplaty: Int) : Unit = {
    if (stanKonta > kwotaDoWyplaty){
      println("Wyplacam: " + kwotaDoWyplaty)
      stanKonta = stanKonta - kwotaDoWyplaty
    } else{
      println("Nie wystarczajaca ilosc srodkow na koncie")
    }
  }

}
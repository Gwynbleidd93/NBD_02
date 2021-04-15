abstract class OsobaZad5(val imie: String, val nazwisko: String) {
  def podatek: Double
}


trait Student{
  def podatek: Double = 0
}

trait Nauczyciel extends Pracownik {

  override def podatek: Double = 0.1 * pensja
}

trait Pracownik {
  def pensja: Double
  def podatek: Double = 0.2 * pensja

}

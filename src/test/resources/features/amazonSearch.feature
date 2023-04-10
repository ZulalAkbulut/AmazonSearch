
Feature:Kullanici amazon anasayfasinda arama yapar

  @amazon
  Scenario:kullanici amazonda nutella aratir

    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And kullanici Nutella icerdigini test eder
    And sayfayi kapatir


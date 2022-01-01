## Builder Deseninin Amacı
Builder karmaşık nesnelerin adım adım oluşturulduğu yaratımsal bir tasarım desenidir. Bu desen aynı kurucu kod ile farklı tür ve gösterimdeki nesneleri oluşturmanıza olanak sağlar. Türkçe karlılığı kurucu, inşaatçı vb. tanımlardır.

## Sorun
Adım adım ve zahmetli bir şekilde oluşturulması gereken bir çok alan ve iç içe gemiş nesnelerden oluşan karmaşık bir nesne hayal edin. Bu tür başlatma kodları genellikle çok sayıda parametre bekleyen devasa bir kurucunun için gömülür. Hatta daha da kötüsü böyle bir kurucu olmadan istemci kodun içerisine dağılmış olur.

## Çözüm
Builder deseni nesnenin kurucu kodunu kendine has bir sınıfa dönüştürerek, builder olarak adlandırılan bağımsız nesneleri taşımanızı önerir.

## Kaynakça:
* [https://refactoring.guru/design-patterns/builder](https://refactoring.guru/design-patterns/builder)
* [https://www.journaldev.com/1425/builder-design-pattern-in-java](https://www.journaldev.com/1425/builder-design-pattern-in-java)
* [https://tugrulbayrak.medium.com/builder-pattern-2f6fb1dbf4a0](https://tugrulbayrak.medium.com/builder-pattern-2f6fb1dbf4a0)
* [https://www.youtube.com/watch?v=Gj5CvADlI0g&list=PLLCTYkJ1vsDBaddGpVrRJduqkdi_2rKKN&index=7](https://www.youtube.com/watch?v=Gj5CvADlI0g&list=PLLCTYkJ1vsDBaddGpVrRJduqkdi_2rKKN&index=7)




# Composite Design Pattern

Composite tasarım kalıbı tekil component ve birbirinden farklı componentler grubunun hiyerarşik bir yapıda benzer şekilde hareket etmesini yani kendi içlerinde birbirlerinden farklı olan bir grup nesnenin sanki tek bir bütün nesneymiş gibi kullanılmasını bileşik kalıp sağlar. Bileşik kalıpların görevi, nesneleri bir ağaç yapısında birleştirip uygulamanın genelindeki parça bütün ilişkisini yeniden düzenleyip şekillendirmektir.Peki bu tanımdan anlamamız gereken nedir? Elinizde bir class nesnesi olsun ve bu classın gerçekleştireceği bir fonksiyonalite. Aynı fonksiyonaliteyi bu class nesnelerinin oluşturduğu bir grup da gerçekleştirebilecek olsun ve hatta aynı parenttan türeyen başka class nesnelerinin oluşturduğu bir grup da olabilir ve siz de nesneler grubunun bu fonksiyonaliteyi belli bir düzen içerisinde aynı tekil nesne gibi gerçekleştirmesini istiyorsunuz. İşte bu gibi durumlarda kullanabileceğimiz en uygun tasarım deseni composite tasarım desenidir.

## UML Diyagram

![](https://github.com/furkanyesilyurt/Java-Design-Patterns/blob/main/src/com/furkanyesilyurt/Structural/Composite/uml-diagram.PNG)

## Kaynakça

* [https://refactoring.guru/design-patterns/composite/java/example](https://refactoring.guru/design-patterns/composite/java/example)
* [https://refactoring.guru/design-patterns/composite](https://refactoring.guru/design-patterns/composite)
* [https://www.buraksenyurt.com/post/Tasarc4b1m-Desenleri-Composite](https://www.buraksenyurt.com/post/Tasarc4b1m-Desenleri-Composite)
* [https://www.journaldev.com/1535/composite-design-pattern-in-java](https://www.journaldev.com/1535/composite-design-pattern-in-java)
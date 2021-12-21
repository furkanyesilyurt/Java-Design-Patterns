# Singleton Design Pattern

Bu tasarım örüntüsündeki amaç, bir class’tan sadece bir instance yaratılmasını sağlar. Yani herhangi bir class’tan bir instance yaratılmak istendiğinde, eğer daha önce yaratılmış bir instance yoksa yeni yaratılır. Daha önce yaratılmış ise var olan instance kullanılır.
En yaygın singleton tasarım örüntüsü örneklerinden biri Logger’dır. Bir başka örnek verecek olursak DataSource güzel bir örnektir.

## UML
![https://github.com/furkanyesilyurt/Java-Design-Patterns/blob/main/src/com/furkanyesilyurt/Singleton/singleton-uml.png](https://github.com/furkanyesilyurt/Java-Design-Patterns/blob/main/src/com/furkanyesilyurt/Singleton/singleton-uml.png)


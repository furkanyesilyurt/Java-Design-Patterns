# Proxy Design Pattern

Proxy tasarım deseni, structural grubuna ait oluşturulması karmaşık veya zaman alan işlemlerin kontrolünü sağlar. Dofactory.com a göre kullanım sıklığı %80 civarındadır ve yapı bakımından basittir.

Proxy tasarım deseni çalışma maliyeti yüksek işlemlerin olduğu yapılarda, web servisi kullanılan yapılarda, remoting uygulamalarında, operasyonun gerçekleştirilmesinden önce hazırlık yapılması veya ön işlem yapılması durumlarında kullanılır. Uygulanışı basit bir tasarım desenidir.

Pattern olarak bir objeyi temsil eden başka bir objeden bahsediyoruz.  Kullanım senaryolarından biri için de, bir classımız ve bunun bir nesnesi olduğunu varsayalım. Bu nesne bir okula ait tüm sınıf öğrencilerinin tüm bilgilerini tutuyor olsun. Aldıkları dersleri, derslerden aldıkları puanları, kaldıkları dersleri, isimlerini, soy isimlerini, doğum tarihlerini, ailelerinin isim, soy isim ve kimlik bilgilerini ve her bir işlem yaptığımızda bu okul öğrencilerini bir tur dönüyor ve gerekli bilgileri içerisinde barındırıyor olsun. Ancak bizim client olarak tüm bu bilgilerden ziyade belli başlı sınıfların belli başlı özelliklerine ve bilgilerine ihtiyacımız olabilir. Bu durumda proxy class oluşturup sadece belli başlı metotlara ve üyelere erişim izni verebiliriz ve client bu nesneyi kopyaladığında orjinal nesneyi kopyalamasına kıyasla çok daha az bir maliyet ile işi halletmiş olur.

Proxy tasarım deseninin kullanıldığı birçok durum var. Popüler kullanımları ise:

* Virtual Proxy: Ağır sistem kaynağı kullanan sınıflarda kullanılır. Uygulama başlar başlamaz; sınıfı oluşturmak yerine, sadece ihtiyaç olduğunda hedef sınıfı oluşturur.
* Protection Proxy: Client’ın, sadece belirli durumlarda sınıfı çalıştırması gerekiyorsa uygulanır.
* Logging Proxy: İstenilen belirli işlemlerden önce veya sonra, log göndermek için kullanır.
* Caching Proxy: Sürekli olarak gönderilen aynı tipte isteklerin aynı sonucu geri dönderdiği durumlar kullanılır.
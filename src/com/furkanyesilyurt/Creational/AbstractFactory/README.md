# Abstract Factory Design Pattern
Abstract Factory deseni, aynı anda birden çok nesne ile birlikte işlem yapmak istediğimiz durumlarda kullanabileceğimiz bir tasarım desenidir.

FactoryMethod design pattern'inde üretilecek her nesne için CarCreator isimli class içerisinde if else bloğunu kullanarak hangi class'tan nesne üretilmek istendiğini kontrol ettiğimiz yapı oluşturduk. Bu yapı class sayısı arttığında oldukça karmaşık hale gelecektir. Bu sebeple oluşturulacak her nesne için ayrı bir Factory nesnesi oluşturmak daha temiz kod yazmamıza yardımcı olacaktır.


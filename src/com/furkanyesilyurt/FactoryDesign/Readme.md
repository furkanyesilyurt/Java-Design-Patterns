## Factory Pattern
Gang of Four patternleri günümüz dünyasında en sıkı şekilde takip edilip en çok kullanılan ünlü tasarım desenleridir. Factory pattern'de bu 4 lü den biridir. Kısaca tanımı ; aynı abstract sınıf veya interface'den türeyen nesnelerin üretiminden sorumlu yapıdır. Bu pattern ile nesne yaratılma işini inheritance yoluyla client-side'dan ayırıp sub-classes'lara vermek amaçlanır.

Geliştirmekte olduğunuz uygulamaya yeni bir feature eklerken en az dokunuş ile client'ı bu duruma hiç sokmadan yapabilmek amaçlanır ve factory pattern de bu amaca yönelik olarak önerilen en önemli pattern'lerden birisidir.

Factory pattern 2 alt kategoriye ayrılabilir.
* Factory Method
* Abstract Factory

## Factory Method
Aynı interface'i veya abstract sınıfı implement etmiş etmiş factory nesnelerinin üretiminden sorumlu pattern dir
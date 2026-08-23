# SQL Sorgu Alıştırmaları

Bu hafta SQL sorguları üzerine çalışıyorsunuz. Bugünkü alıştırmada sizin için hazırladığımız veritabanında aşağıda istediğimiz sonuçları elde etmenize yarayan SQL sorgularını oluşturacaksınız.

# Proje Kurulumu
Projeyi forklayın ve clonlayın. Tamamladığınızda da pushlayın.

## Kütüphane Bilgi Sistemi

Bu veritabanı, bir okulun kütüphanesinden öğrencilerin aldıkları kitapların bilgisini barındırmaktadır.
* src -> main -> resources altında `test.sql` adında bir dosya bulacaksınız.
* `test.sql` dosyasını projeye başlamadan önce kendi veritabanınızda MUTLAKA ÇALIŞTIRMALISINIZ.
* `application.properties` dosyasında `spring.datasource.username` karşısına veritabanını bağlanmak için kullandığınız kullanıcı ismini MUTLAKA GİRİNİZ.
* `application.properties` dosyasında `spring.datasource.password` karşısına veritabanını bağlanmak için kullandığınız şifreyi MUTLAKA GİRİNİZ.


#Tablolar
`ogrenci` tablosu öğrencilerin listesini tutar.
`islem` tablosu öğrencilerin kütüphaneden aldıkları kitapların bilgilerini tutar
`kitap` tablosu kütüphanedeki kitapların bilgisini tutar
`yazar` tablosu kitapların yazarları bilgisini tutar
`tur` tablosu kitapların türlerini tutar.

Tablo ilişiklerini görmek için [ktphn.png] dosyasına göz atın.

Yazdığınız sorguları buradan test edebilirsiniz: [https://ergineer.com/assets/materials/fkg36so5-kutuphanebilgisistemi-sql/] (update, delete, drop sorguları iptal edilmiştir).

### Görevler

Aşağıda istenilen sonuçlara ulaşabilmek için gerekli SQL sorgularını yazmaya çalışacağız.
İlgili sqlleri `OgrenciRepository` sınıfı altında tanımlanan `QUESTION` stringlerinin karşısına yazınız.
* 1. soru için sql sonucunu `OgrenciRepository` sınıfının içerisindeki `QUESTION_1` stringinin içerisine yazınız.


	1) Öğrenci tablosundaki tüm kayıtları listeleyin.

	
	2) Öğrenci tablosundaki kız öğrencileri listeleyin.
	
	
	3) Öğrenci tablosunda kaydı bulunan sınıfların adını her sınıf bir kez görüntülenecek şekilde listeleyiniz. 
	
	
	4) Öğrenci tablosunda, 10A sınıfında olan kız öğrencileri listeleyiniz.
	
	
	5) Öğrenci numarası 5 ile 10 arasında olan Kız öğrencileri listeleyiniz.
	
	
	6)  Öğrencileri adına göre sıralayınız (alfabetik)
	
	
	7) 10A sınıfındaki öğrencileri okul numarasına göre azalan olarak sıralayınız.
	
	
	8) Öğrenciler tablosundaki en genç öğrenciyi listeleyiniz.
	
	
	9) Öğrenciler tablosundaki en yaşlı öğrenciyi listeleyiniz.
	
	
	10) İkinci harfi E olan ogrencileri listeleyiniz.


### ⚠️ Skorun NextGen'e Kaydedilmediyse

Eğer testleri çalıştırdığın halde skorun NextGen'e kaydedilmediyse, önce fork'unun güncel olup olmadığını kontrol et:

1. GitHub reponu aç.
2. Repo **X commit ahead** ve **X commits behind** şeklinde bir uyarı gösteriyorsa, branch'in güncel değildir.
3. **Sync fork → Update branch** adımlarını uygula.
4. Ardından localinde şu komutu çalıştır:

```bash
   git pull
```

5. Testleri tekrar çalıştır. Bu adımdan sonra skorun güncellenmiş olacaktır.

> **Not:** Bu kontrolü yapmadan tekrar tekrar test çalıştırmak sorunu çözmez; sorunun kaynağı genellikle fork'un upstream repository ile senkron olmamasıdır.

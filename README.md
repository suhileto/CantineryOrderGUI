# CantineryOrderGUI
This is a Cantinery Ordering System with GUI created in NetBeans IDE

Uygulamada 3 adet class oluşturdum.Bunlardan ilki kantinform class’ı ile kullanıcı arayüzü olarak bir form oluşturdum. Forma TextField ve TextArea lar ekledim. Bunlar Sipariş için kullanıcı tarafından girilecek adet sayısını temsil edecek. Daha sonra oluşturduğum Hesapla butonu ile girilen adetleri ürünün fiyatı ile çarpıp toplam ödenecek fiyatı buldum.Öde butonu ile kullanıcının TextFielda girdiği parayı toplamfiyattan çıkarıp para üstünü buldum ve onu başka bir textfield olarak para üstü adı altında kullanıcı karşısına getirdim.

Toplam ödenecek fiyatı ara toplam ve kdv olarak belirlediğim değişken ile toplanmış geneltoplam olarak belirledim. Bunları Kantin classında tuttum.Böylece kullanıcı adet fiyatı girdiği zaman toplam fiyatı boş olan textfieldlardan görebilecek ve ne kadar ödemesi gerektiğini bilecek. Boş olan textField'ın üstünde bulunan para üstü labelı sayesinde kullanıcı o textfielda ödeyeceği parayı girecek ve öde butonuna tıkladığında para üstünü ve sipariş fişini görebilecektir. Sipariş fişini kantinformda oluşturduğum ArrayList sayesinde görebilecek. Eğer kullanıcı toplam tutardan daha az bir ödeme yaparsa hata yazısı textareadan kullanıcı karşısına çıkacaktır.

Ana bir class olan Kantin classında bütün kantine ait olan ürünleri ve fiyatlarını hem string hem double olarak tanımladım. Formdan gelecek adet bilgisi sayesinde classtan toplam fiyatı bulup tekrar forma iletecek.Super class olarak tanımladığım için ürünlerin get ve set fonksiyonlarını oluşturdum. Override olarak tekrar kantinaltsinifta Kantin sınıfında çağırdığım fonksiyonu çağırdım. Bu şekilde fonksiyon aynı parametre ile iki kere çağırılmış oldu. 

![](uml/kantinuml.png)

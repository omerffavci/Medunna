Feature: US_005 Hastalar (patients), hastahaneden randevu (Appointment) oluşturabilmelidir.

  #Background: Anasayfa Make an Appointment Test

  Scenario Outline: TC_01 Kullanıcının herhangi bir karakter içeren "First Name" yazması gerekir ve boş bırakılamaz.
    Given Kullanici  "medunnaUrl" anasayfaya gider
    Then Make an Appointment sekmesine tiklar
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    #And "Appointment registration saved!" onay mesajini gorur.


    Examples:
      | FirstName | LastName | SSN         | Email              | Phone        | AppointmentDate |
      | Ruhi      | Cikar    | 585-58-5858 | ruhidayi@gmail.com | 111-123-4444 | 05.02.2024        |


  Scenario Outline: TC_02 Kullanıcının herhangi bir karakter içeren "First Name" yazması gerekir ve boş bırakılamaz.
    Given Kullanici  "medunnaUrl" anasayfaya gider
    Then Make an Appointment sekmesine tiklar

    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    #And "Your FirstName is required." hata mesajini gorur.  //div[text()='Your FirstName is required.']

    Examples:
      | FirstName | LastName | SSN         | Email              | Phone        | AppointmentDate |
      |           | Cikar    | 585-58-5858 | ruhidayi@gmail.com | 111-123-4444 | 05.02.2024        |



  Scenario Outline: TC_03 Kullanıcı SSN numarası girmeli (kayıtlı SSN) boş bırakılamaz.
    Given Kullanici  "medunnaUrl" anasayfaya gider
    Then Make an Appointment sekmesine tiklar

    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    #And "Your SSN is required." hata mesajini gorur. //div[text()='Your SSN is required.']  //div[text()='Your email is required.']

    Examples:
      | FirstName | LastName | SSN         | Email              | Phone        | AppointmentDate |
      | Ruhi      | Cikar    |             | ruhidayi@gmail.com | 111-123-4444 | 05.02.2024        |

  Scenario Outline: TC_4 Kullanıcı, 3. ve 6. rakamdan sonra "-" olan 10 rakamlı telefon numarasını girmeli, boş bırakılamaz.
    Given Kullanici  "medunnaUrl" anasayfaya gider
    Then Make an Appointment sekmesine tiklar

    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    #And "Phone number is invalid" hata mesajini gorur.

    Examples:
      | FirstName | LastName | SSN         | Email              | Phone        | AppointmentDate |
      | Ruhi      | Cikar    | 585-58-5858 | ruhidayi@gmail.com | 1111234444 | 05.02.2024        |

   Scenario:TC_5 Kullanici Register olup Siteye girebilmeli ve Randevularini görebilmeli
     Given Kullanici  "medunnaUrl" anasayfaya gider
     And Kullanici sign in butonuna tiklar
     And Kullanici giris bilgilerini eksiksiz doldurur
     And kullanici randevularini görür

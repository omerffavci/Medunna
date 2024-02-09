
Feature: US01 Registration yapilir
  Background: Register sayfasi acilir
    Given Kullanici "https://www.medunna.com/" ye giderr
    Given Kullanici account menüsüne tiklarr
    Then Kullanici register butonuna tiklarr

  Scenario: TC02 Admin gecersiz SSN girer ve kayit olamaz
    Then Kullanici SSN disinda bütün bilgileri eksiksiz doldururr
    Given Kullanici SSN olarak "254876585" girerr
    And Kullanici "Your SSN is invalid" yazisini görürr

  Scenario: TC03 Admin gecersiz SSN girer ve kayit olamaz
    Then Kullanici SSN disinda bütün bilgileri eksiksiz doldururr
    Given Kullanici SSN olarak "458-85-458" girerr
    And Kullanici "Your SSN is invalid" yazisini görürr

  Scenario: TC04 Admin gecersiz SSN girer ve kayit olamaz
    Then Kullanici SSN disinda bütün bilgileri eksiksiz doldururr
    Given Kullanici SSN olarak "145-00-0000" girerr
    And Kullanici "Your SSN is invalid" yazisini görürr

  Scenario: TC05 Admin gecersiz SSN girer ve kayit olamaz
    Then Kullanici SSN disinda bütün bilgileri eksiksiz doldururr
    Given Kullanici SSN olarak "" girerr
    And Kullanici "Your SSN is required." yazisini görürrr

  Scenario: TC06 Admin gecersiz SSN girer ve kayit olamaz
    Then Kullanici Firstname disinda bütün bilgileri eksiksiz doldururr
    And Kullanici Your FirstName is required. yazisini görürr

  Scenario: TC07 Admin gecersiz SSN girer ve kayit olamaz
    Then Kullanici LastName disinda bütün bilgileri eksiksiz doldururr
    And Kullanici Your LastName is required. yazisini görürr

  Scenario: TC01 Admin Register'a basarili kayit yapar yaparr
    Then Kullanici bütün bilgileri eksiksiz doldururr
    And "Registration Saved" yazisini görürr




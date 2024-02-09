
Feature: US02 Registration yapilir
  Background: Register sayfasi acilir
    Given Kullanici "https://www.medunna.com/" ye giderr
    Given Kullanici account menüsüne tiklarr
    Then Kullanici register butonuna tiklarr

  Scenario: TC02 Admin Username girmez ve kayit olamaz
    Then Kullanici Username disinda bütün bilgileri eksiksiz doldururr
    And Kullanici "Your username is required." yazisinii görürr

  Scenario: TC03 Admin hatali Email girer ve kayit olamaz
    Then Kullanici Email disinda bütün bilgileri eksiksiz doldururr
    Given Kullanici Email olarak "mehmeyılmaz.com" ifadesini girerr
    And Kullanici "This field is invalid" yazisinii dogrularr

  Scenario: TC04 Admin Email girmez ve kayit olamaz
    Then Kullanici Email disinda bütün bilgileri eksiksiz doldururr
    And Kullanici Your email is required. yazisinii dogrularr




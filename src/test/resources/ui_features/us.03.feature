@UI
Feature: US03 Registration yapilir
  Background: Register sayfasi acilir
    Given Kullanici "https://www.medunna.com/" ye giderr
    Given Kullanici account menüsüne tiklarr
    Then Kullanici register butonuna tiklarr

  Scenario: TC01 Admin sifre girer ve seviyesini görüntüler
    Then Kullanici pssword disinda bütün bilgileri eksiksiz doldururr
    Given Kullanici password olarak "abcdefg" girerr
    And Kullanici passwordun zayif oldugunu görürr

  Scenario: TC02 Admin sifre girer ve seviyesini görüntüler
    Then Kullanici pssword disinda bütün bilgileri eksiksiz doldururr
    Given Kullanici password olarak "a123456" ifadesini girerr
    And Kullanici passwordun seviyesini zayif olarak görürr

  Scenario: TC03 Admin sifre girer ve seviyesini görüntüler
    Then Kullanici pssword disinda bütün bilgileri eksiksiz doldururr
    Given Kullanici password olarak "aA12345" ifadesinii girerr
    And Kullanici passwordun seviyesini güclü olarak görürr

  Scenario: TC04 Admin sifre girer ve seviyesini görüntüler
    Then Kullanici pssword disinda bütün bilgileri eksiksiz doldururr
    Given Kullanici password olarak "aA*1234" ifadesin girerr
    And Kullanici passwordun seviyesini en güclü olarak görürr

@UI
Feature: US01 Basarili bir Registration yapilir
  Background: Register sayfasi acilir
    Given Kullanici "https://www.medunna.com/" ye giderr
    Given Kullanici account menüsüne tiklarr
    Then Kullanici register butonuna tiklarr

  Scenario: TC01 Admin Register'a basarili kayit yapar yaparr
    Then Kullanici bütün bilgileri eksiksiz doldururr
    And "Registration Saved" yazisini görürr





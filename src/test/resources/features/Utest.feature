# Autor: XXXXXXXX

@stories
Feature: Utest
  As a user, I want automate in screamplay the register of the Largest Community of Testers in the World
  @scenario1
  Scenario: I do a technical challenge in choucair
    Given Emmanuel wants to overcome the technical challenge to work at Choucair they try to automate the registration
      | strFirstName  | strLastName | strEmailAddress | strMonthOfBirth | strDayOfBirth | strYearOfBirth | strLanguages | strCity | strPostalCode | strCountry | strComputer | strVersion | strIdiom | strYourMobileDevice | strModel | strOperatingSystem | strPassword | strPasswordConfirm |
      | TuNombre      | TuApellido  | TuCorreo        | TuMesNacimiento | TuDiaNacimiento | TuAñoNacimiento | TuIdioma | TuCiudad | TuCodigoPostal | TuPais    | TuComputador | TuVersion | TuLenguaje | TuMarcaCelular       | TuModeloCelular | TuSistemaOperativo | TuContraseña | TuConfirmacionContraseña |
    When He tries to automate the registration in Utest
      |btnComplete   |
      |Utest |
    Then manage to register in Utest
      | btnComplete              |
      |Utest   |
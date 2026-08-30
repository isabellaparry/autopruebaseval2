# Automatización de Pruebas

## Descripción

Este proyecto fue desarrollado para aplicar los contenidos de automatización de pruebas, control de versiones, integración continua, BDD y pruebas de rendimiento.

Se utilizó Java como lenguaje principal, Maven para la gestión del proyecto, JUnit para pruebas unitarias, Cucumber para BDD, GitHub Actions para integración continua y JMeter para pruebas básicas de performance.

---

## Tecnologías utilizadas

- Java 17
- Maven
- JUnit 5
- Cucumber
- Git y GitHub
- GitHub Actions
- Apache JMeter
- Visual Studio Code

---

## Estructura del proyecto

```text
automatizacion-pruebas/
├── .github/
│   └── workflows/
│       └── ci.yml
├── docs/
│   ├── three-amigos.md
│   └── dashboard.md
├── performance/
│   └── prueba-performance.jmx
├── src/
│   ├── main/java/cl/iplacex/
│   │   ├── Calculadora.java
│   │   └── LoginService.java
│   └── test/
│       ├── java/cl/iplacex/
│       │   ├── CalculadoraTest.java
│       │   ├── RunCucumberTest.java
│       │   └── steps/LoginSteps.java
│       └── resources/features/
│           └── login.feature
├── .gitignore
├── pom.xml
└── README.md
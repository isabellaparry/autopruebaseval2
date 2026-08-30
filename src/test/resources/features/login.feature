# language: es

Característica: Inicio de sesión

  Como usuario registrado
  Quiero iniciar sesión en el sistema
  Para acceder a las funcionalidades disponibles

  Escenario: Inicio de sesión exitoso
    Dado que existe un usuario registrado
    Cuando ingresa el correo "usuario@test.cl" y la contraseña "1234"
    Entonces el acceso debe ser "permitido"

  Esquema del escenario: Validar diferentes credenciales
    Dado que existe un usuario registrado
    Cuando ingresa el correo "<correo>" y la contraseña "<password>"
    Entonces el acceso debe ser "<resultado>"

    Ejemplos:
      | correo               | password   | resultado |
      | usuario@test.cl      | 1234       | permitido |
      | usuario@test.cl      | incorrecta | rechazado |
      | desconocido@test.cl  | 1234       | rechazado |
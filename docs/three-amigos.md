# Sesión Three Amigos

## Funcionalidad analizada

Inicio de sesión de usuario.

## Participantes

| Rol | Responsabilidad |
|---|---|
| Negocio / Product Owner | Define el comportamiento esperado de la funcionalidad |
| QA | Identifica escenarios, criterios de aceptación y casos alternativos |
| Desarrollo | Evalúa la implementación técnica de los comportamientos |

## Criterios de aceptación

### CA-01
Un usuario registrado que ingrese sus credenciales correctas debe obtener acceso.

### CA-02
Un usuario que ingrese una contraseña incorrecta debe ser rechazado.

### CA-03
Un usuario desconocido debe ser rechazado.

## Ejemplos discutidos

| Correo | Contraseña | Resultado esperado |
|---|---|---|
| usuario@test.cl | 1234 | permitido |
| usuario@test.cl | incorrecta | rechazado |
| desconocido@test.cl | 1234 | rechazado |
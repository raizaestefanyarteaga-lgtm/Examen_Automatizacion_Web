#language: es
@testfeature
Característica: Login
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items

  @test
  Esquema del escenario: Iniciar sesión
    Dado que me encuentro en la página de login de Saucedemo
    Cuando inicio sesión con las credenciales usuario: "<Usuario>" y contraseña: "<Password>"
    Entonces valido que debería aparecer el título de "<Titulo>"
    #Y también valido que al menos exista un item
    Y también navego a categoria y subcategoria
    Y también agregar carrito

    Ejemplos:
    |Usuario|Password|Titulo|
    |raizaestefanyarteaga@gmail.com|ermenegyldA|CLOTHES|

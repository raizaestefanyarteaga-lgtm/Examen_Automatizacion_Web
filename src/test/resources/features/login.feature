#language: es
@testfeature
Característica: Login
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items

  @test
  Esquema del escenario: Iniciar sesión
    Dado estoy en la página de la tienda
    Cuando me logueo con mi usuario "<Usuario>" y clave "<Password>"
    Entonces valido que debería aparecer el título de "<Titulo>"
    #Y también valido que al menos exista un item
    Y navego a la categoria Clothes y subcategoria Men
    Y agrego 2 unidades del primer producto al carrito


    Ejemplos:
    |Usuario|Password|Titulo|
    |raizaestefanyarteaga@gmail.com|ermenegyldA|CLOTHES|
    |raizaestefanyarteaga@gmail.com|XXX|CLOTHES|

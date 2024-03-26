# Examen Acceso a Datos Curso 23-24 (Marzo)

## Aviso Importante

Tal como se indica en la programación didáctica del módulo, para aprobar se necesita superar todos
los objetivos.

Los objetivos están agrupados en:

1. SharedPreferences.
2. Base de datos: ROOM.
3. Firebase (Realtime).
4. Gestión de fuentes de datos: LocalDataSource y RemoteDataSource.
5. Repositorio.

## Requisitos para la realización de la prueba

- La prueba tiene una duración de 3 horas. Una vez terminada la prueba, se quitarán los privilegios
  al usuario para evitar modificaciones.
- La prueba se entrega a través de una Pull Request por cada uno de los ejercicios solicitados. Si
  no se entrega una Pull Request se considerará no apta.
- En la Pull Request pondrá como revisor al profesor.
- **No se hará nada de Interfaz de Usuario** todo lo que se pida se deberá mostrar por la
  terminal/consola.
- No hará falta crear casos de uso, el alumno puede trabajar directamente con los repositorios en la
  Activity.
- Todas las llamadas a los repositorios se harán en el MainActivity.
- La capa de datos la cual es objetivo de este módulo deberá desarrollarse respetando las guías de
  Clean Architecture vista en clase.

Si se incumple algunos de los requisitos descritos la prueba o se usan medios no permitidos se
considerará como **NO APTA**.

## Ejercicio 1: SharedPreferences

Una aplicación tiene un login donde se solicita al usuario para su acceso un **email** y una **
contraseña**. Las premisas a cumplir son:

1. Añadir las librerías que se crean oportunas. (Gson ya está añadida)
2. El alumno debe escoger la mejor forma de almacenar la información que se solicite siempre usando
   una modalidad de SharedPreferences.
3. La feature con la que se trabajará será con login.
4. El usuario y contraseña se meten a mano desde la actividad (hay un ejemplo en MainActivity).
5. Al iniciarse, si no existe datos de login, se almacenarán en local.
6. Al iniciarse, si existen datos del login, no se almacenan y se visualizan por consola.
7. Al pulsar el botón "Eliminar" se elimina los datos del login.
8. Esto se podrá ejecutar todas las veces que se quieran y el comportamiento deberá ser el mismo.
9. En la PR adjuntar captura del fichero XML.

## Ejercicio 2: Bases de Datos Room

Se pide desarrollar una aplicación que obtenga un listado de animales desde remoto y se guarde en
una caché local (Room) para no acceder siempre a remoto. Las premisas a cumplir son:

1. Añadir las dependencias necesarias para trabajar con Room.
2. La primera vez que se ejecuta la aplicación, se pedirán los datos a remoto.
3. La segunda vez y posteriores, los datos a devolver serán de local.
4. El listado de animales se visualizará por consola.
5. La caché se hará con Room. **No es una caché TTL, no hace falta añadir tiempo**
6. Si se pulsa el botón: Eliminar datos de Animales, se eliminarán los datos de local.
7. Al volver a iniciar la app, se hará lo indicado en el paso 1.
8. Se pide recuperar un único animal. El animal a recuperar puede ser cualquiera. El código está en
   MainActivity.
9. Añadir captura de la base de datos obtenida a través del IDE.

## Ejercicio 3: Firebase

Se pide desarrollar una aplicación que recupere un listado de ofertas (id, description, title) de
una base de datos distribuida (Firebase Realtime). Las premisas a cumplir son:

1. Añadir las dependencias necesarias para trabajar con Realtime Database.
2. Configurar Firebase para poder trabajar con Realtime Database.
3. Al ejecutarse la aplicación obtendrá el listado de ofertas desde firebase.
4. Se deberán mostrar los datos en la terminal.
5. **No hay que guardar nada en local**. Siempre se obtendrán los datos desde remoto.

**Nota:** hay que adjuntar una captura de imágen de la base de datos realiza en Firebase.

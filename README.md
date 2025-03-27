# # 1.3-Sprint1-S1.03
S1.03. Java Collections


📄 Descripción.

Nivel 1
- Ejercicio 1
Crea una clase llamada Month con un atributo "name" (que almacenará el nombre del mes del año). Añade 11 objetos Month (cada uno con su atributo diferente) en un ArrayList, a excepción del objeto con atributo "Agost". Después, efectúa la inserción en el lugar que corresponde a este mes y demuestra que el ArrayList mantiene el orden correcto.

Convierte el ArrayList del ejercicio anterior en un HashSet y asegúrate que no permite duplicados.

Recorre la lista con un for y con un iterador.

- Ejercicio 2
Crea y rellena un List<Integer>.

Crea un segundo List<Integer> e inserta en la segunda lista los elementos de la primera en orden inverso.

Emplea los objetos ListIterator para leer los elementos de la primera lista e insertarlos en la segunda.

- Ejercicio 3
Dado el fichero countrties.txt (revisa el apartado recursos) que contiene países y capitales. El programa tiene que leer el fichero y guardar los datos en un HashMap<String, String>. El programa pide el nombre del usuario/aria, y después tiene que mostrar un país de forma aleatoria, guardado en el HashMap. Se trata que el usuario/aria tiene que escribir el nombre de la capital del país en cuestión. Si lo acierta se le suma un punto. Esta acción se repite 10 veces. Una vez pedidas las capitales de 10 países de forma aleatoria, entonces se tiene que guardar en un fichero llamado classificacio.txt, el nombre del usuario/aria y su puntuación.

Nivel 2
- Ejercicio 1
Crea una clase llamada Restaurando con dos atributos: nombre(String) y puntuación(int). Implementa los métodos necesarios porque no se puedan introducir objetos Restaurando con el mismo nombre y la misma puntuación en un HashSet creado en el main() de la aplicación.

Puede haber restaurantes con el mismo nombre con diferente puntuación, pero no puede haber restaurantes con el mismo nombre y la misma puntuación.

- Ejercicio 2
Utilizando la clase del programa anterior, crea la implementación necesaria porque los objetos de la clase Restaurando estén ordenados por nombre y por puntuación en orden descendente.

💻 Tecnologías Utilizadas

Java
Git
Gituhub

📋 Requisitos

IDE eclipse o intellj
GitHub

🛠️ Instalación

Clona este repositorio: -> git clone
Accede al directorio del proyecto: S1.01 Herencia y Polimorfismo
Instala las dependencias: npm install …

▶️ Ejecución

Configura la base de datos a config/*database.js.
Ejecuta el servidor: npm start

🌐 Despliegue

Prepara el entorno de producción.
Sube los archivos del proyecto al IDE.


🤝 Contribuciones

Las contribuciones son bienvenidas! Por favor, sigue los siguientes pasos para contribuir:

Has un fork del repositorio
Crea una nueva rama git checkout -b feature/*NovaFuncionalitat
has tus cambios y commiteja'*ls: git commit -m 'Añade Nueva Funcionalidad'
Sube los cambios a tu rama: git push origin feature/*NovaFuncionalitat
has un pull request


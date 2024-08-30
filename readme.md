@RestCotroller
@RequestMapping("item")
@Autowired

## Verbs

- **GET**: Recibe datos del servidor.
- **POST**: Envía datos al servidor para crear un nuevo recurso.
- **PUT**: Actualiza un recurso existente en el servidor.
- **DELETE**: Elimina un recurso existente en el servidor.
- **PATCH**: Actualiza parcialmente un recurso en el servidor.
- **HEAD**: Similar a GET pero sin el cuerpo de la respuesta.

## Anotaciones

- **@RestController**: Marca la clase como un controlador donde cada método retorna un objeto de dominio en lugar de una vista.
- **@RequestMapping("item")**: Define la URL base para todas las rutas en el controlador.
- **@Autowired**: Permite inyectar dependencias automáticamente.

## GroceryItem Class

- **Método `toString()`**: Retorna una representación en cadena de los atributos del objeto.
- **@Override**: Indica que un método en una subclase está sobrescribiendo un método de la superclase.

INSERT POST:
![image](https://github.com/user-attachments/assets/0feba774-323d-4f34-9129-ffc562bc190f)

GETALL GET:
![image](https://github.com/user-attachments/assets/95c739a9-cb5a-4412-b0e8-fba52ab3eda0)


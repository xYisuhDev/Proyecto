# Contribuir al proyecto

Gracias por colaborar en este proyecto de Java sobre pedidos, clientes y productos.

## Objetivo

Este repositorio tiene dos versiones del mismo ejercicio:

- `Ingenieria-directa`: código generado siguiendo el UML.
- `Ingenieria-inversa`: versión reconstruida a partir del diagrama.

Las contribuciones deben mantener ambas versiones consistentes cuando el cambio afecte a la lógica compartida.

## Requisitos previos

- Java JDK 11 o superior.
- Git instalado.
- Un editor o IDE compatible con Java.
- Acceso a un repositorio remoto si quieres enviar cambios.

## Flujo de trabajo

1. Haz fork o clona el repositorio.
2. Crea una rama nueva para tu cambio:

```bash
git checkout -b feature/nombre-del-cambio
```

3. Realiza los cambios con mensajes claros y código legible.
4. Comprueba que el proyecto sigue compilando.
5. Haz commit con un mensaje descriptivo.
6. Abre un Pull Request explicando qué has cambiado y por qué.

## Estilo de código

- Usa nombres descriptivos para clases, métodos y variables.
- Mantén la estructura Java clásica: clases, atributos y métodos bien organizados.
- Haz cambios pequeños y específicos.
- No añadas funcionalidades no relacionadas con el objetivo del ejercicio.
- Si modificas la lógica de negocio, comenta lo necesario para que el código sea fácil de entender.

## Verificación antes de enviar cambios

Antes de abrir un Pull Request, comprueba que el proyecto compila con Java.

Ejemplo:

```powershell
javac Ingenieria-inversa\src\main\java\*.java
java -cp Ingenieria-inversa\src\main\java Main
```

Si tu cambio afecta a la versión directa, repite la comprobación en esa carpeta también.

## Convenciones para commits

Usa mensajes claros y cortos, por ejemplo:

- `feat: añadir validación de cliente`
- `fix: corregir cálculo total del pedido`
- `refactor: reorganizar clases de producto`
- `docs: actualizar instrucciones de uso`

## Pull Requests

En la descripción del PR incluye:

- Qué problema resuelves.
- Qué archivos o clases has modificado.
- Cómo se ha validado el cambio.
- Si afecta a una o las dos versiones del proyecto.

## Buenas prácticas

- No mezcles cambios de formato con cambios funcionales.
- Evita subir archivos temporales o compilados.
- Revisa tus cambios antes de enviar el PR.
- Si detectas un problema, explica la causa y la solución de forma breve y clara.

## Gracias

Gracias por ayudar a mejorar este proyecto y mantener el ejercicio claro, útil y fácil de seguir.

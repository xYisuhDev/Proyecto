# Proyecto – Sistema de pedidos

Hay dos carpetas: una con el código que escribí siguiendo el UML (`Ingenieria-directa`) y otra con la versión que tuve que reconstruir (`Ingenieria-inversa`). Las dos hacen lo mismo: manejar clientes, pedidos y productos físicos o digitales.

## Qué necesito

- Tener Java instalado (cualquier JDK 11+ vale).
- Abrir una consola en `...\Practica-6.0`.

## Cómo lo pruebo

Ejemplo usando la carpeta de ingeniería inversa:

```powershell
javac Ingenieria-inversa\src\main\java\*.java
java -cp Ingenieria-inversa\src\main\java Main
```

Con la carpeta de ingeniería inversa es igual, solo cambia la ruta del classpath.

## Qué hace el programa

- `Cliente`: almacena nombre, correo y dirección.
- `Producto`: es la base para los artículos. De aquí salen dos hijos:
  - `ProductoFisico`: suma el coste de envío.
  - `ProductoDigital`: añade el IVA digital.
- `Pedido`: guarda un cliente, una lista de productos y calcula el total. También imprime un resumen por consola.

Nada más. Es un mini ejemplo para practicar herencia, agregación y el paso de UML a código.

// Conociendo la OOP Java

# Conceptos Fundamentales de Programación Orientada a Objetos (POO) en Java

## 1. ¿Qué es una clase?
Una clase es una plantilla o modelo a partir de la cual se crean objetos. Define las **características** (atributos) y los **comportamientos** (métodos) que los objetos de esa clase tendrán. Es un concepto fundamental en POO porque permite modelar entidades del mundo real en código.

## 2. Atributos
Los **atributos** son las propiedades o características de un objeto. Cada objeto puede tener diferentes valores para sus atributos, lo que lo hace único. En Java, los atributos se definen dentro de una clase y describen el estado del objeto.

### Ejemplo:
- En una clase `Coche`, los atributos podrían ser `marca`, `modelo` y `color`.

## 3. Instanciación de objetos
Para utilizar una clase, necesitamos crear una **instancia** de ella, es decir, un objeto. **Instanciar** significa crear un nuevo objeto basado en la estructura definida por la clase.

## 4. Métodos
Los **métodos** son las acciones o comportamientos que un objeto puede realizar. Un método puede modificar los atributos del objeto o realizar operaciones específicas. Son fundamentales para modelar el comportamiento de los objetos.

## 5. Objetos del mundo real en la POO
En POO, las entidades del mundo real se modelan como objetos, con características (atributos) y acciones (métodos). Por ejemplo, un objeto `Coche` tiene atributos como `color` y `marca`, y métodos como `acelerar()` y `frenar()`.

## 6. Encapsulación
La **encapsulación** es el concepto de ocultar los detalles internos de una clase y restringir el acceso a los atributos y métodos. Esto se logra utilizando modificadores de acceso como `private` y `public`.

## 7. Modificadores de acceso: `public` y `private`
- **`public`**: Los atributos y métodos públicos pueden ser accedidos desde cualquier parte del programa.
- **`private`**: Los atributos y métodos privados solo pueden ser accedidos desde dentro de la propia clase.

### Ventajas:
La encapsulación ayuda a proteger los datos del objeto y a controlar cómo son accedidos y modificados, lo que mejora la seguridad y la integridad del programa.

## 8. Herencia
La **herencia** es un mecanismo que permite que una clase **herede** atributos y métodos de otra clase, evitando la duplicación de código. La palabra clave `extends` se utiliza para indicar que una clase hereda de otra.

### Problema resuelto:
Si varias clases tienen código duplicado, podemos mover ese código común a una clase padre, que será heredada por las clases hijas.

## 9. Sobrescritura de métodos
Es posible **sobrescribir** un método heredado en una clase hija para proporcionar una implementación específica. La anotación `@Override` se utiliza para indicar que un método está siendo sobrescrito.

## 10. Polimorfismo
El **polimorfismo** permite tratar objetos de diferentes clases que comparten una estructura común de manera uniforme. En lugar de duplicar métodos para cada clase hija, podemos utilizar el polimorfismo para reutilizar el código de manera eficiente.

## 11. Métodos Getters y Setters
- Los **getters** son métodos que permiten leer el valor de un atributo privado.
- Los **setters** son métodos que permiten modificar el valor de un atributo privado, manteniendo el control sobre cómo se cambian los datos.

## 12. La palabra clave `import`
La palabra clave `import` se utiliza en Java para importar clases de otros paquetes, lo que permite organizar el código en diferentes módulos o componentes, facilitando su reutilización y mantenibilidad.

## 13. La palabra clave `this`
La palabra clave `this` se utiliza dentro de una clase para hacer referencia a los atributos o métodos del objeto actual. Es útil para evitar la ambigüedad entre los parámetros del método y los atributos de la clase.

## 14. Buenas prácticas: División en paquetes
Es recomendable organizar el código en **paquetes** siguiendo una estructura lógica que facilite su comprensión y mantenimiento. Una convención común es usar el dominio de la empresa al revés para nombrar los paquetes, por ejemplo: `com.aluracursos.screenmatch`.

### Ventajas:
Organizar el código en paquetes ayuda a mantener un proyecto estructurado y facilita la búsqueda y reutilización de las clases, especialmente en proyectos grandes.

---

Este archivo contiene la información básica para entender los conceptos de POO en Java. Con estos principios, es posible construir aplicaciones más organizadas, escalables y fáciles de mantener.

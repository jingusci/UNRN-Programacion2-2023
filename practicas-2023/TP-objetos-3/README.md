# TP-objetos-1

No olviden completar los comentarios de documentación, incluyendo pre/poscondiciones.

Implementar cada ejercicio en un paquete diferente y utilizando los conceptos de programación orientada a objetos.

## Geometría

Un apunte del tema [Geometría - Khan Academy](https://es.khanacademy.org/math/geometry-home)

Métodos sobre todas las clases:
 - Deben implementar un método `mover` que puede recibir un punto o un par de direcciones.
 - Deben implementar `equals`/`hashCode`, construyendo tests que verifiquen las características del contrato.
 - Deben implementar `toString` para mostrar la información que la compone.

Basar la geometría en `Punto`, la cual debe contener métodos para obtener la distancia y ángulos.

Pueden crear una clase `Segmento` para simplificar el punto siguiente.

Implementar la siguiente familia de clases:
 - Círculos (y elipses opcionalmente)
 - Rectángulos.
 - Triángulos.

Métodos para esta familia de clases:
 - Deben poder ser modificadas
 - Deben poseer métodos para el cálculo del área y perímetro.

Las clases para resolver el ejercicio deben ser creadas dentro del paquete `programacion.practica.figuras`.

## Tiempo
Crear una familia de clases que permitan la representación del tiempo con una precisión de segundos, hasta años.

La o las clases deben poder:
 - Compararse entre sí.
 - Operaciones aritméticas básicas entre sí
 - Operaciones aritméticas básicas con valores puntuales. (sumar horas, por ejemplo)

No olviden crear tests para los métodos implementados.

Las clases para resolver el ejercicio deben ser creadas dentro del paquete `programacion.practica.tiempo`.

## Organizador personal

Crear una agenda en la que puedan ser almacenadas empresas y personas empleando las clases . De las cuales guardamos eventos, 
como estudios médicos, reunión de trabajo, o cualquier otra cita; incluyendo recurrentes como materias de la Universidad.

Las clases para resolver el ejercicio deben ser creadas dentro del paquete `programacion.practica.organizador`.

## Inventario de alacena

Crear un programa que permita llevar el seguimiento de los comestibles hogareños, en los cuales se debe tener en cuenta, la fecha de compra, fecha de vencimiento y constituir listas de compras con aquellos productos de los cuales tengamos pocas existencias. No es necesario almacenar el costo o el lugar de compra.

Las clases para resolver el ejercicio deben ser creadas dentro del paquete `programacion.practica.alacena`.

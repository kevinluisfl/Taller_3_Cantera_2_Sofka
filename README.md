# Cantera 2 Sofka 

## Taller 3 - Buenas pácticas POO, Excepciones

### Software

> + Uso el IDE Netbeans 8.2 para crear el programa
> + Previamente instalado el JDK 8, 16.0.1 
> + Uso el Intellij IDEA 2021.3.2
> + Previamente instalado el JDK 11

### Integrantes
- Kevin Luis Florez - [kevinluisfl](https://github.com/kevinluisfl)
- Juan David Rojas - [juandavidrpo](https://github.com/juandavidrpo)

### Información taller

#### Ejercicios prácticos de buenas practicas de POO

En pareja diseñar una aplicación que administre una lista de canciones, se debe tener lo siguiente:

- Una biblioteca principal con todas las canciones 

- Se debe tener una funcionalidad que permita crear playlist con canciones determinadas 

- Cada canción debe tener el titulo, identificador, fecha, duración, genero, caratula y una descripción corta.

- Se debe crear comportamientos en donde se permita hacer filtros a la biblioteca principal, los filtros son:

>	 Filtrar canciones del mismo género 
>	 Filtrar canciones en el mismo año



- Se debe crear comportamientos en donde se permita ordenar duración y fecha.

### Desarrollo

	El proyecto tiene la clase principal (CreatePlayList.java)
	2 clases para construir las canciones (Song.java) y las playlist (PlayList.java)
	2 clases para implementar métodos abstractos de ordenamiento (Order.java) y filtrado (Filter.java)
	2 interfacez con sus métodos abstractos para ordenar (IOrder.java) y filtrar (IFilter.java)

### Instrucciones

`Clonar proyecto - abrir en IDE `

`Ejecutar desde el método main  el archivo: CreatePlayList.java del package main `
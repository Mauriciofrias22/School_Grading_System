Sistema estadistico de calificaciónes por GUI
El algoritmo realiza los siguientes calculos:
Exámenes con calificación menor a la del promedio del grupo
Porcentaje de exámenes Excelentes
La materia con el mayor numero de examenes reprobados
Estudiante con el mejor desempeño para la materia idiomas
El sistema debe genera los datos estadísticos a partir de la siguiente información:

Nombre	Género	 Materia	   Nota
marcela	  f	    matemáticas	 8.6
daniel	  m	    matemáticas	 9.0
marcela	  f	    idiomas	     8.3
daniel	  m	    idiomas	     6.5

Las calificaciones en la escuela se asignan con la siguiente escala de rangos:

Rango de notas	  Calificación 
(9 - 10]	        Excelente
(8 - 9]	          Sobresaliente
(6 - 8]	          Regular
(3 - 6]	          Insuficiente
[0 - 3]	          Deficiente

Para facilitar el proceso de ingreso y manipulación de los datos, los valores de tipo string se les asigna un identificador numérico único por categorías:

Nombre	Identificador
armando	  1
nicolas	  2
daniel	  3
maria	    4
marcela	  5
alexandra	6

Materia 	Identificador
idiomas	      1
historia	    2
literatura	  3

Género	Identificador
m	          0
f	          1

Ejemplo para prueba

Entrada del programa
18
1.0 0.0 1.0 5.7
1.0 0.0 2.0 0.2
1.0 0.0 3.0 5.0
2.0 0.0 1.0 7.5
2.0 0.0 2.0 9.9
2.0 0.0 3.0 3.5
3.0 0.0 1.0 2.2
3.0 0.0 2.0 5.5
3.0 0.0 3.0 2.2
4.0 1.0 1.0 7.9
4.0 1.0 2.0 2.2
4.0 1.0 3.0 9.9
5.0 1.0 1.0 9.3
5.0 1.0 2.0 9.8
5.0 1.0 3.0 5.8
6.0 1.0 1.0 9.5
6.0 1.0 2.0 7.2
6.0 1.0 3.0 6.6

Salida del programa
9
0.28
literatura
alexandra

Otro aspecto importante es el formato de entrada de los datos, la primera línea de la entrada se trata del número de registros que se deben leer. Las líneas de los registros tienen un formato de tabla, el orden de las columnas es: nombre, género, materia y calificación, las columnas están separadas por un espacio.

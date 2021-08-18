# Ordenamiento-Radixsort
Código del algoritmo de ordenamiento Radíxsort en Java y C

INFORMACIÓN DE RADIXSORT
  Para todos los casos su complejidad es de O(nk)
  
  En este algoritmo no se hacen comparaciones, solo se usan colecciones auxiliares para el orden.
  
FUNCIONAMIENTO DEL CÓDIGO
  A partir de una colección de números ingresados por el usuario (los cuales para este caso tienen la limitante de que todos sus digitos no deben ser mayores a 3) se mandaran a     otras colecciones dependiendo del dígito que tengan en las unidades, decenas, centenas y miles. En este caso solo existiran 4 colecciones auxilares para los digitos 0,1,2 y 3.     Primero se mandaran a los números dependiendo del digito en las unidades, son mandados en el mismo orden en el que llegaron. Una vez que todos los elementos están en otra         colección son regresados a la coleccion original, respetando (en este caso) el orden ascendente (desde 0 hasta 3). Al estar de regreso todos los elementnos en la coleccion         original, neuvamente tienen que ser mandados a las colecciones auxiliares, pero ahora siendo el digito de las decenas lo que definira a que coleccion se irá cada valor. Este       proceso se repetira tambien para las centenas y los miles. Siendo la iteración de los miles la ultima de todas y siendo la coleccion original resultante el orden ascendente de     los números.
  
NOTAS ADICIONALES DEL CÓDIGO
  - Si bien ambos códigos fucnionan correctamente, existen mejoras que se les puede hacer debido a que existe mucho código repetido. Lo que se plantea es que los 'for' utilizados     puedan ser llamadas a funciones, resultando en código más corto pero igual de efectivo
  - La versión en Java destaca debido a todas las herramientas que el mismo contiene. C por otro lado carece de estas herramientas y resultado algo más complicado de realizar por     las limitantes.
  - En caso de querer probar el código de Java, es necesario quitar la linea 'package'.

# Ejercicio_Callbacks_1
Ejercicio propuesto centrado en callbacks
# Enunciado
Realiza un programa en Java que contenga una clase principal desde la que llamarán a dos hilos:

A- La clase principal iniciará 2 hilos al que llamará "Hilo1" y "Hilo2".

B- "hilo1" -  Cuando se ejecute dormirá por 4 segundos y devolverá un número aleatorio entre 4 y 20. 

C- "hilo2" - Cuando se ejecute se iniciará un bucle que se repetirá el número de veces que haya devuelto el "hilo1". en el cual, por cada iteración, este hilo se dormirá por 2 segundos. Al despertar devolverá, a través de un callback un string diciendo el número de veces que se ha ejecutado y el tiempo que ha tardado (calculalo usando timestamps). 

Finalmente, la clase que haya iniciado ambos hilos deberá escribir ese string por consola.



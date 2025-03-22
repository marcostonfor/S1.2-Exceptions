# A continuació es mostra com podeu implementar una validació per a un número de fila en Java, que llançarà una excepció personalitzada si el número de fila no està entre 1 i el total de files.

## Això inclourà la definició de l'excepció personalitzada `ExcepcioFilaIncorrecta`, i una classe de prova que demostrarà com utilitzar-la.

### Pasos a Seguir

1. **Definir l'excepció personalitzada.**
2. **Implementar una funció que validi el número de fila.**

### Codi Java

#### 1. Definició de l'excepció personalitzada

Primer, creeu la classe d'excepció `ExcepcioFilaIncorrecta`.

```java
public class ExcepcioFilaIncorrecta extends Exception {
    public ExcepcioFilaIncorrecta(String message) {
        super(message);
    }
}
```

#### 2. Implementar la funció de validació

A continuació, podeu crear la funció que valida el número de fila.

```java
public class ValidacioFila {
    private int totalFiles;

    public ValidacioFila(int totalFiles) {
        this.totalFiles = totalFiles;
    }

    public void validarFila(int fila) throws ExcepcioFilaIncorrecta {
        if (fila < 1 || fila > totalFiles) {
            throw new ExcepcioFilaIncorrecta("El número de fila " + fila + " no és vàlid. Ha d'estar entre 1 i " + totalFiles + ".");
        }
    }
}
```

#### 3. Classe de prova

Finalment, creeu una classe de prova per exercitar la validació.

```java
import java.util.Scanner;

public class TestValidacioFila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalFiles = 10; // Suposem que hi ha 10 files

        ValidacioFila validacioFila = new ValidacioFila(totalFiles);

        System.out.print("Introdueix el número de fila (1 a " + totalFiles + "): ");
        int filaSeleccionada = scanner.nextInt();

        try {
            validacioFila.validarFila(filaSeleccionada);
            System.out.println("Número de fila vàlid: " + filaSeleccionada);
        } catch (ExcepcioFilaIncorrecta e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
```

### Explicació del Codi

1. **Excepció Personalitzada**: La classe `ExcepcioFilaIncorrecta` extén la classe `Exception`. El constructor accepta un missatge d'error que es passarà a la superclasse.

2. **Validació**: La classe `ValidacioFila` té un mètode `validarFila` que comprova si el número de fila està dins del rang permissiu. Si no ho està, llança una excepció personalitzada.

3. **Classe de Prova**: La classe `TestValidacioFila` demana a l'usuari que introdueixi un número de fila i utilitza `ValidacioFila` per validar-ho. Si el número de fila és vàlid, imprimeix un missatge de confirmació; si no ho és, captura l'excepció i imprimeix el missatge d'error.

### Ús

Per executar el programa, assegureu-vos de tenir el codi de totes les classes dins del mateix fitxer o en fitxers separats tal com les classe individualment. Després, podeu executar `TestValidacioFila` i verificar si la validació funciona com s'espera.

Això us permetrà gestionar casos d'errors de manera més eficient i personalitzada. Si teniu més preguntes o necessiteu més ajuda, no dubteu a preguntar!



package com.company;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contactos {
    private Scanner entrada;

    public Contactos() {
        entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        entrada.useLocale(Locale.US);
    }

    public byte pedirByte() {
        byte num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println("Ingresa un numero entero ");
                num = entrada.nextByte();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if(!correcto) {
                System.out.println("Error, ingresa un numero entero ");
            }
        } while (!correcto);
        return num;
    }

    public byte pedirByte(String mensaje) {
        byte num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                num = entrada.nextByte();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if(!correcto) {
                System.out.println("Error, ingresa un numero entero");
            }
        } while (!correcto);
        return num;
    }

    public byte pedirByte(String mensaje, String mensajeEr) {
        byte num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                num = entrada.nextByte();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println(mensajeEr);
            }
        } while (!correcto);
        return num;
    }

    public byte pedirBytePositivo()
    {
        byte num;
        do {
            try {
                System.out.println("Introduce un numero entero byte positivo");
                num = entrada.nextByte();
            } catch (InputMismatchException ex) {
                num = -1;
                entrada.next();
            } if (num < 0) {
                System.out.println("Error");
            }

        } while (num < 0);
        return num;
    }

    public byte pedirBytePositivo(String mensaje) {
        byte num;
        do {
            try {
                System.out.println(mensaje);
                num = entrada.nextByte();
            } catch (InputMismatchException ex) {
                num = -1;
                entrada.next();
            } if (num < 0) {
                System.out.println("Error");
            }
        } while (num < 0);
        return num;
    }

    public byte pedirBytePositivo(String mensaje, String mensajeE) {
        byte num;
        do {
            try {
                System.out.println("mensaje");
                num = entrada.nextByte();
            } catch (InputMismatchException ex) {
                num = -1;
                entrada.next();
            } if (num < 0) {
                System.out.println(mensajeE);
            }
        } while (num < 0);
        return num;
    }

    public byte pedirByteNegativo() {
        byte num;
        do {
            try {
                System.out.println("Introduce un numero byte negativo");
                num = entrada.nextByte();
            } catch (InputMismatchException ex) {
                num = 1;
                entrada.next();
            } if (num >= 0) {
                System.out.println("Error");
            }
        } while (num >= 0);
        return num;
    }

    public byte pedirByteNegativo(String mensaje) {
        byte num;
        do {
            try {
                System.out.println(mensaje);
                num = entrada.nextByte();
            } catch (InputMismatchException ex) {
                num = 1;
                entrada.next();
            } if (num >= 0) {
                System.out.println("Error");
            }
        } while (num >= 0);
        return num;
    }

    public byte pedirByteNegativo(String mensaje, String mensajeE) {
        byte num;
        do {
            try {
                System.out.println(mensaje);
                num = entrada.nextByte();
            } catch (InputMismatchException ex) {
                num = 1;
                entrada.next();
            } if (num >= 0) {
                System.out.println(mensajeE);
            }
        } while (num >= 0);
        return num;
    }

    public byte pedirByteRango(byte min, byte max) {
        byte num;
        if (min > max) {
            byte aux = min;
            min = max;
            max = aux;
        } do {
            try {
                System.out.println("Ingresa un numero byte entre "+min+" y "+max);
                num = entrada.nextByte();
            } catch (InputMismatchException ex) {
                num = (byte) (max + 1);
                entrada.next();
            } if (!(num >= min && num <= max)) {
                System.out.println("Error");
            }
        } while (!(num >= min && num <= max));
        return num;
    }

    public byte pedirByteRango(byte min, byte max, String mensaje) {
        byte num;
        if (min > max) {
            byte aux = min;
            min = max;
            max = aux;
        } do {
            try {
                System.out.println(mensaje);
                num = entrada.nextByte();
            } catch (InputMismatchException ex) {
                num = (byte) (max + 1);
                entrada.next();
            } if (!(num >= min && num <= max)) {
                System.out.println("Error");
            }
        } while (!(num >= min && num <= max));
        return num;
    }

    public byte pedirByteRango(byte min, byte max, String mensaje, String mensajeE) {
        byte num;
        if (min > max) {
            byte aux = min;
            min = max;
            max = aux;
        } do {
            try {
                System.out.println(mensaje);
                num = entrada.nextByte();
            } catch (InputMismatchException ex) {
                num = (byte) (max + 1);
                entrada.next();
            } if (!(num >= min && num <= max)) {
                System.out.println(mensajeE);
            }
        } while (!(num >= min && num <= max));
        return num;
    }

    public int pedirInt() {
        int num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println("Ingresa un numero entero");
                num = entrada.nextInt();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println("Error");
            }

        } while (!correcto);
        return num;
    }

    public int pedirInt(String mensaje) {
        int num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                num = entrada.nextInt();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println("Error");
            }

        } while (!correcto);
        return num;
    }


    public int pedirInt(String mensaje, String mensajeE) {
        int num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                num = entrada.nextInt();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println(mensajeE);
            }

        } while (!correcto);
        return num;
    }

    public int pedirIntPositivo() {
        int num;
        do {
            try {
                System.out.println("Ingresa un numero entero positivo");
                num = entrada.nextInt();
            } catch (InputMismatchException ex) {
                num = -1;
                entrada.next();
            } if (num < 0) {
                System.out.println("Error");
            }

        } while (num < 0);
        return num;
    }
    public int pedirIntPositivo(String mensaje) {
        int num;
        do {
            try {
                System.out.println(mensaje);
                num = entrada.nextInt();
            } catch (InputMismatchException ex) {
                num = -1;
                entrada.next();
            } if (num < 0) {
                System.out.println("Error");
            }

        } while (num < 0);
        return num;
    }

    public int pedirIntPositivo(String mensaje, String mensajeE) {
        int num;
        do {
            try {
                System.out.println(mensaje);
                num = entrada.nextInt();
            } catch (InputMismatchException ex) {
                num = -1;
                entrada.next();
            } if (num < 0) {
                System.out.println(mensajeE);
            }

        } while (num < 0);
        return num;
    }

    public int pedirIntNegativo() {
        int num;
        do {
            try {
                System.out.println("Ingresa un numero entero negativo");
                num = entrada.nextInt();
            } catch (InputMismatchException ex) {
                num = 1;
                entrada.next();
            } if (num >= 0) {
                System.out.println("Error");
            }

        } while (num >= 0);
        return num;
    }

    public int pedirIntNegativo(String mensaje) {
        int num;
        do {
            try {
                System.out.println(mensaje);
                num = entrada.nextInt();
            } catch (InputMismatchException ex) {
                num = 1;
                entrada.next();
            } if (num >= 0) {
                System.out.println("Error");
            }

        } while (num >= 0);
        return num;
    }

    public int pedirIntNegativo(String mensaje, String mensajeE) {
        int num;
        do {
            try {
                System.out.println(mensaje);
                num = entrada.nextInt();
            } catch (InputMismatchException ex) {
                num = 1;
                entrada.next();
            } if (num >= 0) {
                System.out.println(mensajeE);
            }

        } while (num >= 0);
        return num;
    }

    public int pedirIntRango(int min, int max) {
        int num;
        if (min > max) {
            int aux = min;
            min = max;
            max = aux;
        } do {
            try {
                System.out.println("Introduce un numero entre " + min + " y " + max);
                num = entrada.nextInt();
            } catch (InputMismatchException ex) {
                num = max + 1;
                entrada.next();
            } if (!(num >= min && num <= max)) {
                System.out.println("Error");
            }

        } while (!(num >= min && num <= max));
        return num;
    }

    public int pedirIntRango(int minimo, int maximo, String mensaje) {
        int num;
        if (minimo > maximo) {
            int aux = minimo;
            minimo = maximo;
            maximo = aux;
        } do {
            try {
                System.out.println(mensaje);
                num = entrada.nextInt();
            } catch (InputMismatchException ex) {
                num = maximo + 1;
                entrada.next();
            } if (!(num >= minimo && num <= maximo)) {
                System.out.println("Error");
            }

        } while (!(num >= minimo && num <= maximo));
        return num;
    }

    public int pedirIntRango(int min, int max, String mensaje, String mensajeE) {
        int num;
        if (min > max) {
            int aux = min;
            min = max;
            max = aux;
        } do {
            try {
                System.out.println(mensaje);
                num = entrada.nextInt();
            } catch (InputMismatchException ex) {
                num = max + 1;
                entrada.next();
            } if (!(num >= min && num <= max)) {
                System.out.println(mensajeE);
            }

        } while (!(num >= min && num <= max));
        return num;
    }

    public String pedirString() {
        System.out.println("Introduce una cadena");
        String cadena = entrada.next();
        return cadena;
    }

    public String pedirString(String mensaje) {
        System.out.println(mensaje);
        String cadena = entrada.next();
        return cadena;

    }

    public String pedirString(int longitudMaxima) {
        String cadena = "";
        do {
            System.out.println("Ingresa una cadena");
            cadena = entrada.next();
            if(!(cadena.length() < longitudMaxima)){
                System.out.println("Error");
            }

        } while (!(cadena.length() < longitudMaxima));
        return cadena;

    }

    public String pedirString(int longitudMaxima, String mensaje) {
        String cadena = "";
        do {
            System.out.println(mensaje);
            cadena = entrada.next();
            if(!(cadena.length() < longitudMaxima)){
                System.out.println("Error");
            }

        } while (!(cadena.length() < longitudMaxima));
        return cadena;

    }

    public String pedirString(int longitudMaxima, String mensaje, String mensajeE) {
        String cadena = "";
        do {
            System.out.println(mensaje);
            cadena = entrada.next();
            if(!(cadena.length() < longitudMaxima)){
                System.out.println(mensajeE);
            }

        } while (!(cadena.length() < longitudMaxima));
        return cadena;

    }

    public long pedirLong() {
        long num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println("Ingresa un numero entero long");
                num = entrada.nextLong();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println("Error");
            }

        } while (!correcto);
        return num;
    }

    public long pedirLong(String mensaje) {
        long num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                num = entrada.nextLong();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println("Error");
            }

        } while (!correcto);
        return num;
    }

    public long pedirLong(String mensaje, String mensajeE) {
        long num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                num = entrada.nextLong();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println(mensajeE);
            }

        } while (!correcto);
        return num;
    }

    public long pedirLongPositivo() {
        long num;
        do {
            try {
                System.out.println("Ingresa un numero entero positivo");
                num = entrada.nextLong();
            } catch (InputMismatchException ex) {
                num = -1;
                entrada.next();
            } if (num < 0) {
                System.out.println("Error");
            }

        } while (num < 0);
        return num;
    }

    public long pedirLongPositivo(String mensaje) {
        long num;
        do {
            try {
                System.out.println(mensaje);
                num = entrada.nextLong();
            } catch (InputMismatchException ex) {
                num = -1;
                entrada.next();
            } if (num < 0) {
                System.out.println("Error");
            }

        } while (num < 0);
        return num;
    }

    public long pedirLongPositivo(String mensaje, String mensajeE) {
        long num;
        do {
            try {
                System.out.println(mensaje);
                num = entrada.nextLong();
            } catch (InputMismatchException ex) {
                num = -1;
                entrada.next();
            } if (num < 0) {
                System.out.println(mensajeE);
            }

        } while (num < 0);
        return num;
    }

    public long pedirLongNegativo() {
        long num;
        do {
            try {
                System.out.println("Ingresa un numero entero negativo");
                num = entrada.nextLong();
            } catch (InputMismatchException ex) {
                num = 1;
                entrada.next();
            } if (num >= 0) {
                System.out.println("Error");
            }

        } while (num >= 0);
        return num;
    }

    public long pedirLongNegativo(String mensaje) {
        long num;
        do {
            try {
                System.out.println(mensaje);
                num = entrada.nextLong();
            } catch (InputMismatchException ex) {
                num = 1;
                entrada.next();
            } if (num >= 0) {
                System.out.println("Error");
            }

        } while (num >= 0);
        return num;
    }

    public long pedirLongNegativo(String mensaje, String mensajeE) {
        long num;
        do {
            try {
                System.out.println(mensaje);
                num = entrada.nextLong();
            } catch (InputMismatchException ex) {
                num = 1;
                entrada.next();
            } if (num >= 0) {
                System.out.println(mensajeE);
            }

        } while (num >= 0);
        return num;
    }

    public long pedirLongRango(long min, long max) {
        long num;
        if (min > max) {
            long aux = min;
            min = max;
            max = aux;
        } do {
            try {
                System.out.println("Ingresa un numero entre " +min+ " y "+max);
                num = entrada.nextLong();
            } catch (InputMismatchException ex) {
                num = (byte) (max + 1);
                entrada.next();
            } if (!(num >= min && num <= max)) {
                System.out.println("Error");
            }

        } while (!(num >= min && num <= max));
        return num;
    }

    public long pedirLongRango(long min, long max, String mensaje) {
        long num;
        if (min > max) {
            long aux = min;
            min = max;
            max = aux;
        } do {
            try {
                System.out.println(mensaje);
                num = entrada.nextLong();
            } catch (InputMismatchException ex) {
                num = (byte) (max + 1);
                entrada.next();
            } if (!(num >= min && num <= max)) {
                System.out.println("Error");
            }

        } while (!(num >= min && num <= max));
        return num;
    }

    public long pedirLongRango(long min, long max, String mensaje, String mensajeE) {
        long num;
        if (min > max) {
            long aux = min;
            min = max;
            max = aux;
        } do {
            try {
                System.out.println(mensaje);
                num = entrada.nextLong();
            } catch (InputMismatchException ex) {
                num = (byte) (max + 1);
                entrada.next();
            } if (!(num >= min && num <= max)) {
                System.out.println(mensajeE);
            }

        } while (!(num >= min && num <= max));
        return num;
    }

    public short pedirShort() {
        short num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println("Ingresa un numero entero");
                num = entrada.nextShort();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println("Error");
            }

        } while (!correcto);
        return num;
    }

    public short pedirShort(String mensaje) {
        short num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                num = entrada.nextShort();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println("Error");
            }

        } while (!correcto);
        return num;
    }

    public short pedirShort(String mensaje, String mensajeE) {
        short num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                num = entrada.nextShort();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println(mensajeE);
            }

        } while (!correcto);
        return num;
    }

    public short pedirShortPositivo() {
        short num;
        do {
            try {
                System.out.println("Ingresa un numero entero positivo");
                num = entrada.nextShort();
            } catch (InputMismatchException ex) {
                num = -1;
                entrada.next();
            } if (num < 0) {
                System.out.println("Error");
            }

        } while (num < 0);
        return num;
    }

    public short pedirShortPositivo(String mensaje) {
        short num;
        do {
            try {
                System.out.println(mensaje);
                num = entrada.nextShort();
            } catch (InputMismatchException ex) {
                num = -1;
                entrada.next();
            } if (num < 0) {
                System.out.println("Error");
            }

        } while (num < 0);
        return num;
    }

    public short pedirShortPositivo(String mensaje, String mensajeE) {
        short num;
        do {
            try {
                System.out.println(mensaje);
                num = entrada.nextShort();
            } catch (InputMismatchException ex) {
                num = -1;
                entrada.next();
            } if (num < 0) {
                System.out.println(mensajeE);
            }

        } while (num < 0);
        return num;
    }

    public short pedirShortNegativo() {
        short num;
        do {
            try {
                System.out.println("Ingresa un numero entero negativo");
                num = entrada.nextShort();
            } catch (InputMismatchException ex) {
                num = 1;
                entrada.next();
            } if (num >= 0) {
                System.out.println("Error");
            }

        } while (num >= 0);
        return num;
    }

    public short pedirShortNegativo(String mensaje) {
        short num;
        do {
            try {
                System.out.println(mensaje);
                num = entrada.nextShort();
            } catch (InputMismatchException ex) {
                num = 1;
                entrada.next();
            } if (num >= 0) {
                System.out.println("Error");
            }

        } while (num >= 0);

        return num;
    }

    public short pedirShortNegativo(String mensaje, String mensajeE) {
        short num;
        do {
            try {
                System.out.println(mensaje);
                num = entrada.nextShort();
            } catch (InputMismatchException ex) {
                num = 1;
                entrada.next();
            } if (num >= 0) {
                System.out.println(mensajeE);
            }

        } while (num >= 0);
        return num;
    }

    public short pedirShortRango(long min, long max) {
        short num;
        if (min > max) {
            long aux = min;
            min = max;
            max = aux;
        } do {
            try {
                System.out.println("Ingresa un numero entre " + min + " y " + max);
                num = entrada.nextShort();
            } catch (InputMismatchException ex) {
                num = (byte) (max + 1);
                entrada.next();
            }

            if (!(num >= min && num <= max)) {
                System.out.println("Error");
            }

        } while (!(num >= min && num <= max));
        return num;
    }

    public short pedirShortRango(short min, short max, String mensaje) {
        short num;
        if (min > max) {
            short aux = min;
            min = max;
            max = aux;
        } do {
            try {
                System.out.println(mensaje);
                num = entrada.nextShort();
            } catch (InputMismatchException ex) {
                num = (byte) (max + 1);
                entrada.next();
            } if (!(num >= min && num <= max)) {
                System.out.println("Error");
            }

        } while (!(num >= min && num <= max));
        return num;
    }

    public short pedirShortRango(short min, short max, String mensaje, String mensajeEr) {
        short num;
        if (min > max) {
            short aux = min;
            min = max;
            max = aux;
        } do {
            try {
                System.out.println(mensaje);
                num = entrada.nextShort();
            } catch (InputMismatchException ex) {
                num = (byte) (max + 1);
                entrada.next();
            } if (!(num >= min && num <= max)) {
                System.out.println(mensajeEr);
            }

        } while (!(num >= min && num <= max));
        return num;
    }

    public double pedirDouble() {
        double real = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println("Ingresa un numero real");
                real = entrada.nextDouble();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println("Error");
            }

        } while (!correcto);
        return real;

    }

    public double pedirDouble(String mensaje) {
        double real = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                real = entrada.nextDouble();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println("Error");
            }

        } while (!correcto);
        return real;

    }

    public double pedirDouble(String mensaje, String mensajeE) {
        double real = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                real = entrada.nextDouble();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println(mensajeE);
            }

        } while (!correcto);
        return real;

    }

    public double pedirDoublePositivo() {
        double real;
        do {
            try {
                System.out.println("Ingresa un numero real positivo");
                real = entrada.nextDouble();
            } catch (InputMismatchException ex) {
                real = -1;
                entrada.next();
            } if (real < 0) {
                System.out.println("Error");
            }

        } while (real < 0);
        return real;
    }

    public double pedirDoublePositivo(String mensaje) {
        double real;
        do {
            try {
                System.out.println(mensaje);
                real = entrada.nextDouble();
            } catch (InputMismatchException ex) {
                real = -1;
                entrada.next();
            } if (real < 0) {
                System.out.println("Error");
            }

        } while (real < 0);
        return real;
    }

    public double pedirDoublePositivo(String mensaje, String mensajeE) {
        double real;
        do {
            try {
                System.out.println(mensaje);
                real = entrada.nextDouble();
            } catch (InputMismatchException ex) {
                real = -1;
                entrada.next();
            } if (real < 0) {
                System.out.println(mensajeE);
            }

        } while (real < 0);
        return real;
    }

    public double pedirDoubleNegativo() {
        double real;
        do {
            try {
                System.out.println("Ingresa un numero real negativo");
                real = entrada.nextDouble();
            } catch (InputMismatchException ex) {
                real = 1;
                entrada.next();
            } if (real >= 0) {
                System.out.println("Error");
            }

        } while (real >= 0);
        return real;
    }

    public double pedirDoubleNegativo(String mensaje) {
        double real;
        do {
            try {
                System.out.println(mensaje);
                real = entrada.nextDouble();
            } catch (InputMismatchException ex) {
                real = 1;
                entrada.next();
            }if (real >= 0) {
                System.out.println("Error");
            }

        } while (real >= 0);
        return real;
    }

    public double pedirDoubleNegativo(String mensaje, String mensajeE) {
        double real;
        do {
            try {
                System.out.println(mensaje);
                real = entrada.nextDouble();
            } catch (InputMismatchException ex) {
                real = 1;
                entrada.next();
            } if (real >= 0) {
                System.out.println(mensajeE);
            }

        } while (real >= 0);
        return real;
    }

    public double pedirDoubleRango(double min, double max) {
        double real;
        if (min > max) {
            double aux = min;
            min = max;
            max = aux;
        } do {
            try {
                System.out.println("Ingresa un numero entre " +min+ " y " +max);
                real = entrada.nextDouble();
            } catch (InputMismatchException ex) {
                real = max + 1;
                entrada.next();
            } if (!(real >= min && real <= max)) {
                System.out.println("Error");
            }

        } while (!(real >= min && real <= max));
        return real;
    }

    public double pedirDoubleRango(double min, double max, String mensaje) {
        double real;
        if (min > max) {
            double aux = min;
            min = max;
            max = aux;
        } do {
            try {
                System.out.println(mensaje);
                real = entrada.nextDouble();
            } catch (InputMismatchException ex) {
                real = max + 1;
                entrada.next();
            } if (!(real >= min && real <= max)) {
                System.out.println("Error");
            }

        } while (!(real >= min && real <= max));
        return real;
    }

    public double pedirDoubleRango(double min, double max, String mensaje, String mensajeEr) {
        double real;
        if (min > max) {
            double aux = min;
            min = max;
            max = aux;
        } do {
            try {
                System.out.println(mensaje);
                real = entrada.nextDouble();
            } catch (InputMismatchException ex) {
                real = max + 1;
                entrada.next();
            } if (!(real >= min && real <= max)) {
                System.out.println(mensajeEr);
            }

        } while (!(real >= min && real <= max));
        return real;
    }

    public double pedirDoubleDecimales(int decimales) {
        if (decimales < 1) {
            decimales = 1;
        }
        double real = 0;
        boolean correcto;
        String[] parteDecimal;
        do {
            correcto = true;
            try {
                System.out.println("Ingresa un numero real double con "+decimales+" decimales como maximo");
                real = entrada.nextDouble();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println("Error");
            } else {
                parteDecimal = String.valueOf(real).split("\\.");
                if (parteDecimal[1].length() > decimales) {
                    correcto = false;
                    System.out.println("Error");
                }
            }

        } while (!correcto);
        return real;

    }

    public double pedirDoubleDecimales(int decimales, String mensaje) {
        if (decimales < 1) {
            decimales = 1;
        }
        double real = 0;
        boolean correcto;
        String[] parteDecimal;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                real = entrada.nextDouble();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println("Error");
            } else {
                parteDecimal = String.valueOf(real).split("\\.");

                if (parteDecimal[1].length() > decimales) {
                    correcto = false;
                    System.out.println("Error");
                }
            }

        } while (!correcto);
        return real;

    }

    public double pedirDoubleDecimales(int decimales, String mensaje, String mensajeE) {
        if (decimales < 1) {
            decimales = 1;
        }
        double real = 0;
        boolean correcto;
        String[] parteDecimal;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                real = entrada.nextDouble();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println(mensajeE);
            } else {
                parteDecimal = String.valueOf(real).split("\\.");
                if (parteDecimal[1].length() > decimales) {
                    correcto = false;
                    System.out.println("Error");
                }
            }

        } while (!correcto);
        return real;

    }

    public double pedirDoublePositivoDecimales(int decimales) {
        double real;
        String[] parteDecimal;
        do {
            try {
                System.out.println("Ingresa un numero real positivo double con "+decimales+" decimales como maximo");
                real = entrada.nextDouble();
            } catch (InputMismatchException ex) {
                real = -1;
                entrada.next();
            } if (real < 0) {
                System.out.println("Error");
            } else {
                parteDecimal = String.valueOf(real).split("\\.");
                if (parteDecimal[1].length() > decimales) {
                    real = -1;
                    System.out.println("Error" + decimales);
                }
            }

        } while (real < 0);
        return real;
    }

    public double pedirDoublePositivoDecimales(int decimales, String mensaje) {
        double real;
        String[] parteDecimal;
        do {
            try {
                System.out.println(mensaje);
                real = entrada.nextDouble();
            } catch (InputMismatchException ex) {
                real = -1;
                entrada.next();
            } if (real < 0) {
                System.out.println("Error");
            } else {
                parteDecimal = String.valueOf(real).split("\\.");
                if (parteDecimal[1].length() > decimales) {
                    real = -1;
                    System.out.println("Error");
                }
            }

        } while (real < 0);
        return real;
    }

    public double pedirDoublePositivoDecimales(int decimales, String mensaje, String mensajeE) {
        double real;
        String[] parteDecimal;
        do {
            try {
                System.out.println(mensaje);
                real = entrada.nextDouble();
            } catch (InputMismatchException ex) {
                real = -1;
                entrada.next();
            } if (real < 0) {
                System.out.println(mensajeE);
            } else {
                parteDecimal = String.valueOf(real).split("\\.");
                if (parteDecimal[1].length() > decimales) {
                    real = -1;
                    System.out.println("Error");
                }
            }

        } while (real < 0);
        return real;
    }

    public float pedirFloat() {
        float real = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println("Ingresa un numero real float");
                real = entrada.nextFloat();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println("Error");
            }

        } while (!correcto);
        return real;

    }

    public float pedirFloat(String mensaje) {
        float real = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                real = entrada.nextFloat();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println("Error");
            }

        } while (!correcto);
        return real;

    }

    public float pedirFloat(String mensaje, String mensajeE) {
        float real = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                real = entrada.nextFloat();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println(mensajeE);
            }

        } while (!correcto);
        return real;

    }

    public float pedirFloatPositivo() {
        float real;
        do {
            try {
                System.out.println("Ingresa un numero real positivo");
                real = entrada.nextFloat();
            } catch (InputMismatchException ex) {
                real = -1;
                entrada.next();
            } if (real < 0) {
                System.out.println("Error");
            }

        } while (real < 0);
        return real;
    }

    public float pedirFloatPositivo(String mensaje) {
        float real;
        do {
            try {
                System.out.println(mensaje);
                real = entrada.nextFloat();
            } catch (InputMismatchException ex) {
                real = -1;
                entrada.next();
            } if (real < 0) {
                System.out.println("Error");
            }

        } while (real < 0);
        return real;
    }

    public float pedirFloatPositivo(String mensaje, String mensajeE) {
        float real;
        do {
            try {
                System.out.println(mensaje);
                real = entrada.nextFloat();
            } catch (InputMismatchException ex) {
                real = -1;
                entrada.next();
            } if (real < 0) {
                System.out.println(mensajeE);
            }

        } while (real < 0);
        return real;
    }

    public float pedirFloatNegativo() {
        float real;
        do {
            try {
                System.out.println("Ingresa un numero real negativo");
                real = entrada.nextFloat();
            } catch (InputMismatchException ex) {
                real = 1;
                entrada.next();
            } if (real >= 0) {
                System.out.println("Error");
            }

        } while (real >= 0);
        return real;
    }

    public float pedirFloatNegativo(String mensaje) {
        float real;
        do {
            try {
                System.out.println(mensaje);
                real = entrada.nextFloat();
            } catch (InputMismatchException ex) {
                real = 1;
                entrada.next();
            } if (real >= 0) {
                System.out.println("Error");
            }

        } while (real >= 0);
        return real;
    }

    public float pedirFloatNegativo(String mensaje, String mensajeE) {
        float real;
        do {
            try {
                System.out.println(mensaje);
                real = entrada.nextFloat();
            } catch (InputMismatchException ex) {
                real = 1;
                entrada.next();
            } if (real >= 0) {
                System.out.println(mensajeE);
            }

        } while (real >= 0);
        return real;
    }

    public float pedirFloatRango(float min, float max) {
        float real;
        if (min > max) {
            float aux = min;
            min = max;
            max = aux;
        } do {
            try {
                System.out.println("Ingresa un numero entre " + min + " y " + max);
                real = entrada.nextFloat();
            } catch (InputMismatchException ex) {
                real = max + 1;
                entrada.next();
            } if (!(real >= min && real <= max)) {
                System.out.println("Error");
            }

        } while (!(real >= min && real <= max));
        return real;
    }

    public float pedirFloatRango(float min, float max, String mensaje) {
        float real;
        if (min > max) {
            float aux = min;
            min = max;
            max = aux;
        } do {
            try {
                System.out.println(mensaje);
                real = entrada.nextFloat();
            } catch (InputMismatchException ex) {
                real = max + 1;
                entrada.next();
            } if (!(real >= min && real <= max)) {
                System.out.println("Error");
            }

        } while (!(real >= min && real <= max));
        return real;
    }

    public float pedirFloatRango(float min, float max, String mensaje, String mensajeE) {
        float real;
        if (min > max) {
            float aux = min;
            min = max;
            max = aux;
        } do {
            try {
                System.out.println(mensaje);
                real = entrada.nextFloat();
            } catch (InputMismatchException ex) {
                real = max + 1;
                entrada.next();
            } if (!(real >= min && real <= max)) {
                System.out.println(mensajeE);
            }

        } while (!(real >= min && real <= max));
        return real;
    }

    public float pedirFloatDecimales(int decimales) {
        if (decimales < 1) {
            decimales = 1;
        }
        float real = 0;
        boolean correcto;
        String[] parteDecimal;
        do {
            correcto = true;
            try {
                System.out.println("Ingresa un numero real con "+decimales+" decimales como maximo");
                real = entrada.nextFloat();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println("Error");
            } else {
                parteDecimal = String.valueOf(real).split("\\.");

                if (parteDecimal[1].length() > decimales) {
                    correcto = false;
                    System.out.println("Error");
                }
            }

        } while (!correcto);
        return real;

    }

    public float pedirFloatDecimales(int decimales, String mensaje) {
        if (decimales < 1) {
            decimales = 1;
        }
        float real = 0;
        boolean correcto;
        String[] parteDecimal;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                real = entrada.nextFloat();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println("Error");
            } else {
                parteDecimal = String.valueOf(real).split("\\.");
                if (parteDecimal[1].length() > decimales) {
                    correcto = false;
                    System.out.println("Error");
                }
            }

        } while (!correcto);
        return real;

    }

    public float pedirFloatDecimales(int decimales, String mensaje, String mensajeError) {
        if (decimales < 1) {
            decimales = 1;
        }
        float real = 0;
        boolean correcto;
        String[] parteDecimal;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                real = entrada.nextFloat();
            } catch (InputMismatchException ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println(mensajeError);
            } else {
                parteDecimal = String.valueOf(real).split("\\.");
                if (parteDecimal[1].length() > decimales) {
                    correcto = false;
                    System.out.println("Error");
                }
            }

        } while (!correcto);
        return real;

    }

    public float pedirFloatPositivoDecimales(int decimales) {
        float real;
        String[] parteDecimal;
        do {
            try {
                System.out.println("Ingresa un numero real positivo con "+decimales+" decimales como maximo");
                real = entrada.nextFloat();
            } catch (InputMismatchException ex) {
                real = -1;
                entrada.next();
            } if (real < 0) {
                System.out.println("Error");
            } else {
                parteDecimal = String.valueOf(real).split("\\.");

                if (parteDecimal[1].length() > decimales) {
                    real = -1;
                    System.out.println("Error");
                }
            }

        } while (real < 0);
        return real;
    }

    public float pedirFloatPositivoDecimales(int decimales, String mensaje) {
        float real;
        String[] parteDecimal;
        do {
            try {
                System.out.println(mensaje);
                real = entrada.nextFloat();
            } catch (InputMismatchException ex) {
                real = -1;
                entrada.next();
            } if (real < 0) {
                System.out.println("Error");
            } else {
                parteDecimal = String.valueOf(real).split("\\.");
                if (parteDecimal[1].length() > decimales) {
                    real = -1;
                    System.out.println("Error");
                }
            }

        } while (real < 0);
        return real;
    }

    public float pedirFloatPositivoDecimales(int decimales, String mensaje, String mensajeE) {
        float real;
        String[] parteDecimal;
        do {
            try {
                System.out.println(mensaje);
                real = entrada.nextFloat();
            } catch (InputMismatchException ex) {
                real = -1;
                entrada.next();
            } if (real < 0) {
                System.out.println(mensajeE);
            } else {
                parteDecimal = String.valueOf(real).split("\\.");
                if (parteDecimal[1].length() > decimales) {
                    real = -1;
                    System.out.println("Error");
                }
            }

        } while (real < 0);
        return real;
    }

    public char pedirChar() {
        System.out.println("Ingresa un caracter");
        char caracter = entrada.next().charAt(0);
        return caracter;

    }

    public char pedirChar(String mensaje) {
        System.out.println(mensaje);
        char caracter = entrada.next().charAt(0);
        return caracter;

    }

    public boolean pedirBoolean() {
        boolean booleano = false, correcto;
        do {
            correcto = true;
            try {
                System.out.println("Ingresa un booleano");
                booleano = entrada.nextBoolean();
            } catch (Exception ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println("Error");
            }

        } while (!correcto);
        return booleano;
    }

    public boolean pedirBoolean(String mensaje) {
        boolean booleano = false, correcto;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                booleano = entrada.nextBoolean();
            } catch (Exception ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println("Error");
            }

        } while (!correcto);
        return booleano;
    }

    public boolean pedirBoolean(String mensaje, String mensajeError) {
        boolean booleano = false, correcto;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                booleano = entrada.nextBoolean();
            } catch (Exception ex) {
                correcto = false;
                entrada.next();
            } if (!correcto) {
                System.out.println(mensajeError);
            }

        } while (!correcto);
        return booleano;
    }

    public boolean pedirBooleanSiNo() {
        boolean correcto, booleano = false;
        String respuesta = "";
        do {
            correcto = true;
            try {
                System.out.println("Ingresa Si o No");
                respuesta = entrada.next();
                respuesta = respuesta.toLowerCase().trim();
            } catch (Exception ex) {
                correcto = false;
                entrada.next();
            } if (respuesta.equals("si")) {
                booleano = true;
            } else if (respuesta.equals("no")) {
                booleano = false;
            } else {
                correcto = false;
            } if (!(respuesta.equals("si")) || respuesta.equals("no")) {
                correcto = false;
            } if (!correcto) {
                System.out.println("Error");
            }

        } while (!correcto);
        return booleano;
    }

    public boolean pedirBooleanSiNo(String mensaje) {
        boolean correcto, booleano = false;
        String respuesta = "";
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                respuesta = entrada.next();
                respuesta = respuesta.toLowerCase().trim();
            } catch (Exception ex) {
                correcto = false;
                entrada.next();
            } if (respuesta.equals("si")) {
                booleano = true;
            } else if (respuesta.equals("no")) {
                booleano = false;
            } else {
                correcto = false;
            } if (!(respuesta.equals("si")) || respuesta.equals("no")) {
                correcto = false;
            } if (!correcto) {
                System.out.println("Error");
            }

        } while (!correcto);
        return booleano;
    }

    public boolean pedirBooleanSiNo(String mensaje, String mensajeE) {
        boolean correcto, booleano = false;
        String respuesta = "";
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                respuesta = entrada.next();
                respuesta = respuesta.toLowerCase().trim();
            } catch (Exception ex) {
                correcto = false;
                entrada.next();
            } if (respuesta.equals("si")) {
                booleano = true;
            } else if (respuesta.equals("no")) {
                booleano = false;
            } else {
                correcto = false;
            } if (!(respuesta.equals("si")) || respuesta.equals("no")) {
                correcto = false;
            } if (!correcto) {
                System.out.println(mensajeE);
            }

        } while (!correcto);
        return booleano;
    }
}

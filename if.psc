Algoritmo TablasDeMultiplicar
    Definir tabla, numero, multiplicador, resultado Como Entero

    Para tabla <- 1 Hasta 5
        Escribir "Tabla de multiplicar del", tabla, ":"
        Para multiplicador <- 1 Hasta 10
            numero <- tabla
            resultado <- numero * multiplicador
            Escribir numero, " x ", multiplicador, " = ", resultado
        FinPara
        Escribir ""
    FinPara

FinAlgoritmo

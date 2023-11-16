Algoritmo while_icft 
	Definir numero, factor, numero2 Como Real
	Escribir 'ingrese un numero para obtener el factorial'
	Leer numero
	factor <- 1
	numero2 <- numero
	Si numero>=0 Entonces
		Mientras numero<>0 Hacer
			factor <- factor*numero
			numero <- numero-1
		FinMientras
	SiNo
		Mientras numero<>0 Hacer
			factor <- factor*numero
			numero <- numero+1
		FinMientras
	FinSi
	Escribir 'el factorial del numero ', numero2, 'es: ', factor
FinAlgoritmo

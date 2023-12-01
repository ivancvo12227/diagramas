Algoritmo ejercicioClase
	Definir promedio,sumatotal Como Entero
	Escribir 'este algoritmo se trata de digitar 7 numeros'
	Escribir 'antes de digitar los numeros tiene que elegir qu va a hacer el algoritmo'
	Escribir 'sus opciones son:'
	Escribir 'MAYOR ------ MENOR ----- PROMEDIO ----- SUMA TOTAL-----'
	Escribir 'elije la opcion que deseas '
	Escribir '1 : SACAR NUMERO MAYOR'
	Escribir '2 : SACAR EL PROMEDIO'
	Escribir '3 : SACAR LA SUMA TOTAL'
	Escribir '4 : SALIR '
	Leer OP
	Segun OP  Hacer
		1:
			Escribir 'ELIGIO: SACAR NUMERO MAYOR Y MENOR '
			Definir may,men,i,nt Como Entero
			may <- 0
			men <- 0
			i <- 1
			Mientras (i<=7) Hacer
				Escribir 'ingrese el numero: ',i
				Leer nt
				Si (i==1) Entonces
					may <- nt
					men <- nt
				SiNo
					Si (nt>may) Entonces
						may <- nt
					FinSi
					Si (nt<men) Entonces
						men <- nt
					FinSi
				FinSi
				i <- i+1
			FinMientras
			Escribir 'el numero menor ingresado fue: ',men
			Escribir 'el numero mayor ingresado fue: ',may
		2:
			Escribir 'ELIGIO: SACAR PROMEDIO'
			Definir num1,num2,num3,num4,num5,num6,num7,prom Como Real
			Escribir 'A CONTINUACION INGRESE 7 NUMEROS: '
			Leer num1,num2,num3,num4,num5,num6,num7
			prom <- num1+num2+num3+num4+num5+num6+num7
			prom <- prom/7
			Escribir 'SU PROMEDIO ES: ',prom
		3:
			Escribir 'ELIGIO: SACAR LA SUMA TOTAL'
			Definir n1,n2,n3,n4,n5,n6,n7,st Como Real
			Escribir 'DIGITE 7 NUMEROS'
			Leer n1,n2,n3,n4,n5,n6,n7
			st <- n1+n2+n3+n4+n5+n6+n7
			Escribir 'LA SUMA TOTAL DE SUS NUMEROS ES: ',st
		4:
			Escribir 'salio del algoritmo'
	FinSegun
FinAlgoritmo

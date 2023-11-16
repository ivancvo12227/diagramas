Algoritmo suma_case
			Definir MCI Como Real
			Escribir 'Ingresar valor M'
			Leer M
			Escribir 'Ingresar valor T'
			Leer T
			masa <- masa/(talla*tallatotal)
			Si IMC<18.5 Entonces
				Escribir 'Insuficiente'
			SiNo
				Si IMC<24.4 Entonces
					Escribir 'Normal'
				SiNo
					Si IMC<25.2 Entonces
						Escribir 'Preobesidad'
					SiNo
						Si IMC<30.0 Entonces
							Escribir 'Obesidad I'
						SiNo
							Si IMC<35.0 Entonces
								Escribir 'Obesidad II'
							SiNo
								Si IMC<40.0 Entonces
									Escribir 'Obesidad III'
								SiNo
									Escribir 'Obesidad III'
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
FinAlgoritmo

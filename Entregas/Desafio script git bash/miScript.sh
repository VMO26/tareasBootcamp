echo "Se inicia ejecucion del sript"
if [ -e "desafioTerminal" ]; then
	echo "El directorio ya existe"
else
	mkdir desafioTerminal
	echo "El directorio fue creado "
fi
cd desafioTerminal
if [ -e "desafio.txt" ]; then
	echo "El contenido de desafio es:"
	cat desafio.txt
else
	touch desafio.txt
	echo "Hola, gracias por crearme"
	echo "Hola, gracias por crearme" > desafio.txt
fi
echo "El Script ha finalizado"


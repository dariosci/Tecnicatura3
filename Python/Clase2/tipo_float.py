# Profundizando en el tipo float
a = 3.0
print(f"a: {a:.2f}")

# Constructor tipo float -> puede recibir int y str
a = float(10) # Le pasamos tipo entero
a = float('10') # Le pasamos tipo string (siempre y cuando sean "numeros")
print(f"a: {a:.2f}")

# Notación exponencial (valores positivos o negativos)
#postivo
a = 3e5
print(f"a: {a:.2f}")
#negativo
a = 3e-5
print(f"a: {a:.5f}") #ponemos la cant de decimales para que pueda verse el numero

# Cualquier calculo que incluye un float, todo cambia a float
a = 4.0 + 5
print(a)
print(type(a))
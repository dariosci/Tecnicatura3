import math
from decimal import Decimal

# Manejo de valores infinitos
infinito_positivo = float('inf') # inf es la cadena para infinito, se tiene que usar con el constructor float
print(f'Infinito positivo: {infinito_positivo}')
print(f'Es infinito? {math.isinf(infinito_positivo)}')

infinito_negativo = float('-inf') # -inf es la cadena para infinito, se tiene que usar con el constructor float
print(f'Infinito negativo: {infinito_negativo}')
print(f'Es infinito? {math.isinf(infinito_negativo)}')

# Modulo Math
infinito_positivo = math.inf # otra manera de asignar el valor infinito
print(f'Infinito positivo: {infinito_positivo}')
print(f'Es infinito? {math.isinf(infinito_positivo)}')

infinito_negativo = -math.inf # otra manera de asignar el valor infinito
print(f'Infinito negativo: {infinito_negativo}')
print(f'Es infinito? {math.isinf(infinito_negativo)}')

# Modulo Decimal
infinito_positivo = Decimal('Infinity') # otra manera de asignar el valor infinito
print(f'Infinito positivo: {infinito_positivo}')
print(f'Es infinito? {math.isinf(infinito_positivo)}')

infinito_negativo = Decimal('-Infinity') # otra manera de asignar el valor infinito
print(f'Infinito negativo: {infinito_negativo}')
print(f'Es infinito? {math.isinf(infinito_negativo)}')
# 🚀 Ejercicios de Programación

## 📌 Descripción
Este repositorio contiene una colección de ejercicios de programación en Java, organizados por temas. Está diseñado para reforzar conceptos clave de **programación estructurada, POO (Programación Orientada a Objetos), manejo de estructuras de datos y archivos**.

## 📂 Contenido del Repositorio

```python
import os

def listar_ejercicios():
    directorios = [d for d in os.listdir('.') if os.path.isdir(d)]
    directorios.sort()
    for carpeta in directorios:
        print(f'- 📁 **{carpeta}**')

listar_ejercicios()
```

🔹 El código anterior genera dinámicamente la lista de carpetas contenidas en el repositorio. Puedes ejecutarlo en un entorno local para obtener un listado actualizado.

### 📁 Ejercicios incluidos
- **Arrays y estructuras de datos** (`arraysejercicios`, `matricesPractica`)
- **Condicionales y Bucles** (`condicionales`, `condicionales_bucles_array`)
- **Programación Orientada a Objetos (POO)** (`pooEjercicio`, `pooEjercicios`, `entrenamientoPooAvanzado`)
- **Manejo de Ficheros** (`fichero`, `ficheroEjercicio`, `ficherospractica`, `ejerciciosficheros`)

## 🛠 Requisitos
- **Java 8+**
- **Un IDE compatible** ( IntelliJ)


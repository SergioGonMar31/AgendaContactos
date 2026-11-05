# UD01_Actividad07_AgendaContactos

Aplicación de consola en **Kotlin** para gestionar una agenda básica de contactos en memoria mediante una `MutableList`.

Proyecto de la asignatura **PMDM – UD01. Introducción** (Actividad 07).

## Descripción

El programa muestra un menú interactivo que se repite hasta que el usuario elige salir. Los contactos se guardan solo durante la ejecución (no hay persistencia).

## Funcionalidades

```
===== AGENDA DE CONTACTOS =====
1. Añadir contacto
2. Listar contactos
3. Buscar contacto
4. Eliminar contacto
5. Salir
```

- **Añadir:** pide nombre, teléfono y correo, y lo guarda en la lista.
- **Listar:** muestra los contactos numerados (`1. Ana García - 600123456 - ana@email.com`).
- **Buscar:** por nombre, con coincidencia total o parcial.
- **Eliminar:** borra un contacto y confirma la operación.
- **Salir:** finaliza el programa.

## Validaciones

- Opciones de menú no válidas.
- Agenda vacía al listar, buscar o eliminar.
- Campos obligatorios vacíos.
- Eliminación de contactos inexistentes.
- Búsquedas sin resultados.
- telefonos y emails validos

## Ejecución

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/SergioGonMar31/AgendaContactos
   ```
2. Abrirlo en **IntelliJ IDEA**.
3. Ejecutar la función `main` del archivo `Main.kt`.

## Autor

**Sergio González Marquínez** – [@SergioGonMar31](https://github.com/SergioGonMar31)

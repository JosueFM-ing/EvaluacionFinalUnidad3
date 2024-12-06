# Descripción General

Este proyecto es una aplicación de Android que combina funcionalidades de conexión MQTT y simulación de integración con Firebase para manejo de datos. **Nota:** Debido a problemas para conectar Firebase adecuadamente, se implementó una solución local simulada.

---

## Estructura del Proyecto

### **Inicio (Activity Principal):**
- Pantalla principal con dos botones que redirigen a las funcionalidades de MQTT y Firebase.
- Navegación mediante Intents.

### **Funcionalidad de Login:**
- **Validación de usuario y contraseña estáticos:**
  - Usuario: `admin`
  - Contraseña: `1234`
- Tras una autenticación exitosa, redirige al menú principal (Inicio).

### **Integración MQTT (MainActivity):**
- Configuración de conexión con el broker público `tcp://broker.emqx.io:1883`.
- Publicación de mensajes a un tópico MQTT (`test/topic`).
- Recepción en tiempo real de mensajes del tópico suscrito.
- Uso de la librería **Paho MQTT** para manejar las conexiones.

### **Integración con Firebase (FirebaseActivity):**
- Captura de datos del usuario a través de un campo de entrada (`EditText`).
- Almacenamiento de los datos en una lista local (simulación).
- Visualización de los datos almacenados en tiempo real mediante un `RecyclerView`.

---

## Componentes del Proyecto

### **Clases Java:**
- `LoginActivity.java`: Gestiona el inicio de sesión.
- `Inicio.java`: Pantalla principal de navegación.
- `MainActivity.java`: Implementa la funcionalidad de MQTT.
- `FirebaseActivity.java`: Permite la gestión de datos en Firebase.
- `DataAdapter.java`: Adaptador para el manejo de datos en la vista de Firebase.
- `MqttHandler.java`: Clase utilitaria para manejar las conexiones MQTT.

### **Archivos XML:**
- `activity_login.xml`: Interfaz del login.
- `activity_main.xml`: Interfaz de la funcionalidad MQTT.
- `activity_firebase.xml`: Interfaz de la funcionalidad Firebase.
- `activity_inicio.xml`: Pantalla principal.
- Colores y estilos: Configuración básica para una interfaz sencilla y funcional.

---

## Características Técnicas

### **Conexión MQTT:**
- Suscripción a un tópico.
- Publicación de mensajes.
- Recepción de mensajes en tiempo real.

### **Interfaz Gráfica:**
- Navegación simple entre actividades.
- Uso de `RecyclerView` para listas dinámicas.

### **Login:**
- Validación de credenciales estática (puede mejorarse conectándola a un backend).

---

## Instrucciones de Configuración

1. Clonar o descargar el repositorio del proyecto.
2. Importar el proyecto en Android Studio.
3. Asegurarse de tener configuradas las dependencias en `build.gradle`:
    ```gradle
    implementation 'org.eclipse.paho:org.eclipse.paho.client.mqttv3:1.2.5'
    ```
4. Ejecutar la aplicación en un dispositivo o emulador Android.

---

## Pruebas

En este apartado se documentarán las pruebas realizadas en la aplicación. 

| **Funcionalidad**       | **Descripción**                                   | **Captura de Pantalla**                  |
|--------------------------|--------------------------------------------------|------------------------------------------|
| Login                   | Prueba de acceso con credenciales válidas.       | ![Login Correcto] (![image](https://github.com/user-attachments/assets/58897230-cd60-461f-a1e3-71456cf26ae1)
)  |
| Login                   | Manejo de credenciales incorrectas.              | ![Login Incorrecto] (![image](https://github.com/user-attachments/assets/a96a414d-8846-4b86-b0f5-9927021c5cc6)
)|
| Navegación              | Transición entre pantallas, la cual nos permitira el poder elegir si utilizar el MQTT para enviar datos o el Firebase.                      | ![Navegación] (![image](https://github.com/user-attachments/assets/c25d0c52-b759-4f97-9971-84db12d746ed)
)      |
| Conexión MQTT           | Publicación y recepción de mensajes, en este apartado se realizaron diferentes pruebas, enviando datos desde la app hacia el MQTT y del MQTT para que la app la reciba.             | ![MQTT] (![image](https://github.com/user-attachments/assets/4120b5e6-6777-4ace-bae6-2ad10e3d6bcf) 
[Datos de app a MQTT] (![image](https://github.com/user-attachments/assets/3ba0a958-43ca-4af7-ab1d-ce4f030b8ded)
[Datos de MQTT a app] (![image](https://github.com/user-attachments/assets/07951e44-a087-4bb8-880f-e153736bb632)
)
)
)            |
| Integración Firebase    | Almacenamiento y visualización de datos, como se dijo anteriormente, en esta parte de la conexion tuve bastantes errores, los cuales no me permitieron continuar, hice todos los pasos apra la conexion del firebase, cree el proyecto, su database, agregue sus dependencias pero no me dejo por ende como solucion, simule los datos de forma local, haciendo su xml y s logica, adjunte de igual manera la evidencia de el intento xD.         | ![Firebase](![image](https://github.com/user-attachments/assets/3e64ce38-a6a4-4401-9862-3d1aa0330d6f)
[Creacion de proyecto] (![image](https://github.com/user-attachments/assets/543e3c09-51cd-4df9-8122-fe2c1d6a7b6e)
[Creacion de SDK] (![image](https://github.com/user-attachments/assets/93953964-1a5b-4d30-aae6-f73a18e77760)
[Creacion de DataBase] (![image](https://github.com/user-attachments/assets/ace6b04d-d8e5-45ef-98da-95ed46f0af22)
[Reglas] (![image](https://github.com/user-attachments/assets/aa93d48f-0d55-4e97-a514-31ecfaeb7bca)
|

---

## Mejoras Futuras

1. **Integración Completa con Firebase:**
   - Almacenamiento y recuperación de datos en tiempo real.
2. **Sistema de Usuarios:**
   - Implementar Firebase Authentication para credenciales dinámicas.
3. **UI/UX Mejorado:**
   - Añadir animaciones y mejorar la estética de la interfaz.
4. **Optimización de MQTT:**
   - Manejo de reconexiones automáticas y validación de errores en tiempo real.

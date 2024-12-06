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
| Navegación              | Transición entre pantallas.                      | ![Navegación] (![image](https://github.com/user-attachments/assets/c25d0c52-b759-4f97-9971-84db12d746ed)
)      |
| Conexión MQTT           | Publicación y recepción de mensajes.             | ![Ingresamos datos desde la app para enviar al MQTT] (![image](https://github.com/user-attachments/assets/4120b5e6-6777-4ace-bae6-2ad10e3d6bcf)
)            |
| Integración Firebase    | Almacenamiento y visualización de datos.         | ![Firebase](ruta/a/la/imagen.png)        |

**Nota:** Reemplace `ruta/a/la/imagen.png` con la ruta o URL correspondiente a cada captura de pantalla.

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

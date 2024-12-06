# Proyecto Android: Integración MQTT y Simulación Firebase

## **Descripción General**
Este proyecto es una aplicación Android que integra **MQTT** para comunicación en tiempo real y una simulación de Firebase para manejo local de datos.  
*Nota: Debido a problemas con la conexión a Firebase, los datos se gestionan de manera local.*

## **Estructura del Proyecto**

### **Inicio (Activity Principal)**
- Pantalla principal con dos botones que redirigen a:
    - **Funcionalidad MQTT**
    - **Simulación Firebase**
- Implementación de navegación mediante **Intents**.

---

### **Funcionalidad de Login**
- Validación de usuario y contraseña estáticos:
    - Usuario: `admin`
    - Contraseña: `1234`
- Si la autenticación es exitosa, redirige al menú principal (**Inicio**).

---

### **Integración MQTT (MainActivity)**
- Configuración de conexión con un broker público: `tcp://broker.emqx.io:1883`.
- Funcionalidades:
    - **Publicación** de mensajes a un tópico (`test/topic`).
    - **Recepción** de mensajes en tiempo real desde el tópico suscrito.
- Uso de la librería **Paho MQTT** para manejar las conexiones.

---

### **Simulación Firebase (FirebaseActivity)**
- **Captura de datos**:
    - Los usuarios ingresan datos a través de un campo de texto (`EditText`).
- **Almacenamiento local**:
    - Los datos se gestionan mediante una lista local (en futuras mejoras podría conectarse directamente a Firebase).
- **Visualización dinámica**:
    - Los datos se muestran en un `RecyclerView` con un diseño sencillo y funcional.

---

### **Adaptador de Datos (DataAdapter)**
- Clase encargada de gestionar y mostrar los datos almacenados en el `RecyclerView` de la simulación de Firebase.

---

## **Componentes del Proyecto**

### **Clases Java**
1. **LoginActivity.java**: Gestiona el inicio de sesión.
2. **Inicio.java**: Pantalla principal de navegación.
3. **MainActivity.java**: Implementa la funcionalidad de MQTT.
4. **FirebaseActivity.java**: Manejo y visualización de datos en la simulación Firebase.
5. **DataAdapter.java**: Adaptador para mostrar la lista de datos.
6. **MqttHandler.java**: Clase utilitaria para manejar las conexiones MQTT.

---

### **Archivos XML**
- **activity_login.xml**: Diseño de la pantalla de inicio de sesión.
- **activity_main.xml**: Interfaz de la funcionalidad MQTT.
- **activity_firebase.xml**: Interfaz de la simulación Firebase.
- **activity_inicio.xml**: Diseño del menú principal.
- **colores y estilos**: Configuración básica para una UI limpia y funcional.

---

## **Características Técnicas**

### **Conexión MQTT**
- **Suscripción** a un tópico.
- **Publicación** de mensajes.
- **Recepción** en tiempo real.

---

### **Interfaz Gráfica**
- Navegación simple e intuitiva entre actividades.
- Uso de `RecyclerView` para listas dinámicas.

---

### **Login**
- Validación de credenciales estática (puede mejorarse mediante un backend o Firebase Authentication).

---

## **Instrucciones de Configuración**

1. Clonar o descargar el repositorio del proyecto.
2. Importar el proyecto en **Android Studio**.
3. Asegurarse de incluir la dependencia de MQTT en `build.gradle`:
   ```gradle
   implementation 'org.eclipse.paho:org.eclipse.paho.client.mqttv3:1.2.5'

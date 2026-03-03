# Sistema Solar App - Práctica 1 Móviles

Este proyecto es un explorador interactivo del Sistema Solar desarrollado para Android. La aplicación utiliza un diseño moderno basado en **Glassmorphism**, ofreciendo una experiencia visual inmersiva para navegar entre los planetas, sus lunas y la galaxia.

## Actividades (Activities)

La aplicación se estructura en tres actividades principales:

* **MainActivity (Explorador de Planetas):** Es el núcleo de la app. Muestra una lista dinámica de los 8 planetas del sistema solar. Presenta una ilustración central del planeta seleccionado y una tarjeta con diseño de "cristal" que detalla su distancia al Sol y características breves.
* **LunasActivity (Satélites Naturales):** Esta interfaz se activa mediante el botón "VER LUNAS". Muestra información resumida sobre los satélites más representativos (como la Luna, Ganímedes o Titán) manteniendo la coherencia visual del proyecto.
* **GalaxiaActivity (Vía Láctea):** Proporciona una visión macroscópica de nuestro lugar en el universo. Detalla datos técnicos sobre la Vía Láctea, como su tipo, tamaño y el agujero negro central Sagitario A*.

## Ciclo de Vida y Transiciones de Android

El manejo del flujo de la aplicación se optimizó utilizando los principios del ciclo de vida de Android:

1.  **Manejo de la Pila (Backstack):** Se utilizaron los flags `Intent.FLAG_ACTIVITY_CLEAR_TOP` y `Intent.FLAG_ACTIVITY_NEW_TASK` para la navegación hacia la `GalaxiaActivity`. Esto asegura que el flujo de usuario sea limpio, evitando que al presionar "atrás" se regrese a pantallas de navegación intermedia de forma infinita.
2.  **Gestión de Recursos:** Se implementó el método `finish()` en transiciones críticas. Esto garantiza que las actividades que ya no son necesarias se destruyan correctamente, liberando memoria y optimizando el rendimiento del dispositivo.
3.  **Intents Explícitos:** La comunicación entre las pantallas se maneja mediante `Intents` explícitos dentro de los escuchadores de clics (`setOnClickListener`), asegurando una navegación robusta y directa.






## Cómo ejecutar la aplicación

Para poner en marcha el proyecto en tu entorno local:

1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/HARUSITA/Practica1_Moviles.git](https://github.com/HARUSITA/Practica1_Moviles.git)
    ```
2.  **Importar en Android Studio:** Abre el proyecto y permite que Gradle sincronice las dependencias (necesitas conexión a internet).
3.  **Configuración del dispositivo:**
    * Conecta un dispositivo físico con la Depuración USB activada.
    * O bien, utiliza un Emulador con API 30 o superior.
4.  **Ejecutar:** Haz clic en el botón **Run** (ícono verde de reproducción) en la barra de herramientas superior.


**Desarrollado por:** HARUSITA, Emilia y Saeed  
**Institución:** Escuela Superior de Cómputo (ESCOM - IPN)






**Capturas de pantalla de Claudia Emilia Ramirez**
**Android Studio**
<img width="1919" height="1133" alt="image" src="https://github.com/user-attachments/assets/1583d8e6-ebf5-4784-a048-bd0a34c2876d" />
**Github y Docker**
<img width="1444" height="1128" alt="image" src="https://github.com/user-attachments/assets/f361380e-ef95-42f6-aea5-b1b31fe82083" />




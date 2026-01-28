# Conversor de Monedas 💱

Aplicación de consola en Java que permite convertir entre diferentes monedas utilizando tasas de cambio en tiempo real.

## Descripción

Este proyecto consume la API de [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener las tasas de cambio actualizadas y realizar conversiones entre:

- Dólar estadounidense (USD)
- Peso argentino (ARS)
- Real brasileño (BRL)
- Peso colombiano (COP)
- Peso mexicano (MXN)

## Características

- ✅ Conversión de monedas en tiempo real
- ✅ Menú interactivo en consola
- ✅ Validación de entradas del usuario
- ✅ Manejo de errores y excepciones
- ✅ Resultados formateados con 3 decimales

## Requisitos Previos

- Java 11 o superior
- Librería Gson 2.13.2
- Conexión a Internet
- API key de ExchangeRate-API

## Configuración

### 1. Obtener API Key

1. Visita [ExchangeRate-API](https://www.exchangerate-api.com/)
2. Regístrate para obtener tu API key gratuita
3. Copia tu API key

### 2. Configurar el proyecto

1. Clona este repositorio:
```bash
git clone https://github.com/AbrahamPS-es/DesafioConversorDeDivisas.git
```

2. Crea un archivo `config.properties` en la raíz del proyecto:
```properties
api.key=TU_API_KEY_AQUI
```

3. Descarga la librería [Gson 2.13.2](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.13.2/gson-2.13.2.jar) y agrégala al proyecto

## Uso

1. Ejecuta la clase `Principal.java`
2. Selecciona una opción del menú (1-8)
3. Ingresa el monto a convertir
4. Visualiza el resultado
5. Selecciona opción 9 para salir

## Estructura del Proyecto
```
conversor-monedas/
├── src/
│   ├── modelos/
│   │   ├── ConsultaApiExchange.java
│   │   ├── Conversion.java
│   │   ├── MenuPrincipal.java
│   │   └── RespuestaApi.java
│   └── principal/
│       └── Principal.java
├── config.properties (no incluido - debes crearlo)
└── README.md
```

## Tecnologías Utilizadas

- Java
- Gson (para manejo de JSON)
- ExchangeRate-API

## Notas

- El archivo `config.properties` no está incluido en el repositorio.
- Asegúrate de no compartir tu API key públicamente